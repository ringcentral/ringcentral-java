package com.ringcentral.definitions;


public class SiteIVRSettingsUpdate {
    /**
     *
     */
    public SiteIVRTopMenuUpdate topMenu;
    /**
     *
     */
    public SiteIvrActions[] actions;

    public SiteIVRSettingsUpdate topMenu(SiteIVRTopMenuUpdate topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    public SiteIVRSettingsUpdate actions(SiteIvrActions[] actions) {
        this.actions = actions;
        return this;
    }
}
