package com.ringcentral.definitions;

public class CompanyDetails {
    /** Business contact email Format: email */
    public String businessContactEmail;

    public CompanyDetails businessContactEmail(String businessContactEmail) {
        this.businessContactEmail = businessContactEmail;
        return this;
    }

    /** Company name */
    public String companyName;

    public CompanyDetails companyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    /** Industry category */
    public String industryCategory;

    public CompanyDetails industryCategory(String industryCategory) {
        this.industryCategory = industryCategory;
        return this;
    }

    /** Web site URL Format: uri */
    public String webSiteUri;

    public CompanyDetails webSiteUri(String webSiteUri) {
        this.webSiteUri = webSiteUri;
        return this;
    }

    /** Enum: SoleProprietor, PrivateProfit, PublicProfit, NonProfit, Government */
    public String commercialType;

    public CompanyDetails commercialType(String commercialType) {
        this.commercialType = commercialType;
        return this;
    }

    /** */
    public BusinessAddress businessAddress;

    public CompanyDetails businessAddress(BusinessAddress businessAddress) {
        this.businessAddress = businessAddress;
        return this;
    }

    /** */
    public Contact contact;

    public CompanyDetails contact(Contact contact) {
        this.contact = contact;
        return this;
    }
}
