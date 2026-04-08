package com.ringcentral.definitions;

public class IvrMenuInfo {
    /** Internal identifier of an IVR Menu extension */
    public String id;

    public IvrMenuInfo id(String id) {
        this.id = id;
        return this;
    }

    /** Link to an IVR Menu extension resource Format: uri */
    public String uri;

    public IvrMenuInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** First name of an IVR Menu user */
    public String name;

    public IvrMenuInfo name(String name) {
        this.name = name;
        return this;
    }

    /** Number of an IVR Menu extension */
    public String extensionNumber;

    public IvrMenuInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** */
    public IvrMenuSiteInfo site;

    public IvrMenuInfo site(IvrMenuSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public IvrMenuPromptInfo prompt;

    public IvrMenuInfo prompt(IvrMenuPromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Keys handling settings */
    public IvrMenuActionsInfo[] actions;

    public IvrMenuInfo actions(IvrMenuActionsInfo[] actions) {
        this.actions = actions;
        return this;
    }
}
