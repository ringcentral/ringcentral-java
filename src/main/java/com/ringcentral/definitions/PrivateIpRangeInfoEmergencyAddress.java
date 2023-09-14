package com.ringcentral.definitions;


public class PrivateIpRangeInfoEmergencyAddress {
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
     * Customer name
     */
    public String customerName;
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
     * First line address
     */
    public String street;
    /**
     * Second line address (apartment, suite, unit, building, floor, etc.)
     */
    public String street2;
    /**
     * Postal (Zip) code
     */
    public String zip;
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

    public PrivateIpRangeInfoEmergencyAddress country(String country) {
        this.country = country;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress state(String state) {
        this.state = state;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress city(String city) {
        this.city = city;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress street(String street) {
        this.street = street;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public PrivateIpRangeInfoEmergencyAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
