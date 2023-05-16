package com.ringcentral.definitions;


/**
 * Returns the list of recurring licenses on the account
 */
public class LicensesStatisticsResponse {
    /**
     * Required
     */
    public LicensesStatisticsResponseItem[] licenses;

    public LicensesStatisticsResponse licenses(LicensesStatisticsResponseItem[] licenses) {
        this.licenses = licenses;
        return this;
    }
}
