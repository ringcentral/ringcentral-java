package com.ringcentral.definitions;


public class SmsConfigurationResource {
    /**
     * Internal identifier of a phone number
     */
    public String phoneNumberId;
    /**
     * Phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) (with &#039;+&#039; sign) format
     * Example: +18661234567
     */
    public String phoneNumber;
    /**
     *
     */
    public SmsCampaignInfo smsCampaignInfo;
    /**
     *
     */
    public SmsBrandInfo smsBrandInfo;

    public SmsConfigurationResource phoneNumberId(String phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
        return this;
    }

    public SmsConfigurationResource phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public SmsConfigurationResource smsCampaignInfo(SmsCampaignInfo smsCampaignInfo) {
        this.smsCampaignInfo = smsCampaignInfo;
        return this;
    }

    public SmsConfigurationResource smsBrandInfo(SmsBrandInfo smsBrandInfo) {
        this.smsBrandInfo = smsBrandInfo;
        return this;
    }
}
