package com.ringcentral.definitions;


public class IVRMenuInfo {
    /**
     * Internal identifier of an IVR Menu extension
     */
    public String id;
    /**
     * Link to an IVR Menu extension resource
     */
    public String uri;
    /**
     * First name of an IVR Menu user
     */
    public String name;
    /**
     * Number of an IVR Menu extension
     */
    public String extensionNumber;
    /**
     * Prompt metadata
     */
    public IVRMenuPromptInfo prompt;
    /**
     * Keys handling settings
     */
    public IVRMenuActionsInfo[] actions;

    public IVRMenuInfo id(String id) {
        this.id = id;
        return this;
    }

    public IVRMenuInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public IVRMenuInfo name(String name) {
        this.name = name;
        return this;
    }

    public IVRMenuInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public IVRMenuInfo prompt(IVRMenuPromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }

    public IVRMenuInfo actions(IVRMenuActionsInfo[] actions) {
        this.actions = actions;
        return this;
    }

}
