package com.ringcentral.definitions;


public class SiteIVRSettings {
    /**
     *
     */
    public SiteIVRTopMenu topMenu;
    /**
     *
     */
    public SiteIvrActions[] actions;

    public SiteIVRSettings topMenu(SiteIVRTopMenu topMenu) {
        this.topMenu = topMenu;
        return this;
    }

    public SiteIVRSettings actions(SiteIvrActions[] actions) {
        this.actions = actions;
        return this;
    }
}
