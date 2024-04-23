package com.ringcentral.definitions;


/**
 * Recordings preferences
 */
public class RecordingsPreferences {
    /**
     *
     */
    public EveryoneCanControl everyoneCanControl;
    /**
     *
     */
    public AutoShared autoShared;

    public RecordingsPreferences everyoneCanControl(EveryoneCanControl everyoneCanControl) {
        this.everyoneCanControl = everyoneCanControl;
        return this;
    }

    public RecordingsPreferences autoShared(AutoShared autoShared) {
        this.autoShared = autoShared;
        return this;
    }
}
