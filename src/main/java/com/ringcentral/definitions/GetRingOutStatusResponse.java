package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetRingOutStatusResponse
{
    // Internal identifier of a RingOut call
    public String id;
    public GetRingOutStatusResponse id(String id) {
        this.id = id;
        return this;
    }
    // RingOut status information
    public RingOutStatusInfo status;
    public GetRingOutStatusResponse status(RingOutStatusInfo status) {
        this.status = status;
        return this;
    }
}
