package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class UpdatePresenceLinesResponse
{
    // Canonical URI of the monitored lines (extensions) resource
    public String uri;
    public UpdatePresenceLinesResponse uri(String uri) {
        this.uri = uri;
        return this;
    }
    // List of lines (extensions) the presence of which is monitored by the user. The first two lines always indicate the user's extension presence, they cannot be changed
    public LineInfo[] records;
    public UpdatePresenceLinesResponse records(LineInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public UpdatePresenceLinesResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public UpdatePresenceLinesResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
