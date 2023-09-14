package com.ringcentral.definitions;


public class EmergencyLocationInfoRequestAddress {
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
     * The name of the street (The field is utilised as &#039;streetName&#039; field for FR addresses)
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

    public EmergencyLocationInfoRequestAddress country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyLocationInfoRequestAddress countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyLocationInfoRequestAddress countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyLocationInfoRequestAddress countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyLocationInfoRequestAddress state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyLocationInfoRequestAddress stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyLocationInfoRequestAddress stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyLocationInfoRequestAddress stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyLocationInfoRequestAddress city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyLocationInfoRequestAddress street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyLocationInfoRequestAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyLocationInfoRequestAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyLocationInfoRequestAddress customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyLocationInfoRequestAddress companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public EmergencyLocationInfoRequestAddress buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public EmergencyLocationInfoRequestAddress streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public EmergencyLocationInfoRequestAddress buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
