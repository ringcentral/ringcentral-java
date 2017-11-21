package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AddressFormCountryResource
{
    //
    public String uri;
    public AddressFormCountryResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public CountryResource country;
    public AddressFormCountryResource country(CountryResource country) {
        this.country = country;
        return this;
    }
    //
    public FormFieldResource[] attributes;
    public AddressFormCountryResource attributes(FormFieldResource[] attributes) {
        this.attributes = attributes;
        return this;
    }
    //
    public String emergencyNumber;
    public AddressFormCountryResource emergencyNumber(String emergencyNumber) {
        this.emergencyNumber = emergencyNumber;
        return this;
    }
    //
    @JSONField(alternateNames = {"default"})
    public Boolean _default;
    public AddressFormCountryResource _default(Boolean _default) {
        this._default = _default;
        return this;
    }
}
