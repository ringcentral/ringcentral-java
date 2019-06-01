package com.ringcentral.definitions;


public class FederationResource {
    /**
     *
     */
    public FederatedAccountResource[] accounts;
    /**
     *
     */
    public String creationTime;
    /**
     *
     */
    public String displayName;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String lastModifiedTime;

    public FederationResource accounts(FederatedAccountResource[] accounts) {
        this.accounts = accounts;
        return this;
    }

    public FederationResource creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public FederationResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public FederationResource id(String id) {
        this.id = id;
        return this;
    }

    public FederationResource lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

}
