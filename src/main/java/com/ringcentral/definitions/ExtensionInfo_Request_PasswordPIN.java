package com.ringcentral.definitions;

public class ExtensionInfo_Request_PasswordPIN {
    // Password for extension
    public String password;
    // IVR PIN
    public String ivrPin;

    public ExtensionInfo_Request_PasswordPIN password(String password) {
        this.password = password;
        return this;
    }

    public ExtensionInfo_Request_PasswordPIN ivrPin(String ivrPin) {
        this.ivrPin = ivrPin;
        return this;
    }
}
