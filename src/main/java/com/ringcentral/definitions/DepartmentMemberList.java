package com.ringcentral.definitions;


public class DepartmentMemberList {
    /**
     * Link to the list of department members
     */
    public String uri;
    /**
     * List of department members extensions
     */
    public ExtensionInfo[] records;
    /**
     * Information on navigation
     */
    public ProvisioningNavigationInfo navigation;
    /**
     * Information on paging
     */
    public ProvisioningPagingInfo paging;

    public DepartmentMemberList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DepartmentMemberList records(ExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public DepartmentMemberList navigation(ProvisioningNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public DepartmentMemberList paging(ProvisioningPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
