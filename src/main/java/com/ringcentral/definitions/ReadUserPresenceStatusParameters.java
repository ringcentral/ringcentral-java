package com.ringcentral.definitions;


public class ReadUserPresenceStatusParameters {
    /**
     * Whether to return detailed telephony state
     */
    public Boolean detailedTelephonyState;
    /**
     * Whether to return SIP data
     */
    public Boolean sipData;

    public ReadUserPresenceStatusParameters detailedTelephonyState(Boolean detailedTelephonyState) {
        this.detailedTelephonyState = detailedTelephonyState;
        return this;
    }

    public ReadUserPresenceStatusParameters sipData(Boolean sipData) {
        this.sipData = sipData;
        return this;
    }

}
