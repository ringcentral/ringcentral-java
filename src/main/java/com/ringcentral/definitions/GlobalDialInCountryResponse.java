package com.ringcentral.definitions;


public class GlobalDialInCountryResponse {
    /**
     *
     */
    public String countryCode;
    /**
     *
     */
    public String countryName;
    /**
     *
     */
    public Boolean checked;
    /**
     * Format: int32
     */
    public Long order;

    public GlobalDialInCountryResponse countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public GlobalDialInCountryResponse countryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    public GlobalDialInCountryResponse checked(Boolean checked) {
        this.checked = checked;
        return this;
    }

    public GlobalDialInCountryResponse order(Long order) {
        this.order = order;
        return this;
    }
}
