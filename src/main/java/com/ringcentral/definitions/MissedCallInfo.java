package com.ringcentral.definitions;


// Specifies behaviour for the missed call scenario. Returned only if `enabled` parameter of a voicemail is set to 'false'
public class MissedCallInfo {
    /**
     * Specifies the action that should be executed on a missed call. It can either be playing greeting message and disconnection, or sending call to a calling group. If &#039;ConnectToExtension&#039; is set, then calling group extension should be specified
     * Enum: PlayGreetingAndDisconnect, ConnectToExtension
     */
    public String actionType;
    /**
     *
     */
    public MissedCallExtensionInfo extension;

    public MissedCallInfo actionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    public MissedCallInfo extension(MissedCallExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
