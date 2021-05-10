package com.ringcentral.definitions;


// Address for emergency cases. The same emergency address is assigned to all the numbers of one device
public class DeviceEmergencyServiceAddressResource {
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

    public DeviceEmergencyServiceAddressResource street(String street) {
        this.street = street;
        return this;
    }

    public DeviceEmergencyServiceAddressResource street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public DeviceEmergencyServiceAddressResource city(String city) {
        this.city = city;
        return this;
    }

    public DeviceEmergencyServiceAddressResource zip(String zip) {
        this.zip = zip;
        return this;
    }

    public DeviceEmergencyServiceAddressResource customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public DeviceEmergencyServiceAddressResource state(String state) {
        this.state = state;
        return this;
    }

    public DeviceEmergencyServiceAddressResource stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public DeviceEmergencyServiceAddressResource stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public DeviceEmergencyServiceAddressResource stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public DeviceEmergencyServiceAddressResource countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public DeviceEmergencyServiceAddressResource countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public DeviceEmergencyServiceAddressResource country(String country) {
        this.country = country;
        return this;
    }

    public DeviceEmergencyServiceAddressResource countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public DeviceEmergencyServiceAddressResource outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }
}
