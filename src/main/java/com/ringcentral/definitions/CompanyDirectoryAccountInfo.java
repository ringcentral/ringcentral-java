package com.ringcentral.definitions;


// Account data of an extension
public class CompanyDirectoryAccountInfo {
    /**
     * Internal identifier of an account
     */
    public String id;

    public CompanyDirectoryAccountInfo id(String id) {
        this.id = id;
        return this;
    }
}
