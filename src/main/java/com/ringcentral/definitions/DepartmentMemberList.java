package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DepartmentMemberList
{
    // List of department members extensions
    public ExtensionInfo[] records;
    public DepartmentMemberList records(ExtensionInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public DepartmentMemberList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public DepartmentMemberList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
