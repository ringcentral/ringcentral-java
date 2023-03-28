package com.ringcentral.definitions;


/**
 * Address for emergency cases. The same emergency address is assigned to all
 * numbers of a single device. If the emergency address is also specified in
 * `emergency` resource, then this value is ignored
 */
public class EmergencyServiceAddressResourceRequest {
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
     * Country name
     */
    public String country;
    /**
     * Internal identifier of a country
     */
    public String countryId;

    public EmergencyServiceAddressResourceRequest street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyServiceAddressResourceRequest street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyServiceAddressResourceRequest city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyServiceAddressResourceRequest zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyServiceAddressResourceRequest customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyServiceAddressResourceRequest state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyServiceAddressResourceRequest stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyServiceAddressResourceRequest country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyServiceAddressResourceRequest countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }
}
