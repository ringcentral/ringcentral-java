package com.ringcentral.definitions;


/**
 * Address for emergency cases. The same emergency address is assigned to all the numbers of one device
 */
public class DeviceEmergencyServiceAddressResourceAu {
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

    public DeviceEmergencyServiceAddressResourceAu street(String street) {
        this.street = street;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu city(String city) {
        this.city = city;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu zip(String zip) {
        this.zip = zip;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu state(String state) {
        this.state = state;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu country(String country) {
        this.country = country;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu buildingName(String buildingName) {
        this.buildingName = buildingName;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu streetType(String streetType) {
        this.streetType = streetType;
        return this;
    }

    public DeviceEmergencyServiceAddressResourceAu buildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
        return this;
    }
}
