package com.ringcentral.definitions;


    /**
* Query parameters for operation listBlockedAllowedNumbers
*/
public class ListBlockedAllowedNumbersParameters
{
    /**
     */
    public Long page;
    public ListBlockedAllowedNumbersParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     */
    public Long perPage;
    public ListBlockedAllowedNumbersParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }

    /**
     * Enum: Blocked, Allowed
     */
    public String status;
    public ListBlockedAllowedNumbersParameters status(String status)
    {
        this.status = status;
        return this;
    }
}