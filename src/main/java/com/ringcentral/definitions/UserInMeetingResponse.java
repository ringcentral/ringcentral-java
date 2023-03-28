package com.ringcentral.definitions;


public class UserInMeetingResponse {
    /**
     *
     */
    public Boolean enableWaitingRoom;
    /**
     *
     */
    public Boolean breakoutRoom;
    /**
     *
     */
    public Boolean chat;
    /**
     *
     */
    public Boolean polling;
    /**
     *
     */
    public Boolean annotation;
    /**
     *
     */
    public Boolean virtualBackground;
    /**
     *
     */
    public Boolean screenSharing;
    /**
     *
     */
    public Boolean requestPermissionToUnmute;

    public UserInMeetingResponse enableWaitingRoom(Boolean enableWaitingRoom) {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    public UserInMeetingResponse breakoutRoom(Boolean breakoutRoom) {
        this.breakoutRoom = breakoutRoom;
        return this;
    }

    public UserInMeetingResponse chat(Boolean chat) {
        this.chat = chat;
        return this;
    }

    public UserInMeetingResponse polling(Boolean polling) {
        this.polling = polling;
        return this;
    }

    public UserInMeetingResponse annotation(Boolean annotation) {
        this.annotation = annotation;
        return this;
    }

    public UserInMeetingResponse virtualBackground(Boolean virtualBackground) {
        this.virtualBackground = virtualBackground;
        return this;
    }

    public UserInMeetingResponse screenSharing(Boolean screenSharing) {
        this.screenSharing = screenSharing;
        return this;
    }

    public UserInMeetingResponse requestPermissionToUnmute(Boolean requestPermissionToUnmute) {
        this.requestPermissionToUnmute = requestPermissionToUnmute;
        return this;
    }
}
