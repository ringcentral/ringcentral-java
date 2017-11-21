package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressFormResource
{
    //
    public String uri;
    public AddressFormResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public AddressFormCountryResource[] records;
    public AddressFormResource records(AddressFormCountryResource[] records) {
        this.records = records;
        return this;
    }
}
