package com.ringcentral.definitions;


// Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case the order contains several devices, they can be delivered to different addresses
public class ShippingAddressInfo {
    /**
     * Name of a primary contact person (receiver)
     */
    public String customerName;
    /**
     * Name of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
     */
    public String additionalCustomerName;
    /**
     * Email of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia.
     */
    public String customerEmail;
    /**
     * Email of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
     */
    public String additionalCustomerEmail;
    /**
     * Phone number of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia
     */
    public String customerPhone;
    /**
     * Phone number of an additional contact person. Should be specified for countries except the US, Canada, the UK {@literal &} Australia.
     */
    public String additionalCustomerPhone;
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
     * Zip code
     */
    public String zip;
    /**
     * National taxpayer identification number. Should be specified for Brazil (CNPJ/CPF number) and Argentina (CUIT number).
     */
    public String taxId;

    public ShippingAddressInfo customerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    public ShippingAddressInfo additionalCustomerName(String additionalCustomerName) {
        this.additionalCustomerName = additionalCustomerName;
        return this;
    }

    public ShippingAddressInfo customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public ShippingAddressInfo additionalCustomerEmail(String additionalCustomerEmail) {
        this.additionalCustomerEmail = additionalCustomerEmail;
        return this;
    }

    public ShippingAddressInfo customerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
        return this;
    }

    public ShippingAddressInfo additionalCustomerPhone(String additionalCustomerPhone) {
        this.additionalCustomerPhone = additionalCustomerPhone;
        return this;
    }

    public ShippingAddressInfo street(String street) {
        this.street = street;
        return this;
    }

    public ShippingAddressInfo street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public ShippingAddressInfo city(String city) {
        this.city = city;
        return this;
    }

    public ShippingAddressInfo state(String state) {
        this.state = state;
        return this;
    }

    public ShippingAddressInfo stateId(String stateId) {
        this.stateId = stateId;
        return this;
    }

    public ShippingAddressInfo stateIsoCode(String stateIsoCode) {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    public ShippingAddressInfo stateName(String stateName) {
        this.stateName = stateName;
        return this;
    }

    public ShippingAddressInfo countryId(String countryId) {
        this.countryId = countryId;
        return this;
    }

    public ShippingAddressInfo countryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    public ShippingAddressInfo country(String country) {
        this.country = country;
        return this;
    }

    public ShippingAddressInfo countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public ShippingAddressInfo zip(String zip) {
        this.zip = zip;
        return this;
    }

    public ShippingAddressInfo taxId(String taxId) {
        this.taxId = taxId;
        return this;
    }
}
