package com.ringcentral;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UrlBuilderTest extends BaseTest {
    @Test
    public void TestRestApi() {
        String endpoint = restClient.restApi("v1.0").endpoint();
        assertEquals("/restapi/v1.0", endpoint);

        endpoint = restClient.restApi(null).endpoint();
        assertEquals("/restapi", endpoint);

        endpoint = restClient.restApi().endpoint();
        assertEquals("/restapi/v1.0", endpoint);
    }

    @Test
    public void TestAccount() {
        String endpoint = restClient.restApi("v1.0").account().endpoint();
        assertEquals("/restapi/v1.0/account/~", endpoint);

        endpoint = restClient.restApi("v1.0").account(null).endpoint();
        assertEquals("/restapi/v1.0/account", endpoint);

        endpoint = restClient.restApi("v1.0").account("~").endpoint();
        assertEquals("/restapi/v1.0/account/~", endpoint);
    }

    @Test
    public void TestSms() {
        String endpoint = restClient.restApi().account().extension().sms().endpoint();
        assertEquals("/restapi/v1.0/account/~/extension/~/sms", endpoint);
    }

}
