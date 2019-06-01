package com.ringcentral.definitions;


public class FavoriteContactResource {
    /**
     *
     */
    public String uri;
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
    public String contactId;

    public FavoriteContactResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public FavoriteContactResource id(String id) {
        this.id = id;
        return this;
    }

    public FavoriteContactResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public FavoriteContactResource contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }

}
