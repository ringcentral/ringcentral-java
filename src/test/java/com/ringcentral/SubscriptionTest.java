package com.ringcentral;

import com.pubnub.api.models.consumer.PNStatus;
import com.pubnub.api.models.consumer.pubsub.PNPresenceEventResult;
import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.CreateSMSMessage;
import com.ringcentral.definitions.MessageStoreCallerInfoRequest;
import com.ringcentral.definitions.SubscriptionInfo;
import com.ringcentral.paths.Sms;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

public class SubscriptionTest extends BaseTest {
    @Test
    public void testSubscribe() throws IOException, RestException {
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            (jsonString) -> {
            }
        );
        subscription.subscribe();
        SubscriptionInfo sub = subscription.getSubscription();
        assertEquals("Active", sub.status);
    }

    private void sendSms() throws IOException, RestException {
        CreateSMSMessage postParameters = new CreateSMSMessage();
        postParameters.from = new MessageStoreCallerInfoRequest().phoneNumber(config.get("username"));
        postParameters.to = new MessageStoreCallerInfoRequest[]{new MessageStoreCallerInfoRequest().phoneNumber(config.get("receiver"))};
        postParameters.text = "hello world";
        restClient.post("/restapi/v1.0/account/~/extension/~/sms", postParameters);
    }

    @Test
    public void testNotification() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            consumer);
        subscription.subscribe();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer, atLeastOnce()).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
    }

    @Test
    public void testRefresh() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
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
    }

    @Test
    public void testRevoke() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            consumer);
        subscription.revoke(); // should not cause any issue when _subscription is null
        subscription.subscribe();
        Thread.sleep(3000);
        subscription.revoke();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        verify(consumer, never()).accept(any());
    }

    @Test
    public void testStatusCallback() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer1 = mock(Consumer.class);
        final Consumer<PNStatus> consumer2 = mock(Consumer.class);
        final Consumer<PNPresenceEventResult> consumer3 = mock(Consumer.class);
        Subscription subscription = new Subscription(restClient,
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            consumer1, consumer2, consumer3);
        subscription.subscribe();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<PNStatus> argument = ArgumentCaptor.forClass(PNStatus.class);
        verify(consumer2, atLeastOnce()).accept(argument.capture());
        assertEquals(argument.getValue().getStatusCode(), 200);
    }

    @Test
    public void testAutoRefresh() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
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
    }
}
