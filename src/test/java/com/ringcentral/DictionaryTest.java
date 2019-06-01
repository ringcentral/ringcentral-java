package com.ringcentral;

import com.ringcentral.definitions.GetCountryInfoDictionaryResponse;
import com.ringcentral.definitions.GetCountryListResponse;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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
        assertEquals("China", c.name);

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
        assertTrue(r.records.length > 0);

        rc.revoke();
    }
}
