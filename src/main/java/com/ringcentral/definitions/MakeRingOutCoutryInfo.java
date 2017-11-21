package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class MakeRingOutCoutryInfo
{
    // Dialing plan country identifier
    public String id;
    public MakeRingOutCoutryInfo id(String id) {
        this.id = id;
        return this;
    }
}
