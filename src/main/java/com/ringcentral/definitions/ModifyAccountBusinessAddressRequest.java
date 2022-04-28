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
     *
     */
    public BusinessAddressInfo businessAddress;
    /**
     * Custom site name
     */
    public String mainSiteName;

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

    public ModifyAccountBusinessAddressRequest mainSiteName(String mainSiteName) {
        this.mainSiteName = mainSiteName;
        return this;
    }
}
