package com.ringcentral.definitions;

public class MeetingInfo {
    // Canonical URI of a meeting resource
    public String uri;
    // Internal identifier of a meeting as retrieved from Zoom
    public String id;
    // Topic of a meeting
    public String topic;
    // Type of a meeting
    public String meetingType;
    // Password required to join a meeting
    public String password;
    // Current status of a meeting
    public String status;
    // Links to start/join the meeting
    public LinksInfo links;
    // Schedule of a meeting
    public MeetingScheduleInfo schedule;
    // If 'True' then the meeting can be joined and started by any participant (not host only). Supported for the meetings of 'Scheduled' and 'Recurring' type.
    public Boolean allowJoinBeforeHost;
    // Enables starting video when host joins the meeting
    public Boolean startHostVideo;
    // Enables starting video when participants join the meeting
    public Boolean startParticipantsVideo;
    // Meeting audio options. Possible values are 'Phone', 'ComputerAudio'
    public String[] audioOptions;
}
