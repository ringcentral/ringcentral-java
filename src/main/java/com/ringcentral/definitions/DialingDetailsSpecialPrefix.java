package com.ringcentral.definitions;

public class DialingDetailsSpecialPrefix {
    /** Example: 18001 */
    public String dialing;

    public DialingDetailsSpecialPrefix dialing(String dialing) {
        this.dialing = dialing;
        return this;
    }

    /** Example: 18001 */
    public String pattern;

    public DialingDetailsSpecialPrefix pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
}
