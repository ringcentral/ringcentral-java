package com.ringcentral;

import com.ringcentral.definitions.ContactInfoCreationRequest;
import com.ringcentral.definitions.ExtensionCreationRequest;
import com.ringcentral.definitions.ExtensionCreationResponse;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class ProvisionExtensionsTest {
    @Test
    public void CreateAndDeleteExtension() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        rc.httpEventListeners.add((response, request) -> {
            String message = Utils.formatHttpMessage(response, request);
        });

        ExtensionCreationResponse extensionCreationResponse = rc.restapi().account().extension().post(new ExtensionCreationRequest()
            .extensionNumber("808").contact(new ContactInfoCreationRequest()
                .email("a1b23c4d@example.com").firstName("First").lastName("Last")
            )
            .type("User")
        );
        assertNotNull(extensionCreationResponse);

        // delete endpoint is deprecated, so we have to type string endpoint instead
        String str = rc.delete("/restapi/v1.0/account/~/extension/" + extensionCreationResponse.id.toString()).string();
        assertNotNull(str);

        rc.revoke();
    }
}
