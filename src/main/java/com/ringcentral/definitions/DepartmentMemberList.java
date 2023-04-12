package com.ringcentral.definitions;


/**
 * Please note that legacy 'Department' extension type corresponds to
 * 'Call Queue' extensions in modern RingCentral product terminology
 */
public class DepartmentMemberList {
    /**
     * Canonical URL of the resource
     * Format: uri
     */
    public String uri;
    /**
     * List of call queue member extensions
     */
    public ExtensionInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public DepartmentMemberList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DepartmentMemberList records(ExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public DepartmentMemberList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public DepartmentMemberList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
