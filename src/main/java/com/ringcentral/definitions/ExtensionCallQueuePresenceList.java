package com.ringcentral.definitions;


public class ExtensionCallQueuePresenceList {
    /**
     *
     */
    public ExtensionCallQueuePresence[] records;

    public ExtensionCallQueuePresenceList records(ExtensionCallQueuePresence[] records) {
        this.records = records;
        return this;
    }

}
