package com.ringcentral.definitions;


public class CommTerminatingPromptResource {
    /**
     * Required
     */
    public CommGreetingResource greeting;

    public CommTerminatingPromptResource greeting(CommGreetingResource greeting) {
        this.greeting = greeting;
        return this;
    }
}
