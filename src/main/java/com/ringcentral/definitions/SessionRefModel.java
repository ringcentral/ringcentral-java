package com.ringcentral.definitions;

public class SessionRefModel {
    /** Internal object ID Example: 78654321 */
    public String id;

    public SessionRefModel id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Session start time. If a session hasn&#039;t been started this fields should be set to
     * &quot;scheduledStartTime&quot; Format: date-time
     */
    public String startTime;

    public SessionRefModel startTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Session end time. If a session hasn&#039;t been finished this fields should be set to
     * (&quot;startTime&quot;+&quot;scheduledDuration&quot;) Format: date-time
     */
    public String endTime;

    public SessionRefModel endTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Session duration in seconds rounded up (returned if &#039;startTime&#039; and
     * &#039;endTime&#039; are not empty) Format: int32 Example: 3600
     */
    public Long duration;

    public SessionRefModel duration(Long duration) {
        this.duration = duration;
        return this;
    }

    /** Session title. If blank - derived from webinar title. Example: Live Broadcasting US */
    public String title;

    public SessionRefModel title(String title) {
        this.title = title;
        return this;
    }

    /**
     * User-friendly description of the Session. If blank - derived from webinar title. Example:
     * Live session for US-based participants
     */
    public String description;

    public SessionRefModel description(String description) {
        this.description = description;
        return this;
    }

    /** */
    public WebinarRefModel webinar;

    public SessionRefModel webinar(WebinarRefModel webinar) {
        this.webinar = webinar;
        return this;
    }
}
