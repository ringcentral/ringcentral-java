package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class FaxCountryInfo
{
    // Internal identifier of a home country
    public String id;
    public FaxCountryInfo id(String id) {
        this.id = id;
        return this;
    }
    // Country code in ISO 3166-1 alpha-2. If specified then country ID cannot be specified
    public String isoCode;
    public FaxCountryInfo isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }
}
