package com.ringcentral.definitions;

public class CreateSiteRequest {
    /** Internal identifier of a site extension */
    public String id;

    public CreateSiteRequest id(String id) {
        this.id = id;
        return this;
    }

    /** Extension user first name */
    public String name;

    public CreateSiteRequest name(String name) {
        this.name = name;
        return this;
    }

    /** Extension number */
    public String extensionNumber;

    public CreateSiteRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Custom name of a caller. Max number of characters is 15 (only alphabetical symbols, numbers
     * and commas are supported)
     */
    public String callerIdName;

    public CreateSiteRequest callerIdName(String callerIdName) {
        this.callerIdName = callerIdName;
        return this;
    }

    /** Extension user email Format: email */
    public String email;

    public CreateSiteRequest email(String email) {
        this.email = email;
        return this;
    }

    /** */
    public ContactBusinessAddressInfo businessAddress;

    public CreateSiteRequest businessAddress(ContactBusinessAddressInfo businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    /** */
    public RegionalSettings regionalSettings;

    public CreateSiteRequest regionalSettings(RegionalSettings regionalSettings) {
        this.regionalSettings = regionalSettings;
        return this;
    }

    /** */
    public SiteOperatorReference operator;

    public CreateSiteRequest operator(SiteOperatorReference operator) {
        this.operator = operator;
        return this;
    }

    /** Site access status for cross-site limitation Enum: Limited, Unlimited */
    public String siteAccess;

    public CreateSiteRequest siteAccess(String siteAccess) {
        this.siteAccess = siteAccess;
        return this;
    }

    /** */
    public String[] accessibleSiteIds;

    public CreateSiteRequest accessibleSiteIds(String[] accessibleSiteIds) {
        this.accessibleSiteIds = accessibleSiteIds;
        return this;
    }

    /** Site code value */
    public String code;

    public CreateSiteRequest code(String code) {
        this.code = code;
        return this;
    }

    /** */
    public CostCenterInfo costCenter;

    public CreateSiteRequest costCenter(CostCenterInfo costCenter) {
        this.costCenter = costCenter;
        return this;
    }
}
