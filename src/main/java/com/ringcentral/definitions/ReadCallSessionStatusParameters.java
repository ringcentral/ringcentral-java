package com.ringcentral.definitions;


public class ReadCallSessionStatusParameters {
    /**
     * The date and time of a call session latest change
     */
    public String timestamp;
    /**
     * The time frame of awaiting for a status change before sending the resulting one in response
     */
    public String timeout;

    public ReadCallSessionStatusParameters timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public ReadCallSessionStatusParameters timeout(String timeout) {
        this.timeout = timeout;
        return this;
    }

}
