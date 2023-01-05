package com.ringcentral.definitions;


public class UserInMeetingResponse
{
    /**
     */
    public Boolean enableWaitingRoom;
    public UserInMeetingResponse enableWaitingRoom(Boolean enableWaitingRoom)
    {
        this.enableWaitingRoom = enableWaitingRoom;
        return this;
    }

    /**
     */
    public Boolean breakoutRoom;
    public UserInMeetingResponse breakoutRoom(Boolean breakoutRoom)
    {
        this.breakoutRoom = breakoutRoom;
        return this;
    }

    /**
     */
    public Boolean chat;
    public UserInMeetingResponse chat(Boolean chat)
    {
        this.chat = chat;
        return this;
    }

    /**
     */
    public Boolean polling;
    public UserInMeetingResponse polling(Boolean polling)
    {
        this.polling = polling;
        return this;
    }

    /**
     */
    public Boolean annotation;
    public UserInMeetingResponse annotation(Boolean annotation)
    {
        this.annotation = annotation;
        return this;
    }

    /**
     */
    public Boolean virtualBackground;
    public UserInMeetingResponse virtualBackground(Boolean virtualBackground)
    {
        this.virtualBackground = virtualBackground;
        return this;
    }

    /**
     */
    public Boolean screenSharing;
    public UserInMeetingResponse screenSharing(Boolean screenSharing)
    {
        this.screenSharing = screenSharing;
        return this;
    }

    /**
     */
    public Boolean requestPermissionToUnmute;
    public UserInMeetingResponse requestPermissionToUnmute(Boolean requestPermissionToUnmute)
    {
        this.requestPermissionToUnmute = requestPermissionToUnmute;
        return this;
    }
}