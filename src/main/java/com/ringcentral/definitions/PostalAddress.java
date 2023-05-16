package com.ringcentral.definitions;


/**
 * Postal address/location
 */
public class PostalAddress {
    /**
     * Street address
     * Required
     * Example: 20 Davis Dr
     */
    public String street;
    /**
     * Street address (2nd line)
     */
    public String street2;
    /**
     * City name
     * Required
     * Example: Belmont
     */
    public String city;
    /**
     * State or province information in the target country
     * Example: CA
     */
    public String state;
    /**
     * Postal code in the target country
     * Required
     * Example: 94002
     */
    public String zip;
    /**
     * ISO-3166-1 2-letter country code (alpha2)
     * Required
     * Example: US
     */
    public String country;

    public PostalAddress street(String street) {
        this.street = street;
        return this;
    }

    public PostalAddress street2(String street2) {
        this.street2 = street2;
        return this;
    }

    public PostalAddress city(String city) {
        this.city = city;
        return this;
    }

    public PostalAddress state(String state) {
        this.state = state;
        return this;
    }

    public PostalAddress zip(String zip) {
        this.zip = zip;
        return this;
    }

    public PostalAddress country(String country) {
        this.country = country;
        return this;
    }
}
