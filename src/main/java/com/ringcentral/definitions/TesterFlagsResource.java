package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TesterFlagsResource
{
    //
    public Boolean tester;
    public TesterFlagsResource tester(Boolean tester) {
        this.tester = tester;
        return this;
    }
    //
    public Boolean autoDelete;
    public TesterFlagsResource autoDelete(Boolean autoDelete) {
        this.autoDelete = autoDelete;
        return this;
    }
    //
    public Boolean noBilling;
    public TesterFlagsResource noBilling(Boolean noBilling) {
        this.noBilling = noBilling;
        return this;
    }
    //
    public Boolean noBillingLimit;
    public TesterFlagsResource noBillingLimit(Boolean noBillingLimit) {
        this.noBillingLimit = noBillingLimit;
        return this;
    }
}
