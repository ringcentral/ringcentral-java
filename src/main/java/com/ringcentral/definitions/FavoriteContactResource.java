package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FavoriteContactResource
{
    //
    public String uri;
    public FavoriteContactResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String id;
    public FavoriteContactResource id(String id) {
        this.id = id;
        return this;
    }
    //
    public String extensionId;
    public FavoriteContactResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String contactId;
    public FavoriteContactResource contactId(String contactId) {
        this.contactId = contactId;
        return this;
    }
}
