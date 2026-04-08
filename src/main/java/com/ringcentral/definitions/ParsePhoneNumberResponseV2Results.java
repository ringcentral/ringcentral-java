package com.ringcentral.definitions;


public class ParsePhoneNumberResponseV2Results
{
    /**
     */
    public DialingDetails dialingDetails;
    public ParsePhoneNumberResponseV2Results dialingDetails(DialingDetails dialingDetails)
    {
        this.dialingDetails = dialingDetails;
        return this;
    }

    /**
     */
    public NumberDetails numberDetails;
    public ParsePhoneNumberResponseV2Results numberDetails(NumberDetails numberDetails)
    {
        this.numberDetails = numberDetails;
        return this;
    }

    /**
     * Contains several items for the `results.category` response&#039;s attribute value `Ambiguous`,
    * where each item represents formatting for a specific category from the list of categories between which ambiguity happened,
    * e.g. `Extension` and `Regular`, or `Extension` and `ShortCode`.
    * 
    * Absent if the request&#039;s parameter `resultContent.includeFormats` value is set to `false`.
     */
    public Object[] formats;
    public ParsePhoneNumberResponseV2Results formats(Object[] formats)
    {
        this.formats = formats;
        return this;
    }
}