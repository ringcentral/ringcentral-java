package com.ringcentral.definitions;


    /**
* Query parameters for operation readUserPresenceStatus
*/
public class ReadUserPresenceStatusParameters
{
    /**
     * Whether to return detailed telephony state
     */
    public Boolean detailedTelephonyState;
    public ReadUserPresenceStatusParameters detailedTelephonyState(Boolean detailedTelephonyState)
    {
        this.detailedTelephonyState = detailedTelephonyState;
        return this;
    }

    /**
     * Whether to return SIP data
     */
    public Boolean sipData;
    public ReadUserPresenceStatusParameters sipData(Boolean sipData)
    {
        this.sipData = sipData;
        return this;
    }
}