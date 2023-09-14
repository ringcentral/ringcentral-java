package com.ringcentral.definitions;


/**
 * Query parameters for operation readUserPresenceStatus
 */
public class ReadUserPresenceStatusParameters {
    /**
     * Specifies whether to return a detailed telephony state or not
     */
    public Boolean detailedTelephonyState;
    /**
     * Specifies whether to return SIP data or not
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
