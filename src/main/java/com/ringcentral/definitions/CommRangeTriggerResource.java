package com.ringcentral.definitions;

public class CommRangeTriggerResource {
    /** Trigger type Required Example: Range Enum: Daily, Weekly, Range */
    public String triggerType;

    public CommRangeTriggerResource triggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /** Required */
    public CommRangeResource[] ranges;

    public CommRangeTriggerResource ranges(CommRangeResource[] ranges) {
        this.ranges = ranges;
        return this;
    }
}
