package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class StatusInfo
{
    //
    public String reason;
    public StatusInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
    //
    public String till;
    public StatusInfo till(String till) {
        this.till = till;
        return this;
    }
    //
    public String comment;
    public StatusInfo comment(String comment) {
        this.comment = comment;
        return this;
    }
}
