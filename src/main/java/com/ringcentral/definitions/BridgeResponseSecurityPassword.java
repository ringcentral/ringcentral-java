package com.ringcentral.definitions;


public class BridgeResponseSecurityPassword {
    /**
     * Meeting password.
     * This field will be returned only if the request was done by bridge owner, his delegate or any user who has
     * the Super Admin privilege.
     * Example: Wq123ygs15
     */
    public String plainText;
    /**
     * Meeting password for PSTN users.
     * This field will be returned only if the request was done by bridge owner, his delegate or any user who has
     * the Super Admin privilege.
     * Example: 7492486829
     */
    public String pstn;
    /**
     * Meeting password hash.
     * This field will be returned only if the request was done by bridge owner, his delegate or any user who has
     * the Super Admin privilege.
     * Example: 99e4f8e6a241fc71279449a9c8f46eef
     */
    public String joinQuery;

    public BridgeResponseSecurityPassword plainText(String plainText) {
        this.plainText = plainText;
        return this;
    }

    public BridgeResponseSecurityPassword pstn(String pstn) {
        this.pstn = pstn;
        return this;
    }

    public BridgeResponseSecurityPassword joinQuery(String joinQuery) {
        this.joinQuery = joinQuery;
        return this;
    }
}
