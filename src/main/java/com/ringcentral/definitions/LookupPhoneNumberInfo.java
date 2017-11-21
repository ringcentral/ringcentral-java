package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class LookupPhoneNumberInfo
{
    // Phone number in E.164 format
    public String phoneNumber;
    public LookupPhoneNumberInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    // Phone number formatted according to current brand's default country
    public String formattedNumber;
    public LookupPhoneNumberInfo formattedNumber(String formattedNumber) {
        this.formattedNumber = formattedNumber;
        return this;
    }
    // Vanity pattern for this number. Returned only when vanity search option is requested. Vanity pattern corresponds to request parameters nxx plus line or numberPattern
    public String vanityPattern;
    public LookupPhoneNumberInfo vanityPattern(String vanityPattern) {
        this.vanityPattern = vanityPattern;
        return this;
    }
    // The value is returned if the extendedSearch parameter is true. The values are 10, 9, 8, etc.; '10' is the closest match
    public Long rank;
    public LookupPhoneNumberInfo rank(Long rank) {
        this.rank = rank;
        return this;
    }
}
