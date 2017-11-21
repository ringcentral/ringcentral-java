package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CfaSettingsResource
{
    //
    public CfaView[] views;
    public CfaSettingsResource views(CfaView[] views) {
        this.views = views;
        return this;
    }
}
