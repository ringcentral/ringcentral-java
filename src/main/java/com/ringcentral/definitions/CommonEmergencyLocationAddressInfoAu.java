package com.ringcentral.definitions;


public class CommonEmergencyLocationAddressInfoAu {
    /**
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;
    /**
     * ISO code of a country
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
     * The name of the street (the field is utilized as &#039;streetName&#039; field for AU addresses)
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
     * Street type
     */
    public String streetType;
    /**
     * Building/street number
     */
    public String buildingNumber;
    /**
     * Second line address (apartment, suite, unit, building, floor, etc.)
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

    public CommonEmergencyLocationAddressInfoAu country(String country) {
        this.country = country;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu state(String state) {
        this.state = state;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu city(String city) {
        this.city = city;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu street(String street) {
        this.street = street;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu zip(String zip) {
        this.zip = zip;
        return this;
    }

    public CommonEmergencyLocationAddressInfoAu customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
}
