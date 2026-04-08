package com.ringcentral.definitions;


    /**
* Absent if the request's parameter `resultContent.includeNumberDetails` value is set to `false`.
*/
public class NumberDetails
{
    /**
     * Absent if the request&#039;s parameter `context.siteCode` value is set to `null`.
     * Example: 10
     */
    public String siteCode;
    public NumberDetails siteCode(String siteCode)
    {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * Absent if the request&#039;s parameter `context.siteCode` value is set to `null`.
     * Example: 303
     */
    public String shortExtensionNumber;
    public NumberDetails shortExtensionNumber(String shortExtensionNumber)
    {
        this.shortExtensionNumber = shortExtensionNumber;
        return this;
    }

    /**
     * Absent for the `results.category` response&#039;s attribute values:
    * `Unknown`, `ServiceCode`, `SpecialService`, `Regular`, `TollFree` and `ShortCode`.
     * Example: 10303
     */
    public String extensionNumber;
    public NumberDetails extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Absent for the `results.category` response&#039;s attribute values:
    * `Unknown`, `ServiceCode`, `Extension`, `Regular`, `TollFree`, `ShortCode` and `Ambiguous`.
     */
    public NumberDetailsSpecialService specialService;
    public NumberDetails specialService(NumberDetailsSpecialService specialService)
    {
        this.specialService = specialService;
        return this;
    }

    /**
     */
    public CountryContext country;
    public NumberDetails country(CountryContext country)
    {
        this.country = country;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a national destination code.
     */
    public String nationalDestinationCode;
    public NumberDetails nationalDestinationCode(String nationalDestinationCode)
    {
        this.nationalDestinationCode = nationalDestinationCode;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain an area code.
     * Example: 650
     */
    public String areaCode;
    public NumberDetails areaCode(String areaCode)
    {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a regional destination code.
     */
    public String regionalDestinationCode;
    public NumberDetails regionalDestinationCode(String regionalDestinationCode)
    {
        this.regionalDestinationCode = regionalDestinationCode;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain an allocation block code.
     */
    public String allocationBlockCode;
    public NumberDetails allocationBlockCode(String allocationBlockCode)
    {
        this.allocationBlockCode = allocationBlockCode;
        return this;
    }

    /**
     * Absent for the `results.category` response&#039;s attribute values: `Unknown`, `ServiceCode` and `Extension`.
     * Example: 5558275
     */
    public String subscriberNumber;
    public NumberDetails subscriberNumber(String subscriberNumber)
    {
        this.subscriberNumber = subscriberNumber;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a sub-address.
     * Example: 1019
     */
    public String subAddress;
    public NumberDetails subAddress(String subAddress)
    {
        this.subAddress = subAddress;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a DTMF postfix.
     * Example: ,,,1,3,1,
     */
    public String dtmfPostfix;
    public NumberDetails dtmfPostfix(String dtmfPostfix)
    {
        this.dtmfPostfix = dtmfPostfix;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a SIP postfix.
     * Example: @sip.ringcentral.com
     */
    public String sipPostfix;
    public NumberDetails sipPostfix(String sipPostfix)
    {
        this.sipPostfix = sipPostfix;
        return this;
    }

    /**
     * Absent if the request&#039;s parameter `context.maskedPhoneNumbersAllowed` value is set to `false`.
     */
    public Boolean probablyMasked;
    public NumberDetails probablyMasked(Boolean probablyMasked)
    {
        this.probablyMasked = probablyMasked;
        return this;
    }

    /**
     * Absent for the `results.category` response&#039;s attribute values:
    * `Unknown`, `SpecialService`, `Extension`, `TollFree`, `ShortCode` and `Ambiguous`.
     * Example: Valid
     * Enum: Valid, Possible, Invalid
     */
    public String status;
    public NumberDetails status(String status)
    {
        this.status = status;
        return this;
    }
}