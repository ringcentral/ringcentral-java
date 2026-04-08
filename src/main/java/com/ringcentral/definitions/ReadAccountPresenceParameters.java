package com.ringcentral.definitions;


    /**
* Query parameters for operation readAccountPresence
*/
public class ReadAccountPresenceParameters
{
    /**
     * Whether to return detailed telephony state
     */
    public Boolean detailedTelephonyState;
    public ReadAccountPresenceParameters detailedTelephonyState(Boolean detailedTelephonyState)
    {
        this.detailedTelephonyState = detailedTelephonyState;
        return this;
    }

    /**
     * Whether to return SIP data
     */
    public Boolean sipData;
    public ReadAccountPresenceParameters sipData(Boolean sipData)
    {
        this.sipData = sipData;
        return this;
    }

    /**
     * Page number for account presence information
     * Format: int32
     */
    public Long page;
    public ReadAccountPresenceParameters page(Long page)
    {
        this.page = page;
        return this;
    }

    /**
     * Number for account presence information items per page
     * Format: int32
     */
    public Long perPage;
    public ReadAccountPresenceParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}