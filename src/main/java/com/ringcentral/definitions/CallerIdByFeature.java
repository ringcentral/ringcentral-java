package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CallerIdByFeature
{
    //
    public String feature;
    public CallerIdByFeature feature(String feature) {
        this.feature = feature;
        return this;
    }
    //
    public CallerIdByFeatureInfo callerId;
    public CallerIdByFeature callerId(CallerIdByFeatureInfo callerId) {
        this.callerId = callerId;
        return this;
    }
}
