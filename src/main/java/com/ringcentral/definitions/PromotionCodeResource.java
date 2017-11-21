package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PromotionCodeResource
{
    //
    public String accountId;
    public PromotionCodeResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String promotionCode;
    public PromotionCodeResource promotionCode(String promotionCode) {
        this.promotionCode = promotionCode;
        return this;
    }
}
