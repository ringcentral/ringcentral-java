package com.ringcentral.definitions;


public class AccountInfo
{
    /**
     * Internal identifier of RingCentral account
     * Required
     * Example: 8000012345
     */
    public String id;
    public AccountInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * External account ID. Used as a primary key to link accounts between
    * RingCentral and partner systems.
     * Example: acme-us-12345
     */
    public String externalAccountId;
    public AccountInfo externalAccountId(String externalAccountId)
    {
        this.externalAccountId = externalAccountId;
        return this;
    }

    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String mainNumber;
    public AccountInfo mainNumber(String mainNumber)
    {
        this.mainNumber = mainNumber;
        return this;
    }

    /**
     * Status of an account
     * Required
     * Enum: Initial, Unconfirmed, Confirmed, Disabled
     */
    public String status;
    public AccountInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Company name
     * Example: Acme Inc.
     */
    public String companyName;
    public AccountInfo companyName(String companyName)
    {
        this.companyName = companyName;
        return this;
    }

    /**
     */
    public PostalAddress companyAddress;
    public AccountInfo companyAddress(PostalAddress companyAddress)
    {
        this.companyAddress = companyAddress;
        return this;
    }

    /**
     * Required
     */
    public ServiceInfoV2 serviceInfo;
    public AccountInfo serviceInfo(ServiceInfoV2 serviceInfo)
    {
        this.serviceInfo = serviceInfo;
        return this;
    }

    /**
     */
    public SystemUserContactInfo contactInfo;
    public AccountInfo contactInfo(SystemUserContactInfo contactInfo)
    {
        this.contactInfo = contactInfo;
        return this;
    }

    /**
     * Opportunity identifier (typically created by SalesForce)
     * Example: 0061800000DwZzJAAV
     */
    public String opportunityId;
    public AccountInfo opportunityId(String opportunityId)
    {
        this.opportunityId = opportunityId;
        return this;
    }
}