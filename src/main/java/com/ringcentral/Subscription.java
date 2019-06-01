package com.ringcentral;

import com.pubnub.api.PNConfiguration;
import com.pubnub.api.PubNub;
import com.pubnub.api.callbacks.SubscribeCallback;
import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNMessageResult;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.ringcentral.definitions.CreateSubscriptionRequest;
import com.ringcentral.definitions.ModifySubscriptionRequest;
import com.ringcentral.definitions.NotificationDeliveryModeRequest;
import com.ringcentral.definitions.SubscriptionInfo;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Collections;
import java.util.Timer;
import java.util.TimerTask;
import java.util.function.Consumer;

public class Subscription {
    private String[] events;
    private RestClient restClient;
    private SubscribeCallback callback;
    private SubscriptionInfo _subscription;
    private Timer timer;
    private PubNub pubnub;

    Subscription(RestClient restClient, String[] events, Consumer<String> messageCallback, Consumer<PNStatus> statusCallback, Consumer<PNPresenceEventResult> presenceCallback) {
        this.restClient = restClient;
        this.events = events;
        callback = new SubscribeCallback() {
            @Override
            public void status(PubNub pubNub, PNStatus pnStatus) {
                if (statusCallback != null) {
                    statusCallback.accept(pnStatus);
                }
            }

            @Override
            public void presence(PubNub pubNub, PNPresenceEventResult pnPresenceEventResult) {
                if (presenceCallback != null) {
                    presenceCallback.accept(pnPresenceEventResult);
                }
            }

            @Override
            public void message(PubNub pubNub, PNMessageResult pnMessageResult) {
                byte[] encrypted = Base64.getDecoder().decode(pnMessageResult.getMessage().getAsString());
                final byte[] encryptionKey = Base64.getDecoder().decode(getSubscription().deliveryMode.encryptionKey);
                Cipher cipher;
                byte[] decrypted;
                try {
                    cipher = Cipher.getInstance("AES/ECB/NoPadding");
                    cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(encryptionKey, "AES"));
                    decrypted = cipher.doFinal(encrypted);
                } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | BadPaddingException | IllegalBlockSizeException e) {
                    e.printStackTrace();
                    return;
                }
                String jsonString = new String(decrypted, StandardCharsets.UTF_8);
                messageCallback.accept(jsonString);
            }
        };
    }

    Subscription(RestClient restClient, String[] eventFilters, Consumer<String> callback) {
        this(restClient, eventFilters, callback, null, null);
    }

    public SubscriptionInfo getSubscription() {
        return _subscription;
    }

    void setSubscription(SubscriptionInfo subscription) {
        _subscription = subscription;
        if (timer != null) {
            timer.cancel();
            timer = null;
        }
        if (subscription != null) {
            timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    refresh();
                }
            }, (subscription.expiresIn - 120) * 1000);
        }
    }

    public void subscribe(){
        SubscriptionInfo subscriptionInfo = restClient.restapi().subscription().post(getPostParameters());
        setSubscription(subscriptionInfo);
        PNConfiguration pnConfiguration = new PNConfiguration();
        pnConfiguration.setSubscribeKey(getSubscription().deliveryMode.subscriberKey);
        pubnub = new PubNub(pnConfiguration);
        pubnub.addListener(callback);
        pubnub.subscribe().channels(Collections.singletonList(getSubscription().deliveryMode.address)).execute();
    }

    public void refresh() {
        if (getSubscription() == null) {
            return;
        }
        SubscriptionInfo subscriptionInfo = restClient.restapi().subscription(getSubscription().id).put(getPutParameters());
        setSubscription(subscriptionInfo);

    }

    public void revoke() throws IOException, RestException {
        if (getSubscription() == null) {
            return;
        }
        pubnub.unsubscribe().channels(Collections.singletonList(getSubscription().deliveryMode.address)).execute();
        pubnub.removeListener(callback);
        pubnub = null;
        restClient.restapi().subscription(getSubscription().id).delete();
        setSubscription(null);
    }

    private CreateSubscriptionRequest getPostParameters() {
        return new CreateSubscriptionRequest()
                .deliveryMode(new NotificationDeliveryModeRequest().transportType("PubNub").encryption(true))
                .eventFilters(events);
    }

    private ModifySubscriptionRequest getPutParameters() {
        return new ModifySubscriptionRequest()
                .deliveryMode(new NotificationDeliveryModeRequest().transportType("PubNub").encryption(true))
                .eventFilters(events);
    }
}