package com.ringcentral.definitions;


/**
 * Query parameters for operation parsePhoneNumber
 */
public class ParsePhoneNumberParameters {
    /**
     * ISO 3166 alpha2 code of the home country to be used if it is impossible to determine country from the number itself.
     * By default this parameter is preset to the current user&#039;s home country or brand country if the user is undefined
     * Example: US
     */
    public String homeCountry;
    /**
     * The default value is `false`. If `true`, the numbers that are
     * closer to the home country are given higher priority
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
