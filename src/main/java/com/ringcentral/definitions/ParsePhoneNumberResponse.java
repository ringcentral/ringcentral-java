package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ParsePhoneNumberResponse
{
    // Canonical URI of a resource
    public String uri;
    public ParsePhoneNumberResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // Information on a user home country
    public GetCountryInfoNumberParser[] homeCountry;
    public ParsePhoneNumberResponse homeCountry(GetCountryInfoNumberParser[] homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
    // Parsed phone numbers data
    public PhoneNumberInfoNumberParser[] phoneNumbers;
    public ParsePhoneNumberResponse phoneNumbers(PhoneNumberInfoNumberParser[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }
    // One of the numbers to be parsed, passed as a string in response
    public String originalString;
    public ParsePhoneNumberResponse originalString(String originalString) {
        this.originalString = originalString;
        return this;
    }
    // Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details
    public String areaCode;
    public ParsePhoneNumberResponse areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    // Domestic format of a phone number
    public String formattedNational;
    public ParsePhoneNumberResponse formattedNational(String formattedNational) {
        this.formattedNational = formattedNational;
        return this;
    }
    // International format of a phone number
    public String formattedInternational;
    public ParsePhoneNumberResponse formattedInternational(String formattedInternational) {
        this.formattedInternational = formattedInternational;
        return this;
    }
    // Dialing format of a phone number
    public String dialable;
    public ParsePhoneNumberResponse dialable(String dialable) {
        this.dialable = dialable;
        return this;
    }
    // E.164 (11-digits) format of a phone number
    public String e164;
    public ParsePhoneNumberResponse e164(String e164) {
        this.e164 = e164;
        return this;
    }
    //  True  if the number is in a special format (for example N11 code)
    public Boolean special;
    public ParsePhoneNumberResponse special(Boolean special) {
        this.special = special;
        return this;
    }
    // E.164 (11-digits) format of a phone number without the plus sign ('+')
    public String normalized;
    public ParsePhoneNumberResponse normalized(String normalized) {
        this.normalized = normalized;
        return this;
    }
    // Information on a country the phone number belongs to
    public GetCountryInfoNumberParser[] country;
    public ParsePhoneNumberResponse country(GetCountryInfoNumberParser[] country) {
        this.country = country;
        return this;
    }
}
