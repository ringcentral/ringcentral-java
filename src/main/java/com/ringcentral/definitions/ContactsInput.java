package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ContactsInput
{
    //
    public PersonalContactResource[] records;
    public ContactsInput records(PersonalContactResource[] records) {
        this.records = records;
        return this;
    }
}
