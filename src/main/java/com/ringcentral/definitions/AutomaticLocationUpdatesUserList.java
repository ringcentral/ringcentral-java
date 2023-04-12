package com.ringcentral.definitions;


public class AutomaticLocationUpdatesUserList {
    /**
     * Link to the users list resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public AutomaticLocationUpdatesUserInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public AutomaticLocationUpdatesUserList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AutomaticLocationUpdatesUserList records(AutomaticLocationUpdatesUserInfo[] records) {
        this.records = records;
        return this;
    }

    public AutomaticLocationUpdatesUserList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public AutomaticLocationUpdatesUserList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
