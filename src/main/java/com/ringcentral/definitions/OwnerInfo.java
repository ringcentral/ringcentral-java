package com.ringcentral.definitions;


    /**
* Deprecated. Information on a call owner
*/
public class OwnerInfo
{
    /**
     * Internal identifier of an account that monitors a call
     */
    public String accountId;
    public OwnerInfo accountId(String accountId)
    {
        this.accountId = accountId;
        return this;
    }

    /**
     * Internal identifier of an extension that monitors a call
     */
    public String extensionId;
    public OwnerInfo extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Internal identifier of an account brandId that monitors a call
     */
    public String brandId;
    public OwnerInfo brandId(String brandId)
    {
        this.brandId = brandId;
        return this;
    }
}