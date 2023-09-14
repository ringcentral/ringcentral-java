package com.ringcentral.definitions;


public class WirelessPointInfoEmergencyAddress {
    /**
     * Name of a customer
     */
    public String customerName;
    /**
     * Street address, line 1 - street address, P.O. box, company
     * name, c/o
     */
    public String street;
    /**
     * Street address, line 2 - apartment, suite, unit, building,
     * floor, etc.
     */
    public String street2;
    /**
     * City name
     */
    public String city;
    /**
     * Zip code
     */
    public String zip;
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
     * ISO code of a country
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
     * Resulting status of emergency address synchronization. Returned
     * for &#039;Get Device Info&#039; request if `syncEmergencyAddress` parameter is set
     * to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
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

    public WirelessPointInfoEmergencyAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public WirelessPointInfoEmergencyAddress street(String street) {
        this.street = street;
        return this;
    }

    public WirelessPointInfoEmergencyAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public WirelessPointInfoEmergencyAddress city(String city) {
        this.city = city;
        return this;
    }

    public WirelessPointInfoEmergencyAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public WirelessPointInfoEmergencyAddress state(String state) {
        this.state = state;
        return this;
    }

    public WirelessPointInfoEmergencyAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public WirelessPointInfoEmergencyAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public WirelessPointInfoEmergencyAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public WirelessPointInfoEmergencyAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public WirelessPointInfoEmergencyAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public WirelessPointInfoEmergencyAddress country(String country) {
        this.country = country;
        return this;
    }

    public WirelessPointInfoEmergencyAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public WirelessPointInfoEmergencyAddress syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public WirelessPointInfoEmergencyAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public WirelessPointInfoEmergencyAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public WirelessPointInfoEmergencyAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
