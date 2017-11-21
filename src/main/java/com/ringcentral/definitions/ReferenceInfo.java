package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ReferenceInfo
{
    // Non-RC identifier of an extension
    public String ref;
    public ReferenceInfo ref(String ref) {
        this.ref = ref;
        return this;
    }
    // Type of external identifier
    public String type;
    public ReferenceInfo type(String type) {
        this.type = type;
        return this;
    }
}
