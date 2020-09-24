package com.ringcentral;

import com.ringcentral.definitions.GetCountryInfoDictionaryResponse;
import com.ringcentral.definitions.GetCountryListResponse;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class DictionaryTest {
    @Test
    public void testGetCountry() throws IOException, RestException {
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

        GetCountryInfoDictionaryResponse c = rc.restapi().dictionary().country("46").get();
        Assert.assertEquals("China", c.name);

        rc.revoke();
    }

    @Test
    public void testListCountry() throws IOException, RestException {
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

        GetCountryListResponse r = rc.restapi().dictionary().country().list();
        Assert.assertTrue(r.records.length > 0);

        rc.revoke();
    }
}
