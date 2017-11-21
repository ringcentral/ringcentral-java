package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PagesInfoReporting
{
    // Name of a page. CFA application UI predefines a set of possible names and treats them as enum constants to distinguish pages by type. This is not user-visible value, as it might need localization. The maximum value is 255
    public String name;
    public PagesInfoReporting name(String name) {
        this.name = name;
        return this;
    }
    // CFA-defined filter values/page parameters
    public String attrX;
    public PagesInfoReporting attrX(String attrX) {
        this.attrX = attrX;
        return this;
    }
}
