package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ConferencingInfoResource
{
    //
    public String uri;
    public ConferencingInfoResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String phoneNumber;
    public ConferencingInfoResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    //
    public String hostCode;
    public ConferencingInfoResource hostCode(String hostCode) {
        this.hostCode = hostCode;
        return this;
    }
    //
    public String participantCode;
    public ConferencingInfoResource participantCode(String participantCode) {
        this.participantCode = participantCode;
        return this;
    }
    //
    public Boolean allowJoinBeforeHost;
    public ConferencingInfoResource allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
        this.allowJoinBeforeHost = allowJoinBeforeHost;
        return this;
    }
    //
    public String tapToJoinUri;
    public ConferencingInfoResource tapToJoinUri(String tapToJoinUri) {
        this.tapToJoinUri = tapToJoinUri;
        return this;
    }
    //
    public String supportUri;
    public ConferencingInfoResource supportUri(String supportUri) {
        this.supportUri = supportUri;
        return this;
    }
    //
    public String mode;
    public ConferencingInfoResource mode(String mode) {
        this.mode = mode;
        return this;
    }
    //
    public ConferencingNumberResource[] phoneNumbers;
    public ConferencingInfoResource phoneNumbers(ConferencingNumberResource[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}
