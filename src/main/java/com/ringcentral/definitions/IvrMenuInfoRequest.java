package com.ringcentral.definitions;

public class IvrMenuInfoRequest {
    /** First name of an IVR Menu user */
    public String name;

    public IvrMenuInfoRequest name(String name) {
        this.name = name;
        return this;
    }

    /** Number of an IVR Menu extension */
    public String extensionNumber;

    public IvrMenuInfoRequest extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** */
    public IvrMenuSiteInfo site;

    public IvrMenuInfoRequest site(IvrMenuSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public IvrMenuPromptInfo prompt;

    public IvrMenuInfoRequest prompt(IvrMenuPromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Keys handling settings */
    public IvrMenuActionsInfo[] actions;

    public IvrMenuInfoRequest actions(IvrMenuActionsInfo[] actions) {
        this.actions = actions;
        return this;
    }
}
