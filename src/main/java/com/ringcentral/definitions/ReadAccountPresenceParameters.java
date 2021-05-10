package com.ringcentral.definitions;


// Query parameters for operation readAccountPresence
public class ReadAccountPresenceParameters {
    /**
     * Whether to return detailed telephony state
     */
    public Boolean detailedTelephonyState;
    /**
     * Whether to return SIP data
     */
    public Boolean sipData;
    /**
     * Page number for account presence information
     * Format: int32
     */
    public Long page;
    /**
     * Number for account presence information items per page
     * Format: int32
     */
    public Long perPage;

    public ReadAccountPresenceParameters detailedTelephonyState(Boolean detailedTelephonyState) {
        this.detailedTelephonyState = detailedTelephonyState;
        return this;
    }

    public ReadAccountPresenceParameters sipData(Boolean sipData) {
        this.sipData = sipData;
        return this;
    }

    public ReadAccountPresenceParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ReadAccountPresenceParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }
}
