package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class CompanyDirectoryContacts
{
    // List of countries which can be selected for a dialing plan
    public CompanyDirectoryContactInfo[] records;
    public CompanyDirectoryContacts records(CompanyDirectoryContactInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on paging
    public PagingInfo paging;
    public CompanyDirectoryContacts paging(PagingInfo paging) {
        this.paging = paging;
        return this;
    }
}
