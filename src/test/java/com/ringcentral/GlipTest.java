package com.ringcentral;

import com.alibaba.fastjson.JSON;
import com.ringcentral.definitions.GlipCreatePost;
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
    private String sendMessage() throws IOException, RestException {
        GlipCreatePost postParameters = new GlipCreatePost();
        postParameters = postParameters.text("hello world");
        return restClient.post("/restapi/v1.0/glip/groups/" + config.get("glip_group") + "/posts", postParameters).string();
    }

    @Test
    public void testPostMessage() throws IOException, RestException {
        String result = sendMessage();
        assertTrue(result.contains("hello world"));
    }

    @Test
    public void testGroups() throws IOException, RestException {
        String result = restClient.get("/restapi/v1.0/glip/groups").string();
        assertTrue(result.contains("records"));
    }

    @Test
    public void testReceiveMessage() throws IOException, RestException, InterruptedException {
        final Consumer<String> consumer = mock(Consumer.class);
        Subscription subscription = restClient.subscription(
            new String[]{"/restapi/v1.0/glip/posts"},
            consumer
        );
        subscription.subscribe();
        Thread.sleep(8000);
        sendMessage();
        Thread.sleep(32000);
        ArgumentCaptor<String> argument = ArgumentCaptor.forClass(String.class);
        verify(consumer).accept(argument.capture());
        String jsonString = argument.getValue();
        assertTrue(jsonString.contains("hello world"));
        GlipNotification glipNotification = JSON.parseObject(jsonString, GlipNotification.class);
        assertEquals("hello world", glipNotification.body.text);
    }
}
