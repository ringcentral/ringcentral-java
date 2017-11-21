package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ForwardingNumberResource
{
    //
    public String uri;
    public ForwardingNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public ForwardingNumberResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String phoneNumber;
    public ForwardingNumberResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String label;
    public ForwardingNumberResource label(String label) {
        this.label = label;
        return this;
    }
    //
    public String[] features;
    public ForwardingNumberResource features(String[] features) {
        this.features = features;
        return this;
    }
    //
    public String flipNumber;
    public ForwardingNumberResource flipNumber(String flipNumber) {
        this.flipNumber = flipNumber;
        return this;
    }
}
