package com.ringcentral.definitions;


public class GreetingResource {
    /**
     * Enum: StartRecording, StopRecording, AutomaticRecording
     */
    public String type;
    /**
     * &#039;Default&#039; value specifies that all greetings of that type (in all languages) are default, if at least one greeting (in any language) of the specified type is custom, then &#039;Custom&#039; value is returned.
     * Enum: Default, Custom
     */
    public String mode;

    public GreetingResource type(String type) {
        this.type = type;
        return this;
    }

    public GreetingResource mode(String mode) {
        this.mode = mode;
        return this;
    }
}
