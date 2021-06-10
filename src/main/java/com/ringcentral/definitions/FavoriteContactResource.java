package com.ringcentral.definitions;


public class FavoriteContactResource {
    /**
     * Format: int64
     */
    public Long id;
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

    public FavoriteContactResource id(Long id) {
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
