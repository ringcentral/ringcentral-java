package com.ringcentral;

import com.ringcentral.definitions.CallerInfo;
import com.ringcentral.definitions.SubscriptionInfo;
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

    public void sendSms() throws IOException, RestException {
        String result = restClient.post("/restapi/v1.0/account/~/extension/~/sms", new com.ringcentral.paths.sms.PostParameters(
            new CallerInfo(config.get("username")),
            new CallerInfo[]{new CallerInfo(config.get("receiver"))},
            "hello world"));
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
        verify(consumer).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
    }

    @Test
    public void testRefresh() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            consumer);
        subscription.subscribe();
        Thread.sleep(3000);
        subscription.refresh();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer).accept(argument.capture());
        assertTrue(argument.getValue().contains("uuid"));
    }

    @Test
    public void testRevoke() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/message-store"},
            consumer);
        subscription.subscribe();
        Thread.sleep(3000);
        subscription.revoke();
        Thread.sleep(3000);
        sendSms();
        Thread.sleep(16000);
        verify(consumer, never()).accept(any());
    }
}
