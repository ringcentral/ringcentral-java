package com.ringcentral.definitions;


public class SwitchInfoEmergencyAddress {
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

    public SwitchInfoEmergencyAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public SwitchInfoEmergencyAddress street(String street) {
        this.street = street;
        return this;
    }

    public SwitchInfoEmergencyAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public SwitchInfoEmergencyAddress city(String city) {
        this.city = city;
        return this;
    }

    public SwitchInfoEmergencyAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public SwitchInfoEmergencyAddress state(String state) {
        this.state = state;
        return this;
    }

    public SwitchInfoEmergencyAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public SwitchInfoEmergencyAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public SwitchInfoEmergencyAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public SwitchInfoEmergencyAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public SwitchInfoEmergencyAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public SwitchInfoEmergencyAddress country(String country) {
        this.country = country;
        return this;
    }

    public SwitchInfoEmergencyAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public SwitchInfoEmergencyAddress syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public SwitchInfoEmergencyAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public SwitchInfoEmergencyAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public SwitchInfoEmergencyAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
