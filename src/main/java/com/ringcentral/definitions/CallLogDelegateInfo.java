package com.ringcentral.definitions;


// Information on a delegate extension that actually implemented a call action. For Secretary call log the field is returned if the current extension implemented a call. For Boss call log the field contains information on a Secretary extension which actually implemented a call on behalf of the current extension
public class CallLogDelegateInfo {
    /**
     * Internal identifier of a Secretary extension
     */
    public String id;
    /**
     * Custom name of a Secretary extension
     */
    public String name;

    public CallLogDelegateInfo id(String id) {
        this.id = id;
        return this;
    }

    public CallLogDelegateInfo name(String name) {
        this.name = name;
        return this;
    }
}
