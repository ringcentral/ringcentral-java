package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class BannerInfo
{
    // Type of a banner
    public String bannerType;
    public BannerInfo bannerType(String bannerType) {
        this.bannerType = bannerType;
        return this;
    }
    // Custom text description of a banner
    public String description;
    public BannerInfo description(String description) {
        this.description = description;
        return this;
    }
    // HTML formatted message content
    public String content;
    public BannerInfo content(String content) {
        this.content = content;
        return this;
    }
    // Datetime of message expiration in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z
    public String expirationDate;
    public BannerInfo expirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
}
