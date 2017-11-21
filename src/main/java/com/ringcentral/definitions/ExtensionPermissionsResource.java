package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionPermissionsResource
{
    //
    public String uri;
    public ExtensionPermissionsResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public Permission admin;
    public ExtensionPermissionsResource admin(Permission admin) {
        this.admin = admin;
        return this;
    }
    //
    public Permission internationalCalling;
    public ExtensionPermissionsResource internationalCalling(Permission internationalCalling) {
        this.internationalCalling = internationalCalling;
        return this;
    }
    //
    public Permission freeSoftPhoneDigitalLine;
    public ExtensionPermissionsResource freeSoftPhoneDigitalLine(Permission freeSoftPhoneDigitalLine) {
        this.freeSoftPhoneDigitalLine = freeSoftPhoneDigitalLine;
        return this;
    }
}
