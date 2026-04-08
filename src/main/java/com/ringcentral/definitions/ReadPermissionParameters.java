package com.ringcentral.definitions;

/** Query parameters for operation readPermission */
public class ReadPermissionParameters {
    /** Internal identifier of a service plan */
    public String servicePlanId;

    public ReadPermissionParameters servicePlanId(String servicePlanId) {
        this.servicePlanId = servicePlanId;
        return this;
    }
}
