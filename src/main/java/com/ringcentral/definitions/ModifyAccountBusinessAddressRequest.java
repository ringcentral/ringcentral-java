package com.ringcentral.definitions;


public class ModifyAccountBusinessAddressRequest
{
    /**
     * Company business name
     */
    public String company;
    public ModifyAccountBusinessAddressRequest company(String company)
    {
        this.company = company;
        return this;
    }

    /**
     * Company business email address
     */
    public String email;
    public ModifyAccountBusinessAddressRequest email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     */
    public BusinessAddressInfo businessAddress;
    public ModifyAccountBusinessAddressRequest businessAddress(BusinessAddressInfo businessAddress)
    {
        this.businessAddress = businessAddress;
        return this;
    }

    /**
     * Custom site name
     */
    public String mainSiteName;
    public ModifyAccountBusinessAddressRequest mainSiteName(String mainSiteName)
    {
        this.mainSiteName = mainSiteName;
        return this;
    }
}