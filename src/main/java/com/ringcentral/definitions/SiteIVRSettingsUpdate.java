package com.ringcentral.definitions;

public class SiteIVRSettingsUpdate {
    /** */
    public SiteIVRTopMenuUpdate topMenu;

    public SiteIVRSettingsUpdate topMenu(SiteIVRTopMenuUpdate topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    /** */
    public SiteIvrActions[] actions;

    public SiteIVRSettingsUpdate actions(SiteIvrActions[] actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Number of attempts the IVR prompt will be played during a call before the &quot;NoInput&quot;
     * rule will be executed. For request payloads, unsupported values return a `CMN-101` error.
     * Format: int32 Enum: 1, 2, 3
     */
    public Long promptRepeatCount;

    public SiteIVRSettingsUpdate promptRepeatCount(Long promptRepeatCount) {
        this.promptRepeatCount = promptRepeatCount;
        return this;
    }
}
