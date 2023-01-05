package com.ringcentral.definitions;


public class CallRecordingSettingsResource
{
    /**
     */
    public OnDemandResource onDemand;
    public CallRecordingSettingsResource onDemand(OnDemandResource onDemand)
    {
        this.onDemand = onDemand;
        return this;
    }

    /**
     */
    public AutomaticRecordingResource automatic;
    public CallRecordingSettingsResource automatic(AutomaticRecordingResource automatic)
    {
        this.automatic = automatic;
        return this;
    }

    /**
     * Collection of Greeting Info
     */
    public GreetingResource[] greetings;
    public CallRecordingSettingsResource greetings(GreetingResource[] greetings)
    {
        this.greetings = greetings;
        return this;
    }
}