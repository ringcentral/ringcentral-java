package com.ringcentral;

import com.ringcentral.definitions.*;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ProvisionExtensionsTest {
    @Test
    public void CreateAndDeleteExtension() throws IOException, RestException {
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

        ExtensionCreationResponse extensionCreationResponse = rc.restapi().account().extension().post(new ExtensionCreationRequest()
        .extensionNumber("808").contact(new ContactInfoCreationRequest()
               .email("a1b23c4d@example.com").firstName("First").lastName("Last")
           )
            .type("User")
       );

        rc.httpEventListeners.add(new HttpEventListener() {
            @Override
            public void afterHttpCall(Response response, Request request) {
                String message = Utils.formatHttpMessage(response, request);
            }
        });

        String r = rc.restapi().account().extension(extensionCreationResponse.id.toString()).delete();

        rc.revoke();
    }
}
