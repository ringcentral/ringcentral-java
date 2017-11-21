package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SmsResource
{
    //
    public CountryResource country;
    public SmsResource country(CountryResource country) {
        this.country = country;
        return this;
    }
    //
    public CallerInfo[] to;
    public SmsResource to(CallerInfo[] to) {
        this.to = to;
        return this;
    }
    //
    public CallerInfo from;
    public SmsResource from(CallerInfo from) {
        this.from = from;
        return this;
    }
    //
    public String text;
    public SmsResource text(String text) {
        this.text = text;
        return this;
    }
}
