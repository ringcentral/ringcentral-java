package com.ringcentral;

import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import com.ringcentral.definitions.SubscriptionInfo;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class SubscriptionTest {
    @Test
    public void testSubscribe() throws IOException, RestException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                (jsonString) -> {
                }
        );
        subscription.subscribe();
        SubscriptionInfo sub = subscription.getSubscription();
        assertEquals("Active", sub.status);

        rc.revoke();
    }

    private void sendSms() throws IOException, RestException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        rc.restapi().account().extension().sms().post(
                new CreateSMSMessage()
                        .text("hello world")
                        .from(new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_USERNAME")))
                        .to(new MessageStoreCallerInfoRequest[]{
                                new MessageStoreCallerInfoRequest().phoneNumber(System.getenv("RINGCENTRAL_RECEIVER"))
                        })
        );

        rc.revoke();
    }

    @Test
    public void testNotification() throws IOException, RestException, InterruptedException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                consumer);
        subscription.subscribe();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer, atLeastOnce()).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
        subscription.revoke();

        rc.revoke();
    }

    @Test
    public void testRefresh() throws IOException, RestException, InterruptedException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                consumer);
        subscription.refresh(); // should not cause any issue when _subscription is null
        subscription.subscribe();
        Thread.sleep(3000);
        subscription.refresh();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer, atLeastOnce()).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
        subscription.revoke();

        rc.revoke();
    }

    @Test
    public void testRevoke() throws IOException, RestException, InterruptedException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                consumer);
        subscription.revoke(); // should not cause any issue when _subscription is null
        subscription.subscribe();
        Thread.sleep(1000);
        subscription.revoke();
        Thread.sleep(1000);
        sendSms();
        Thread.sleep(16000);
        verify(consumer, never()).accept(any());

        rc.revoke();
    }

    @Test
    public void testStatusCallback() throws IOException, RestException, InterruptedException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        final Consumer<String> consumer1 = mock(Consumer.class);
        final Consumer<PNStatus> consumer2 = mock(Consumer.class);
        final Consumer<PNPresenceEventResult> consumer3 = mock(Consumer.class);
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                consumer1, consumer2, consumer3);
        subscription.subscribe();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<PNStatus> argument = ArgumentCaptor.forClass(PNStatus.class);
        verify(consumer2, atLeastOnce()).accept(argument.capture());
        assertEquals(argument.getValue().getStatusCode(), 200);
        subscription.revoke();

        rc.revoke();
    }

    @Test
    public void testAutoRefresh() throws IOException, RestException, InterruptedException {
        RestClient rc = new RestClient(
                System.getenv("RINGCENTRAL_CLIENT_ID"),
                System.getenv("RINGCENTRAL_CLIENT_SECRET"),
                System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(
                System.getenv("RINGCENTRAL_USERNAME"),
                System.getenv("RINGCENTRAL_EXTENSION"),
                System.getenv("RINGCENTRAL_PASSWORD")
        );

        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = new Subscription(rc,
                new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
                consumer);
        subscription.subscribe();
        SubscriptionInfo subInfo = subscription.getSubscription();
        subInfo.expiresIn = 123L;
        subscription.setSubscription(subInfo);
        Thread.sleep(6000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer, atLeastOnce()).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
        subscription.revoke();

        rc.revoke();
    }
}
