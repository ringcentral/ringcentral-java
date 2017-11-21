package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ParsedNumberResource
{
    //
    public String uri;
    public ParsedNumberResource uri(String uri) {
        this.uri = uri;
        return this;
    }
    //
    public String originalString;
    public ParsedNumberResource originalString(String originalString) {
        this.originalString = originalString;
        return this;
    }
    //
    public CountryResource country;
    public ParsedNumberResource country(CountryResource country) {
        this.country = country;
        return this;
    }
    //
    public String areaCode;
    public ParsedNumberResource areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    //
    public String subscriberNumber;
    public ParsedNumberResource subscriberNumber(String subscriberNumber) {
        this.subscriberNumber = subscriberNumber;
        return this;
    }
    //
    public String formattedNational;
    public ParsedNumberResource formattedNational(String formattedNational) {
        this.formattedNational = formattedNational;
        return this;
    }
    //
    public String formattedInternational;
    public ParsedNumberResource formattedInternational(String formattedInternational) {
        this.formattedInternational = formattedInternational;
        return this;
    }
    //
    public String dialable;
    public ParsedNumberResource dialable(String dialable) {
        this.dialable = dialable;
        return this;
    }
    //
    public String e164;
    public ParsedNumberResource e164(String e164) {
        this.e164 = e164;
        return this;
    }
    //
    public Boolean special;
    public ParsedNumberResource special(Boolean special) {
        this.special = special;
        return this;
    }
    //
    public String normalized;
    public ParsedNumberResource normalized(String normalized) {
        this.normalized = normalized;
        return this;
    }
    //
    public Boolean tollFree;
    public ParsedNumberResource tollFree(Boolean tollFree) {
        this.tollFree = tollFree;
        return this;
    }
    //
    public String subAddress;
    public ParsedNumberResource subAddress(String subAddress) {
        this.subAddress = subAddress;
        return this;
    }
    //
    public String dtmfPostfix;
    public ParsedNumberResource dtmfPostfix(String dtmfPostfix) {
        this.dtmfPostfix = dtmfPostfix;
        return this;
    }
}
