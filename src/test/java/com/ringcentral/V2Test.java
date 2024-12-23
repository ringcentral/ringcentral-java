package com.ringcentral;

import com.ringcentral.definitions.BulkDeleteUsersRequest;
import com.ringcentral.definitions.BulkOperationExtensionReference;
import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class V2Test {
    @Test
    public void GetAccountInfo() throws IOException, RestException {

        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );
        String path = rc.restapi().v2().accounts().path();
        Assert.assertEquals("/restapi/v2/accounts/~", path);
    }

    @Test
    public void DeleteExt() throws IOException, RestException {

        RestClient rc = new RestClient(
            System.getenv("RINGCENTRAL_CLIENT_ID"),
            System.getenv("RINGCENTRAL_CLIENT_SECRET"),
            System.getenv("RINGCENTRAL_SERVER_URL")
        );
        rc.authorize(System.getenv("RINGCENTRAL_JWT_TOKEN"));
        rc.restapi().v2().accounts().extensions().delete(
            new BulkDeleteUsersRequest().keepAssetsInInventory(false).records(new BulkOperationExtensionReference[]{
                new BulkOperationExtensionReference().id("12345678")
            }));
    }

    @Test
    public void ToJson() throws IOException, RestException {
        BulkDeleteUsersRequest obj = new BulkDeleteUsersRequest().keepAssetsInInventory(false)
            .records(new BulkOperationExtensionReference[]{
                new BulkOperationExtensionReference() {{
                    id = "123456";
                }}
            });
        Assert.assertEquals(false, obj.keepAssetsInInventory);
        Assert.assertEquals(1, obj.records.length);
        Assert.assertEquals("123456", obj.records[0].id);

        String str = Utils.gson.toJson(obj);
        Assert.assertEquals("{\"keepAssetsInInventory\":false,\"records\":[null]}", str);
    }

    @Test
    public void ToJson2() throws IOException, RestException {
        BulkDeleteUsersRequest obj = new BulkDeleteUsersRequest().keepAssetsInInventory(false)
            .records(new BulkOperationExtensionReference[]{
                new BulkOperationExtensionReference().id("123456")
            });
        Assert.assertEquals(false, obj.keepAssetsInInventory);
        Assert.assertEquals(1, obj.records.length);
        Assert.assertEquals("123456", obj.records[0].id);

        String str = Utils.gson.toJson(obj);
        Assert.assertEquals("{\"keepAssetsInInventory\":false,\"records\":[{\"id\":\"123456\"}]}", str);
    }
}
