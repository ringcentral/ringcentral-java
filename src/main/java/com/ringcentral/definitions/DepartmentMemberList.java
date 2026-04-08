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
    public PageNavigationModel navigation;
    public DepartmentMemberList navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public DepartmentMemberList paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}