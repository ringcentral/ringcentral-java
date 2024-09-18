package com.ringcentral.definitions;


/**
 * Address for emergency cases. The same emergency address is assigned
 * to all the numbers of one device
 */
public class EmergencyServiceAddressResource {
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
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
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
     * Resulting status of emergency address synchronization. Returned
     * if `syncEmergencyAddress` parameter is set to `true`
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    /**
     * Name of an additional contact person. Should be specified for
     * countries except the US, Canada, the UK and Australia.
     */
    public String additionalCustomerName;
    /**
     * Email of a primary contact person (receiver). Should be specified
     * for countries except the US, Canada, the UK and Australia.
     * Format: email
     */
    public String customerEmail;
    /**
     * Email of an additional contact person. Should be specified
     * for countries except the US, Canada, the UK and Australia.
     * Format: email
     */
    public String additionalCustomerEmail;
    /**
     * Phone number of a primary contact person (receiver). Should
     * be specified for countries except the US, Canada, the UK and Australia
     */
    public String customerPhone;
    /**
     * Phone number of an additional contact person. Should be specified
     * for countries except the US, Canada, the UK &amp; Australia.
     */
    public String additionalCustomerPhone;
    /**
     * Status of digital line provisioning
     * Enum: Provisioning, Valid, Invalid
     */
    public String lineProvisioningStatus;
    /**
     * Internal identifier of a tax
     */
    public String taxId;

    public EmergencyServiceAddressResource street(String street) {
        this.street = street;
        return this;
    }

    public EmergencyServiceAddressResource street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public EmergencyServiceAddressResource city(String city) {
        this.city = city;
        return this;
    }

    public EmergencyServiceAddressResource zip(String zip) {
        this.zip = zip;
        return this;
    }

    public EmergencyServiceAddressResource customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public EmergencyServiceAddressResource state(String state) {
        this.state = state;
        return this;
    }

    public EmergencyServiceAddressResource stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public EmergencyServiceAddressResource stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public EmergencyServiceAddressResource stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public EmergencyServiceAddressResource countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public EmergencyServiceAddressResource countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public EmergencyServiceAddressResource country(String country) {
        this.country = country;
        return this;
    }

    public EmergencyServiceAddressResource countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public EmergencyServiceAddressResource outOfCountry(Boolean outOfCountry) {
        this.outOfCountry = outOfCountry;
        return this;
    }

    public EmergencyServiceAddressResource syncStatus(String syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    public EmergencyServiceAddressResource additionalCustomerName(String additionalCustomerName) {
        this.additionalCustomerName = additionalCustomerName;
        return this;
    }

    public EmergencyServiceAddressResource customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public EmergencyServiceAddressResource additionalCustomerEmail(String additionalCustomerEmail) {
        this.additionalCustomerEmail = additionalCustomerEmail;
        return this;
    }

    public EmergencyServiceAddressResource customerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public EmergencyServiceAddressResource additionalCustomerPhone(String additionalCustomerPhone) {
        this.additionalCustomerPhone = additionalCustomerPhone;
        return this;
    }

    public EmergencyServiceAddressResource lineProvisioningStatus(String lineProvisioningStatus) {
        this.lineProvisioningStatus = lineProvisioningStatus;
        return this;
    }

    public EmergencyServiceAddressResource taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }
}
