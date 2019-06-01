package com.ringcentral.definitions;


public class RangesInfo {
    /**
     * Starting datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601), for example *2018-10-29T14:00:00*, *2018-10-29T14:00:00Z*, *2018-10-29T14:00:00+0100*
     */
    public String from;
    /**
     * Ending datetime in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601), for example *2018-10-29T14:00:00*, *2018-10-29T14:00:00Z*, *2018-10-29T14:00:00+0100*
     */
    public String to;

    public RangesInfo from(String from) {
        this.from = from;
        return this;
    }

    public RangesInfo to(String to) {
        this.to = to;
        return this;
    }

}
