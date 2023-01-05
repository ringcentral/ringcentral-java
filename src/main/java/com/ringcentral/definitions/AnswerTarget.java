package com.ringcentral.definitions;


public class AnswerTarget
{
    /**
     * Device ID that is used to answer to incoming call.
     * Example: 400018633008
     */
    public String deviceId;
    public AnswerTarget deviceId(String deviceId)
    {
        this.deviceId = deviceId;
        return this;
    }
}