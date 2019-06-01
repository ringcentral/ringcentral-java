package com.ringcentral.definitions;


public class ModifyAccountBusinessAddressRequest {
    /**
     * Company business name
     */
    public String company;
    /**
     * Company business email address
     */
    public String email;
    /**
     * Company business address
     * Required
     */
    public BusinessAddressInfo businessAddress;

    public ModifyAccountBusinessAddressRequest company(String company) {
        this.company = company;
        return this;
    }

    public ModifyAccountBusinessAddressRequest email(String email) {
        this.email = email;
        return this;
    }

    public ModifyAccountBusinessAddressRequest businessAddress(BusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

}
