package com.ringcentral.definitions;


public class SessionMinimalModel {
    /**
     * Session start time. If a session hasn&#039;t been started this fields should be set to &quot;scheduledStartTime&quot;
     * Format: date-time
     */
    public String startTime;
    /**
     * Session end time. If a session hasn&#039;t been finished this fields should be set to (&quot;startTime&quot;+&quot;scheduledDuration&quot;)
     * Format: date-time
     */
    public String endTime;
    /**
     * Session duration in seconds rounded up (returned if &#039;startTime&#039; and &#039;endTime&#039; are not empty)
     * Format: int32
     * Example: 3600
     */
    public Long duration;
    /**
     * Session title. If blank - derived from webinar title.
     * Example: Live Broadcasting US
     */
    public String title;
    /**
     * User-friendly description of the Session. If blank - derived from webinar title.
     * Example: Live session for US-based participants
     */
    public String description;

    public SessionMinimalModel startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    public SessionMinimalModel endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    public SessionMinimalModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    public SessionMinimalModel title(String title) {
        this.title = title;
        return this;
    }

    public SessionMinimalModel description(String description) {
        this.description = description;
        return this;
    }
}
