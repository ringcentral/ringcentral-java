package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FavoriteCollection
{
    //
    public String uri;
    public FavoriteCollection uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public FavoriteContactResource[] records;
    public FavoriteCollection records(FavoriteContactResource[] records) {
        this.records = records;
        return this;
    }
}
