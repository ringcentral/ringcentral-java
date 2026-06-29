package com.ringcentral.definitions;

public class IvrMenuInfoUpdate {
    /** First name of an IVR Menu user */
    public String name;

    public IvrMenuInfoUpdate name(String name) {
        this.name = name;
        return this;
    }

    /** Number of an IVR Menu extension */
    public String extensionNumber;

    public IvrMenuInfoUpdate extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** */
    public IvrMenuSiteInfo site;

    public IvrMenuInfoUpdate site(IvrMenuSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public IvrMenuPromptInfo prompt;

    public IvrMenuInfoUpdate prompt(IvrMenuPromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Keys handling settings */
    public IvrMenuActionsInfo[] actions;

    public IvrMenuInfoUpdate actions(IvrMenuActionsInfo[] actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Number of attempts the IVR prompt will be played during a call before the &quot;NoInput&quot;
     * rule will be executed. For request payloads, unsupported values return a `CMN-101` error.
     * Format: int32 Enum: 1, 2, 3
     */
    public Long promptRepeatCount;

    public IvrMenuInfoUpdate promptRepeatCount(Long promptRepeatCount) {
        this.promptRepeatCount = promptRepeatCount;
        return this;
    }
}
