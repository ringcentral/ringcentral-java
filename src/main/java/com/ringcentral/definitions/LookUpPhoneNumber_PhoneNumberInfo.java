package com.ringcentral.definitions;

public class LookUpPhoneNumber_PhoneNumberInfo {
    // Phone number in E.164 format without a '+'
    public String phoneNumber;
    // Phone number formatted according to current brand's default country
    public String formattedNumber;
    // Vanity pattern for this number. Returned only when vanity search option is requested. Vanity pattern corresponds to request parameters nxx plus line or numberPattern
    public String vanityPattern;
    // The value is returned if the extendedSearch parameter is true. '10' is the closest match
    public Long rank;
}
