package com.ringcentral;

import com.alibaba.fastjson.JSON;
import com.ringcentral.definitions.GlipNotification;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.io.IOException;
import java.util.function.Consumer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GlipTest extends BaseTest {
    public String sendMessage() throws IOException, RestException {
        return restClient.post("/restapi/v1.0/glip/posts",
            new com.ringcentral.paths.glip.post.PostParameters(config.get("glip_group"), "hello world"));
    }

    @Test
    public void testPostMessage() throws IOException, RestException {
        String result = sendMessage();
        assertEquals(true, result.contains("hello world"));
    }

    @Test
    public void testGroups() throws IOException, RestException {
        String result = restClient.get("/restapi/v1.0/glip/groups");
        assertEquals(true, result.contains("records"));
    }

    @Test
    public void testReceiveMessage() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/account/~/extension/~/glip/posts"},
            consumer
        );
        subscription.subscribe();
        Thread.sleep(8000);
        sendMessage();
        Thread.sleep(16000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer).accept(argument.capture());
        String jsonString = argument.getValue();
        assertTrue(jsonString.contains("hello world"));
        GlipNotification glipNotification = JSON.parseObject(jsonString, GlipNotification.class);
        assertEquals("hello world", glipNotification.body.text);
    }
}
