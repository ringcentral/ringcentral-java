package com.ringcentral.definitions;


public class ReadConferencingSettingsParameters {
    /**
     * Internal identifier of a country. If not specified, the response is returned for the brand country
     */
    public String countryId;

    public ReadConferencingSettingsParameters countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

}
