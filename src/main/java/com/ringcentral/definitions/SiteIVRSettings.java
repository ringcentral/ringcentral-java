package com.ringcentral.definitions;

public class SiteIVRSettings {
    /** */
    public SiteIVRTopMenu topMenu;

    public SiteIVRSettings topMenu(SiteIVRTopMenu topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    /** */
    public SiteIvrActions[] actions;

    public SiteIVRSettings actions(SiteIvrActions[] actions) {
        this.actions = actions;
        return this;
    }
}
