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
    public ServiceInfoBrand brand;

    public ServiceInfoV2 _package(ServiceInfoPackage _package) {
        this._package = _package;
        return this;
    }

    public ServiceInfoV2 brand(ServiceInfoBrand brand) {
        this.brand = brand;
        return this;
    }
}
