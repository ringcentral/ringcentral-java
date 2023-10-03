package com.ringcentral;

import com.ringcentral.definitions.CallLogResponse;
import com.ringcentral.definitions.ReadUserCallLogParameters;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertNotNull;

public class CallLogTest {
    @Test
    public void listCallLogs() throws IOException, RestException {
        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );

        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

        ReadUserCallLogParameters getParameters = new ReadUserCallLogParameters();

        getParameters.type = new String[]{"Voice"};

        CallLogResponse response = rc.restapi().account().extension().callLog().list(getParameters);

        assertNotNull(response.records);

        rc.revoke();
    }
}
