package com.ringcentral.definitions;


/**
 * Recordings preferences
 */
public class RecordingsPreferences {
    /**
     *
     */
    public EveryoneCanControl everyoneCanControl;

    public RecordingsPreferences everyoneCanControl(EveryoneCanControl everyoneCanControl) {
        this.everyoneCanControl = everyoneCanControl;
        return this;
    }
}
