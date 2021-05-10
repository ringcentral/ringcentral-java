package com.ringcentral.definitions;


// SharedLines call handling action settings
public class SharedLinesInfo {
    /**
     * Number of seconds to wait before forwarding unanswered calls. The value range is 10 - 80
     */
    public Long timeout;

    public SharedLinesInfo timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
}
