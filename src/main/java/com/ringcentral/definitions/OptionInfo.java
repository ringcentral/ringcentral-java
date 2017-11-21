package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class OptionInfo
{
    // Specifies if the feature is allowed ('True') or disallowed ('False') for the special number
    public Boolean enabled;
    public OptionInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    // The reason explaining why the option is disallowed. Returned if the value of enabled is 'False'
    public OptionInfoReason reason;
    public OptionInfo reason(OptionInfoReason reason) {
        this.reason = reason;
        return this;
    }
}
