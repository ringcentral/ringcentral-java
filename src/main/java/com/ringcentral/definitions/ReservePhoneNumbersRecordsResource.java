package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReservePhoneNumbersRecordsResource
{
    //
    public ReservePhoneNumberResource[] records;
    public ReservePhoneNumbersRecordsResource records(ReservePhoneNumberResource[] records) {
        this.records = records;
        return this;
    }
}
