package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserList {
    /**
     * Link to the users list resource
     */
    public String uri;
    /**
     *
     */
    public AutomaticLocationUpdatesUserInfo[] records;
    /**
     *
     */
    public ProvisioningNavigationInfo navigation;
    /**
     *
     */
    public ProvisioningPagingInfo paging;

    public AutomaticLocationUpdatesUserList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AutomaticLocationUpdatesUserList records(AutomaticLocationUpdatesUserInfo[] records) {
        this.records = records;
        return this;
    }

    public AutomaticLocationUpdatesUserList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public AutomaticLocationUpdatesUserList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
