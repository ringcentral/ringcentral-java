package com.ringcentral.definitions;

/** Controls whether recording can be auto shared */
public class AutoShared {
    /** Controls whether preference is enabled Example: true */
    public Boolean enabled;

    public AutoShared enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /** Describes whether preference is locked on Service Web */
    public Boolean locked;

    public AutoShared locked(Boolean locked) {
        this.locked = locked;
        return this;
    }
}
