package com.ringcentral.definitions;

public class DialingDetailsServiceCode {
    /** Example: *811 */
    public String dialing;

    public DialingDetailsServiceCode dialing(String dialing) {
        this.dialing = dialing;
        return this;
    }

    /**
     * Absent if the response&#039;s attribute `results.originalString` value doesn&#039;t contain a
     * valid RingCentral&#039;s service code. Example: *8xx
     */
    public String pattern;

    public DialingDetailsServiceCode pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
}
