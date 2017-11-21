package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ParsedPhoneNumbersResource
{
    //
    public String uri;
    public ParsedPhoneNumbersResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public HomeCountryResource homeCountry;
    public ParsedPhoneNumbersResource homeCountry(HomeCountryResource homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
    //
    public ParsedNumberResource[] phoneNumbers;
    public ParsedPhoneNumbersResource phoneNumbers(ParsedNumberResource[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
}
