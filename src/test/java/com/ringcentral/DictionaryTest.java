package com.ringcentral;

import com.ringcentral.definitions.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class DictionaryTest {
    private RestClient rc;

    @Before
    public void setUp() throws RestException, IOException {
        rc = new RestClient(System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL"));
        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));

    }

    @After
    public void revokeAccessToken() throws RestException, IOException {
        rc.revoke();

    }

    @Test
    public void testGetCountry() throws IOException, RestException {

        CountryInfoDictionaryModel c =
            rc.restapi().dictionary().country("46").get();
        Assert.assertEquals("China", c.name);
    }

    @Test
    public void testListCountry() throws IOException, RestException {
        CountryListDictionaryModel r =
            rc.restapi().dictionary().country().list();
        Assert.assertTrue(r.records.length > 0);
    }

    @Test
    public void testListState() throws RestException, IOException {
        GetStateListResponse getStateListResponse =
            rc.restapi().dictionary().state().list();
        Assert.assertTrue(getStateListResponse.records.length > 0);
    }

    @Test
    public void testGetState() throws RestException, IOException {
        GetStateInfoResponse getStateInfoResponse =
            rc.restapi().dictionary().state("13").get();
        Assert.assertEquals("Alaska", getStateInfoResponse.name);
    }

    @Test
    public void testlistTimeZone() throws RestException, IOException {
        GetTimezoneListResponse
            getTimezoneListResponse =
            rc.restapi().dictionary().timezone().list();
        Assert.assertTrue(getTimezoneListResponse.records.length > 0);

    }

    @Test
    public void testGetTimeZone() throws RestException, IOException {
        GetTimezoneInfoResponse getTimezoneInfoResponse =
            rc.restapi().dictionary().timezone("2").get();
        Assert.assertEquals("Europe/Lisbon", getTimezoneInfoResponse.name);
    }

    @Test
    public void testlistUserRole() throws RestException, IOException {

        RolesCollectionResource rolesCollectionResource =
            rc.restapi().dictionary().userRole().list();
        Assert.assertTrue(rolesCollectionResource.records.length > 0);

    }

    @Test
    public void testGetUserRole() throws RestException, IOException {
        RoleResource roleResource =
            rc.restapi().dictionary().userRole("8").get();
        Assert.assertEquals("Manager", roleResource.displayName);
    }

    @Test
    public void testlistPermission() throws RestException, IOException {


        PermissionCollectionResource
            permissionCollectionResource =
            rc.restapi().dictionary().permission().list();
        Assert.assertTrue(permissionCollectionResource.records.length > 0);

    }

    @Test
    public void testGetPermission() throws RestException, IOException {
        PermissionResource permissionResource =
            rc.restapi().dictionary().permission("AccountAdministration").get();
        Assert.assertEquals("Account Administration",
            permissionResource.displayName);
    }

    @Test
    public void testlistPermissionCategory() throws RestException, IOException {


        PermissionCategoryCollectionResource
            permissionCategoryCollectionResource =
            rc.restapi().dictionary().permissionCategory().list();
        Assert.assertTrue(
            permissionCategoryCollectionResource.records.length > 0);

    }

    @Test
    public void testGetPermissionCategory() throws RestException, IOException {
        PermissionCategoryResource permissionCategoryResource =
            rc.restapi().dictionary().permissionCategory("Analytics").get();
        Assert.assertEquals("Analytics",
            permissionCategoryResource.displayName);
    }

    @Test
    public void testListLanguage() throws RestException, IOException {
        LanguageList
            languageList = rc.restapi().dictionary().language().list();
        Assert.assertTrue(languageList.records.length > 0);

    }

    @Test
    public void testGetLanguage() throws RestException, IOException {
        LanguageInfo languageInfo =
            rc.restapi().dictionary().language("1041").get();
        Assert.assertEquals("Japanese", languageInfo.name);
    }

    @Test
    public void testListGreeting() throws RestException, IOException {
        DictionaryGreetingList
            dictionaryGreetingList =
            rc.restapi().dictionary().greeting().list();
        Assert.assertTrue(dictionaryGreetingList.records.length > 0);

    }

    @Test
    public void testGetGreeting() throws RestException, IOException {
        DictionaryGreetingInfo dictionaryGreetingInfo =
            rc.restapi().dictionary().greeting("66320").get();
        Assert.assertEquals("World", dictionaryGreetingInfo.name);
    }
}
