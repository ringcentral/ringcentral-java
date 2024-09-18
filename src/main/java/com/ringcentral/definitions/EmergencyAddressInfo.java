package com.ringcentral.definitions;


public class EmergencyAddressInfo {
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
     * Resulting status of emergency address synchronization. Returned
     * for &#039;Get Device Info&#039; request if `syncEmergencyAddress` parameter is set
     * to `true`
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;

    public EmergencyAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyAddressInfo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public EmergencyAddressInfo buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public EmergencyAddressInfo streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public EmergencyAddressInfo buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }

    public EmergencyAddressInfo syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
}
