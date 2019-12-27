package com.ringcentral.definitions;


public class FavoriteContactResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String extensionId;
    /**
     *
     */
    public String accountId;
    /**
     *
     */
    public String contactId;

    public FavoriteContactResource id(String id) {
        this.id = id;
        return this;
    }

    public FavoriteContactResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public FavoriteContactResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public FavoriteContactResource contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

}
