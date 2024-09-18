package com.ringcentral.definitions;


public class CallFlipNumberListResource {
    /**
     * List of call flip numbers
     */
    public CallFlipNumberResource[] records;

    public CallFlipNumberListResource records(CallFlipNumberResource[] records) {
        this.records = records;
        return this;
    }
}
