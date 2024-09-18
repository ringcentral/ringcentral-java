package com.ringcentral.definitions;


public class CommonEmergencyLocationAddressInfoFr {
    /**
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String countryIsoCode;
    /**
     * Full name of a country
     */
    public String countryName;
    /**
     * State/Province name. Mandatory for the USA, the UK and Canada
     */
    public String state;
    /**
     * Internal identifier of a state
     */
    public String stateId;
    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    /**
     * Full name of a state
     */
    public String stateName;
    /**
     * City name
     */
    public String city;
    /**
     * The name of the street (The field is utilized as &#039;streetName&#039; field for FR addresses)
     */
    public String street;
    /**
     * Company name
     */
    public String companyName;
    /**
     * (Optional) Building name
     */
    public String buildingName;
    /**
     * Building/street number
     */
    public String buildingNumber;
    /**
     * Second line address (apartment, suite, unit, building, floor,
     * etc.)
     */
    public String street2;
    /**
     * Postal (Zip) code
     */
    public String zip;
    /**
     * Customer name
     */
    public String customerName;

    public CommonEmergencyLocationAddressInfoFr country(String country) {
        this.country = country;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr state(String state) {
        this.state = state;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr city(String city) {
        this.city = city;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr street(String street) {
        this.street = street;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr zip(String zip) {
        this.zip = zip;
        return this;
    }

    public CommonEmergencyLocationAddressInfoFr customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
