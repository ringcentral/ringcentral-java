package com.ringcentral.definitions;


public class AccountBusinessAddressResource {
    /**
     *
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

}
