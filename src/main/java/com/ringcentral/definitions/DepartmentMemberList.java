package com.ringcentral.definitions;


    /**
* Please note that legacy 'Department' extension type corresponds to
* 'Call Queue' extensions in modern RingCentral product terminology
* 
*/
public class DepartmentMemberList
{
    /**
     * Canonical URL of the resource
     * Format: uri
     */
    public String uri;
    public DepartmentMemberList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * List of call queue member extensions
     */
    public ExtensionInfo[] records;
    public DepartmentMemberList records(ExtensionInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public ProvisioningNavigationInfo navigation;
    public DepartmentMemberList navigation(ProvisioningNavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public ProvisioningPagingInfo paging;
    public DepartmentMemberList paging(ProvisioningPagingInfo paging)
    {
        this.paging = paging;
        return this;
    }
}