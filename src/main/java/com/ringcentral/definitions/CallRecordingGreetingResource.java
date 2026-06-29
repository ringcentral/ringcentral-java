package com.ringcentral.definitions;

public class CallRecordingGreetingResource {
    /** Enum: StartRecording, StopRecording, AutomaticRecording */
    public String type;

    public CallRecordingGreetingResource type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Greeting prompt mode for the given `type`. When at least one custom greeting exists for this
     * type (in any language), the literal value `Custom` is returned. Otherwise the localized
     * display name of the system default prompt is returned (for example `Default` in English or
     * `Par défaut` in French), based on the request locale. Example: Default
     */
    public String mode;

    public CallRecordingGreetingResource mode(String mode) {
        this.mode = mode;
        return this;
    }
}
