package com.ringcentral.definitions;

public class IvrMenuInfoCreate {
    /** First name of an IVR Menu user */
    public String name;

    public IvrMenuInfoCreate name(String name) {
        this.name = name;
        return this;
    }

    /** Number of an IVR Menu extension */
    public String extensionNumber;

    public IvrMenuInfoCreate extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** */
    public IvrMenuSiteInfo site;

    public IvrMenuInfoCreate site(IvrMenuSiteInfo site) {
        this.site = site;
        return this;
    }

    /** */
    public IvrMenuPromptInfo prompt;

    public IvrMenuInfoCreate prompt(IvrMenuPromptInfo prompt) {
        this.prompt = prompt;
        return this;
    }

    /** Keys handling settings */
    public IvrMenuActionsInfo[] actions;

    public IvrMenuInfoCreate actions(IvrMenuActionsInfo[] actions) {
        this.actions = actions;
        return this;
    }

    /**
     * Number of attempts the IVR prompt will be played during a call before the &quot;NoInput&quot;
     * rule will be executed. For request payloads, unsupported values return a `CMN-101` error.
     * Format: int32 Default: 3 Enum: 1, 2, 3
     */
    public Long promptRepeatCount;

    public IvrMenuInfoCreate promptRepeatCount(Long promptRepeatCount) {
        this.promptRepeatCount = promptRepeatCount;
        return this;
    }
}
