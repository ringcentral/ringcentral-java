package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AccountPhoneNumbers
{
    // List of account phone numbers
    public PhoneNumberInfo[] records;
    public AccountPhoneNumbers records(PhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public NavigationInfo navigation;
    public AccountPhoneNumbers navigation(NavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public AccountPhoneNumbers paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
