package com.ringcentral.definitions;


    /**
* Specifies an external PSTN number which should be used for the missed call transfer. Returned only if the actionType is set to `ConnectToExternalNumber`
*/
public class MissedCallExtensionInfoExternalNumber
{
    /**
     * Phone number to which the call is forwarded. In addition to common [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format, the following number patterns are supported: 11xxxxxxxxxxx, 444xxxxxxxxxxx, 616xxxxxxxxxxx, 1700yyyy; where `xxxxxxxxxxx` is a phone number in e.164 format (without &#039;+&#039; sign) and `yyyy` is an external short extension number. Maximum number of digits is 15
     */
    public String phoneNumber;
    public MissedCallExtensionInfoExternalNumber phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}