package com.ringcentral.definitions;


public class AccountBusinessAddressResource {
    /**
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public ContactBusinessAddressInfo businessAddress;
    /**
     *
     */
    public String company;
    /**
     *
     */
    public String email;
    /**
     * Custom site name
     */
    public String mainSiteName;

    public AccountBusinessAddressResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountBusinessAddressResource businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    public AccountBusinessAddressResource company(String company) {
        this.company = company;
        return this;
    }

    public AccountBusinessAddressResource email(String email) {
        this.email = email;
        return this;
    }

    public AccountBusinessAddressResource mainSiteName(String mainSiteName) {
        this.mainSiteName = mainSiteName;
        return this;
    }
}
