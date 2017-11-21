package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdatePresenceLinesRequest
{
    //
    public PresenceLineInfo[] records;
    public UpdatePresenceLinesRequest records(PresenceLineInfo[] records) {
        this.records = records;
        return this;
    }
}
