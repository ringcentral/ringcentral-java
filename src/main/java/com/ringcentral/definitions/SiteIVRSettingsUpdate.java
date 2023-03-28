package com.ringcentral.definitions;


public class SiteIVRSettingsUpdate {
    /**
     *
     */
    public SiteIVRTopMenuUpdate topMenu;
    /**
     *
     */
    public SiteIvrActionsUpdate[] actions;

    public SiteIVRSettingsUpdate topMenu(SiteIVRTopMenuUpdate topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    public SiteIVRSettingsUpdate actions(SiteIvrActionsUpdate[] actions) {
        this.actions = actions;
        return this;
    }
}
