package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PhoneNumberInfoNumberParser
{
    // Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details
    public String areaCode;
    public PhoneNumberInfoNumberParser areaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }
    // Information on a country the phone number belongs to
    public GetCountryInfoNumberParser[] country;
    public PhoneNumberInfoNumberParser country(GetCountryInfoNumberParser[] country) {
        this.country = country;
        return this;
    }
    // Dialing format of a phone number
    public String dialable;
    public PhoneNumberInfoNumberParser dialable(String dialable) {
        this.dialable = dialable;
        return this;
    }
    // E.164 (11-digits) format of a phone number
    public String e164;
    public PhoneNumberInfoNumberParser e164(String e164) {
        this.e164 = e164;
        return this;
    }
    // International format of a phone number
    public String formattedInternational;
    public PhoneNumberInfoNumberParser formattedInternational(String formattedInternational) {
        this.formattedInternational = formattedInternational;
        return this;
    }
    // Domestic format of a phone number
    public String formattedNational;
    public PhoneNumberInfoNumberParser formattedNational(String formattedNational) {
        this.formattedNational = formattedNational;
        return this;
    }
    // One of the numbers to be parsed, passed as a string in response
    public String originalString;
    public PhoneNumberInfoNumberParser originalString(String originalString) {
        this.originalString = originalString;
        return this;
    }
    //  True  if the number is in a special format (for example N11 code)
    public Boolean special;
    public PhoneNumberInfoNumberParser special(Boolean special) {
        this.special = special;
        return this;
    }
    // E.164 (11-digits) format of a phone number without the plus sign ('+')
    public String normalized;
    public PhoneNumberInfoNumberParser normalized(String normalized) {
        this.normalized = normalized;
        return this;
    }
}
