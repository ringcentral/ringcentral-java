package com.ringcentral.definitions;


    /**
* Phone number information
*/
public class DevicePhoneNumberInfo
{
    /**
     * Internal identifier of a phone number
     * Format: int64
     */
    public Long id;
    public DevicePhoneNumberInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public DevicePhoneNumberCountryInfo country;
    public DevicePhoneNumberInfo country(DevicePhoneNumberCountryInfo country)
    {
        this.country = country;
        return this;
    }

    /**
     * Payment type. &#039;External&#039; is returned for forwarded numbers which are not terminated in the RingCentral phone system = [&#039;External&#039;, &#039;TollFree&#039;, &#039;Local&#039;]
     * Enum: External, TollFree, Local
     */
    public String paymentType;
    public DevicePhoneNumberInfo paymentType(String paymentType)
    {
        this.paymentType = paymentType;
        return this;
    }

    /**
     * Phone number
     */
    public String phoneNumber;
    public DevicePhoneNumberInfo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Enum: CompanyNumber, MainCompanyNumber, AdditionalCompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber
     */
    public String usageType;
    public DevicePhoneNumberInfo usageType(String usageType)
    {
        this.usageType = usageType;
        return this;
    }

    /**
     * Type of a phone number
     * Enum: VoiceFax, FaxOnly, VoiceOnly
     */
    public String type;
    public DevicePhoneNumberInfo type(String type)
    {
        this.type = type;
        return this;
    }
}