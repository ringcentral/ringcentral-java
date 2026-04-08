package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


    /**
* Service Plan information (billing package, brand, etc.)
*/
public class ServiceInfoV2
{
    /**
     * Required
     */
    @SerializedName("package")
    public ServiceInfoPackage _package;
    public ServiceInfoV2 _package(ServiceInfoPackage _package)
    {
        this._package = _package;
        return this;
    }

    /**
     */
    public ServiceInfoPackage partnerPackage;
    public ServiceInfoV2 partnerPackage(ServiceInfoPackage partnerPackage)
    {
        this.partnerPackage = partnerPackage;
        return this;
    }

    /**
     */
    public ServiceInfoBrand brand;
    public ServiceInfoV2 brand(ServiceInfoBrand brand)
    {
        this.brand = brand;
        return this;
    }

    /**
     */
    public ServiceInfoContractedCountryId contractedCountry;
    public ServiceInfoV2 contractedCountry(ServiceInfoContractedCountryId contractedCountry)
    {
        this.contractedCountry = contractedCountry;
        return this;
    }

    /**
     */
    public ServiceInfoUBrand uBrand;
    public ServiceInfoV2 uBrand(ServiceInfoUBrand uBrand)
    {
        this.uBrand = uBrand;
        return this;
    }

    /**
     */
    public ServiceInfoPlanV2 servicePlan;
    public ServiceInfoV2 servicePlan(ServiceInfoPlanV2 servicePlan)
    {
        this.servicePlan = servicePlan;
        return this;
    }
}