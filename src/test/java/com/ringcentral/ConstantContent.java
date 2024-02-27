package com.ringcentral;

import com.ringcentral.definitions.CreateBridgeRequest;
import com.ringcentral.definitions.UpdateBridgeRequest;

public class ConstantContent {

    public static CreateBridgeRequest createBridgeRequest(){
        CreateBridgeRequest createBridgeRequest=new CreateBridgeRequest();
        createBridgeRequest.name("RC Video Test");
        createBridgeRequest.type("Instant");
        return createBridgeRequest;
    }

    public static UpdateBridgeRequest updateBridgeRequest(){
        UpdateBridgeRequest updateBridgeRequest=new UpdateBridgeRequest().name("Update RC Video Test");
        return  updateBridgeRequest;
    }
}
