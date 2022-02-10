package com.ringcentral.definitions;


/**
 * Query parameters for operation parsePhoneNumber
 */
public class ParsePhoneNumberParameters {
    /**
     * Internal identifier of a home country. The default value is ISO code (ISO 3166) of the user&#039;s home country or brand country, if the user is undefined
     */
    public String homeCountry;
    /**
     * The default value is &#039;False&#039;. If &#039;True&#039;, the numbers that are closer to the home country are given higher priority
     */
    public Boolean nationalAsPriority;

    public ParsePhoneNumberParameters homeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    public ParsePhoneNumberParameters nationalAsPriority(Boolean nationalAsPriority) {
        this.nationalAsPriority = nationalAsPriority;
        return this;
    }
}
