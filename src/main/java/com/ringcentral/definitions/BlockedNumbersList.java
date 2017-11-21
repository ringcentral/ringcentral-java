package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BlockedNumbersList
{
    // List of blocked phone numbers
    public BlockedNumberInfo[] records;
    public BlockedNumbersList records(BlockedNumberInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public BlockedNumbersList navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public BlockedNumbersList paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
