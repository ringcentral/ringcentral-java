package com.ringcentral.definitions;

/** Query parameters for operation parsePhoneNumber */
public class ParsePhoneNumberParameters {
    /**
     * Two-letter country code in [ISO 3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format Example: US
     */
    public String homeCountry;

    public ParsePhoneNumberParameters homeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }

    /**
     * The default value is `false`. If `true`, the numbers that are closer to the home country are
     * given higher priority
     */
    public Boolean nationalAsPriority;

    public ParsePhoneNumberParameters nationalAsPriority(Boolean nationalAsPriority) {
        this.nationalAsPriority = nationalAsPriority;
        return this;
    }
}
