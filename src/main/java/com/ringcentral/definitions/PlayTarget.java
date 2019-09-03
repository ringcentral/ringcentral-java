package com.ringcentral.definitions;


public class PlayTarget {
    /**
     * Required
     */
    public PlayResource[] resources;
    /**
     * Determines command termination condition: specified milliseconds passed since command start.
     * Required
     */
    public String onResult;
    /**
     * interrupt or not play media by DTMF.
     * Default: true
     */
    public Boolean interruptByDtmf;
    /**
     * Controls if file playing can be repeated until stop or interrupt. 0 is for infinite.
     * Default: 1
     */
    public Long repeatCount;

    public PlayTarget resources(PlayResource[] resources) {
        this.resources = resources;
        return this;
    }

    public PlayTarget onResult(String onResult) {
        this.onResult = onResult;
        return this;
    }

    public PlayTarget interruptByDtmf(Boolean interruptByDtmf) {
        this.interruptByDtmf = interruptByDtmf;
        return this;
    }

    public PlayTarget repeatCount(Long repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

}
