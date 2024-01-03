package com.ringcentral.definitions;


public class AccountInfo {
    /**
     * Internal identifier of RingCentral account
     * Required
     * Example: 8000012345
     */
    public String id;
    /**
     * External account ID. Used as a primary key to link accounts between
     * RingCentral and partner systems.
     * Example: acme-us-12345
     */
    public String externalAccountId;
    /**
     * Phone number in e.164 format (with &#039;+&#039; prefix)
     * Example: +16501234567
     */
    public String mainNumber;
    /**
     * Account status
     * Required
     * Example: Confirmed
     * Enum: Initial, Unconfirmed, Confirmed, Disabled
     */
    public String status;
    /**
     *
     */
    public StatusInfo statusInfo;
    /**
     * Company name
     * Example: Acme Inc.
     */
    public String companyName;
    /**
     *
     */
    public PostalAddress companyAddress;
    /**
     * Required
     */
    public ServiceInfoV2 serviceInfo;
    /**
     *
     */
    public SystemUserContactInfo contactInfo;
    /**
     * Opportunity identifier (typically created by SalesForce)
     * Example: 0061800000DwZzJAAV
     */
    public String opportunityId;

    public AccountInfo id(String id) {
        this.id = id;
        return this;
    }

    public AccountInfo externalAccountId(String externalAccountId) {
        this.externalAccountId = externalAccountId;
        return this;
    }

    public AccountInfo mainNumber(String mainNumber) {
        this.mainNumber = mainNumber;
        return this;
    }

    public AccountInfo status(String status) {
        this.status = status;
        return this;
    }

    public AccountInfo statusInfo(StatusInfo statusInfo) {
        this.statusInfo = statusInfo;
        return this;
    }

    public AccountInfo companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    public AccountInfo companyAddress(PostalAddress companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }

    public AccountInfo serviceInfo(ServiceInfoV2 serviceInfo) {
        this.serviceInfo = serviceInfo;
        return this;
    }

    public AccountInfo contactInfo(SystemUserContactInfo contactInfo) {
        this.contactInfo = contactInfo;
        return this;
    }

    public AccountInfo opportunityId(String opportunityId) {
        this.opportunityId = opportunityId;
        return this;
    }
}
