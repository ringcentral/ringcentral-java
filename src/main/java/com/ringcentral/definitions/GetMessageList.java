package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetMessageList
{
    // List of records with message information
    public GetMessageInfoResponse[] records;
    public GetMessageList records(GetMessageInfoResponse[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetMessageList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetMessageList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
