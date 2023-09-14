package com.ringcentral.definitions;


/**
 * Automatically determined emergency address. If `emergencyAddressState`
 * value is 'Assigned', then this address is assigned to the current device.
 * If `emergencyAddressState` value is 'Unconfirmed', then the specified address
 * must be confirmed by the user before being registered as emergency address
 * for the current device. In all other cases the value is null
 */
public class DeviceEmergencyAddressDefault {
    /**
     * Name of a customer
     */
    public String customerName;
    /**
     * Street address, line 1 - street address, P.O. box, company name, c/o
     */
    public String street;
    /**
     * Street address, line 2 - apartment, suite, unit, building, floor, etc.
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

    public DeviceEmergencyAddressDefault customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public DeviceEmergencyAddressDefault street(String street) {
        this.street = street;
        return this;
    }

    public DeviceEmergencyAddressDefault street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public DeviceEmergencyAddressDefault city(String city) {
        this.city = city;
        return this;
    }

    public DeviceEmergencyAddressDefault zip(String zip) {
        this.zip = zip;
        return this;
    }

    public DeviceEmergencyAddressDefault state(String state) {
        this.state = state;
        return this;
    }

    public DeviceEmergencyAddressDefault stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public DeviceEmergencyAddressDefault stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public DeviceEmergencyAddressDefault stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public DeviceEmergencyAddressDefault countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public DeviceEmergencyAddressDefault countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public DeviceEmergencyAddressDefault country(String country) {
        this.country = country;
        return this;
    }

    public DeviceEmergencyAddressDefault countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public DeviceEmergencyAddressDefault syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }
}
