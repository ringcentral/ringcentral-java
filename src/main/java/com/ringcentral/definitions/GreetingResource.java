package com.ringcentral.definitions;


public class GreetingResource
{
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    public GreetingResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Here `Default` indicates that all greetings of that type
    * (in all languages) are default. If at least one greeting (in any language)
    * of the specified type is custom, then `Custom` is returned.
     * Enum: Default, Custom
     */
    public String mode;
    public GreetingResource mode(String mode)
    {
        this.mode = mode;
        return this;
    }
}