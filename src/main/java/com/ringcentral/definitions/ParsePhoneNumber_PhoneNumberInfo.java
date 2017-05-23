package com.ringcentral.definitions;

public class ParsePhoneNumber_PhoneNumberInfo {
    // Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details
    public String areaCode;
    // Information on a country the phone number belongs to
    public ParsePhoneNumber_CountryInfo[] country;
    // Dialing format of a phone number
    public String dialable;
    // E.164 (11-digits) format of a phone number
    public String e164;
    // International format of a phone number
    public String formattedInternational;
    // Domestic format of a phone number
    public String formattedNational;
    // One of the numbers to be parsed, passed as a string in response
    public String originalString;
    // "True" if the number is in a special format (for example N11 code)
    public Boolean special;
    // E.164 (11-digits) format of a phone number without the plus sign ('+')
    public String normalized;
}
