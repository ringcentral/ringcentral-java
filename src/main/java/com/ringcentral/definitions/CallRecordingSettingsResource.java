package com.ringcentral.definitions;


public class CallRecordingSettingsResource {
    /**
     *
     */
    public OnDemandResource onDemand;
    /**
     *
     */
    public AutomaticRecordingResource automatic;
    /**
     * Collection of Greeting Info
     */
    public GreetingResource[] greetings;

    public CallRecordingSettingsResource onDemand(OnDemandResource onDemand) {
        this.onDemand = onDemand;
        return this;
    }

    public CallRecordingSettingsResource automatic(AutomaticRecordingResource automatic) {
        this.automatic = automatic;
        return this;
    }

    public CallRecordingSettingsResource greetings(GreetingResource[] greetings) {
        this.greetings = greetings;
        return this;
    }

}
