package com.ringcentral.paths;

import com.ringcentral.HttpModel;
import com.ringcentral.definitions.MeetingInfo;
import com.ringcentral.definitions.MeetingScheduleInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Meeting {
    public static class PostParameters implements HttpModel {
        // Topic of a meeting
        public String topic;
        // Type of a meeting. 'Instant' - meeting that is instantly started as soon as the host creates it; 'Scheduled' - common scheduled meeting; 'Recurring' - a recurring meeting. If the specified meeting type is 'Scheduled' then schedule property is mandatory for request
        public String meetingType;
        // Password required to join a meeting. Max number of characters is 10
        public String password;
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

        public PostParameters topic(String topic) {
            this.topic = topic;
            return this;
        }

        public PostParameters meetingType(String meetingType) {
            this.meetingType = meetingType;
            return this;
        }

        public PostParameters password(String password) {
            this.password = password;
            return this;
        }

        public PostParameters schedule(MeetingScheduleInfo schedule) {
            this.schedule = schedule;
            return this;
        }

        public PostParameters allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
            this.allowJoinBeforeHost = allowJoinBeforeHost;
            return this;
        }

        public PostParameters startHostVideo(Boolean startHostVideo) {
            this.startHostVideo = startHostVideo;
            return this;
        }

        public PostParameters startParticipantsVideo(Boolean startParticipantsVideo) {
            this.startParticipantsVideo = startParticipantsVideo;
            return this;
        }

        public PostParameters audioOptions(String[] audioOptions) {
            this.audioOptions = audioOptions;
            return this;
        }
    }

    public static class ListResponse implements HttpModel {
        // Canonical URI of meetings resource
        public String uri;
        // List of extension meetings
        public MeetingInfo[] records;
        // Information on paging
        public PagingInfo paging;
        // Information on navigation
        public NavigationInfo navigation;

        public ListResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ListResponse records(MeetingInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }
    }

    public static class PutParameters implements HttpModel {
        // Topic of a meeting
        public String topic;
        // Type of a meeting. 'Instant' - meeting that is instantly started as soon as the host creates it; 'Scheduled' - common scheduled meeting; 'Recurring' - a recurring meeting. If the specified meeting type is 'Scheduled' then schedule property is mandatory for request
        public String meetingType;
        // Password required to join a meeting. Max number of characters is 10
        public String password;
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

        public PutParameters topic(String topic) {
            this.topic = topic;
            return this;
        }

        public PutParameters meetingType(String meetingType) {
            this.meetingType = meetingType;
            return this;
        }

        public PutParameters password(String password) {
            this.password = password;
            return this;
        }

        public PutParameters schedule(MeetingScheduleInfo schedule) {
            this.schedule = schedule;
            return this;
        }

        public PutParameters allowJoinBeforeHost(Boolean allowJoinBeforeHost) {
            this.allowJoinBeforeHost = allowJoinBeforeHost;
            return this;
        }

        public PutParameters startHostVideo(Boolean startHostVideo) {
            this.startHostVideo = startHostVideo;
            return this;
        }

        public PutParameters startParticipantsVideo(Boolean startParticipantsVideo) {
            this.startParticipantsVideo = startParticipantsVideo;
            return this;
        }

        public PutParameters audioOptions(String[] audioOptions) {
            this.audioOptions = audioOptions;
            return this;
        }
    }
}
