package com.ringcentral.definitions;


public class ExtensionPermissionsResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public Permission admin;
    /**
     *
     */
    public Permission internationalCalling;
    /**
     *
     */
    public Permission freeSoftPhoneDigitalLine;

    public ExtensionPermissionsResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionPermissionsResource admin(Permission admin) {
        this.admin = admin;
        return this;
    }

    public ExtensionPermissionsResource internationalCalling(Permission internationalCalling) {
        this.internationalCalling = internationalCalling;
        return this;
    }

    public ExtensionPermissionsResource freeSoftPhoneDigitalLine(Permission freeSoftPhoneDigitalLine) {
        this.freeSoftPhoneDigitalLine = freeSoftPhoneDigitalLine;
        return this;
    }

}
