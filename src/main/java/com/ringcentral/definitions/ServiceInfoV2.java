package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


/**
 * Service Plan information (billing package, brand, etc.)
 */
public class ServiceInfoV2 {
    /**
     * Required
     */
    @SerializedName("package")
    public ServiceInfoPackage _package;
    /**
     *
     */
    public ServiceInfoPackage partnerPackage;
    /**
     *
     */
    public ServiceInfoBrand brand;
    /**
     *
     */
    public ServiceInfoContractedCountryId contractedCountry;
    /**
     *
     */
    public ServiceInfoUBrand uBrand;
    /**
     *
     */
    public ServiceInfoPlanV2 servicePlan;

    public ServiceInfoV2 _package(ServiceInfoPackage _package) {
        this._package = _package;
        return this;
    }

    public ServiceInfoV2 partnerPackage(ServiceInfoPackage partnerPackage) {
        this.partnerPackage = partnerPackage;
        return this;
    }

    public ServiceInfoV2 brand(ServiceInfoBrand brand) {
        this.brand = brand;
        return this;
    }

    public ServiceInfoV2 contractedCountry(ServiceInfoContractedCountryId contractedCountry) {
        this.contractedCountry = contractedCountry;
        return this;
    }

    public ServiceInfoV2 uBrand(ServiceInfoUBrand uBrand) {
        this.uBrand = uBrand;
        return this;
    }

    public ServiceInfoV2 servicePlan(ServiceInfoPlanV2 servicePlan) {
        this.servicePlan = servicePlan;
        return this;
    }
}
