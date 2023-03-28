package com.ringcentral.definitions;


/**
 * Information on account brand
 */
public class BrandInfo {
    /**
     * Internal identifier of a brand
     */
    public String id;
    /**
     * Brand name, for example  RingCentral UK ,  ClearFax
     */
    public String name;
    /**
     *
     */
    public CountryInfoShortModel homeCountry;

    public BrandInfo id(String id) {
        this.id = id;
        return this;
    }

    public BrandInfo name(String name) {
        this.name = name;
        return this;
    }

    public BrandInfo homeCountry(CountryInfoShortModel homeCountry) {
        this.homeCountry = homeCountry;
        return this;
    }
}
