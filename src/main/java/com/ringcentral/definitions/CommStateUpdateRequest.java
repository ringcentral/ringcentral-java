package com.ringcentral.definitions;

public class CommStateUpdateRequest {
    /**
     * Specifies if a state is enabled or not. *Work Hours* and *After Hours* states cannot be
     * disabled
     */
    public Boolean enabled;

    public CommStateUpdateRequest enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** */
    public Object[] conditions;

    public CommStateUpdateRequest conditions(Object[] conditions) {
        this.conditions = conditions;
        return this;
    }
}
