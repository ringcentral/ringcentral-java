package com.ringcentral.definitions;

public class SiteIVRSettings {
    /** */
    public SiteIVRTopMenu topMenu;

    public SiteIVRSettings topMenu(SiteIVRTopMenu topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    /**
     * Number of attempts the IVR prompt will be played during a call before the &quot;NoInput&quot;
     * rule will be executed. For request payloads, unsupported values return a `CMN-101` error.
     * Required Format: int32 Enum: 1, 2, 3
     */
    public Long promptRepeatCount;

    public SiteIVRSettings promptRepeatCount(Long promptRepeatCount) {
        this.promptRepeatCount = promptRepeatCount;
        return this;
    }

    /** */
    public SiteIvrActions[] actions;

    public SiteIVRSettings actions(SiteIvrActions[] actions) {
        this.actions = actions;
        return this;
    }
}
