package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GetExtensionPhoneNumbersResponse
{
    // List of phone numbers
    public PhoneNumberInfo[] records;
    public GetExtensionPhoneNumbersResponse records(PhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public GetExtensionPhoneNumbersResponse navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public GetExtensionPhoneNumbersResponse paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
