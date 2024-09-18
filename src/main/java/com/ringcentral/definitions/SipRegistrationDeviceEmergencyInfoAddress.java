package com.ringcentral.definitions;


public class SipRegistrationDeviceEmergencyInfoAddress {
    /**
     *
     */
    public String street;
    /**
     *
     */
    public String street2;
    /**
     *
     */
    public String city;
    /**
     *
     */
    public String zip;
    /**
     *
     */
    public String customerName;
    /**
     * State/province name
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
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String countryIsoCode;
    /**
     * Country name
     */
    public String country;
    /**
     * Full name of a country
     */
    public String countryName;
    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    /**
     * (Optional) Building name
     */
    public String buildingName;
    /**
     * Street type
     */
    public String streetType;
    /**
     * Building/street number
     */
    public String buildingNumber;

    public SipRegistrationDeviceEmergencyInfoAddress street(String street) {
        this.street = street;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress city(String city) {
        this.city = city;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress state(String state) {
        this.state = state;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress country(String country) {
        this.country = country;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public SipRegistrationDeviceEmergencyInfoAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
