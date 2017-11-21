package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class InProductMessages
{
    // Link to the in-product messages resource
    public String uri;
    public InProductMessages uri(String uri) {
        this.uri = uri;
        return this;
    }
    // The list of in-product messages
    public BannerInfo[] records;
    public InProductMessages records(BannerInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public InProductMessages navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public InProductMessages paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
