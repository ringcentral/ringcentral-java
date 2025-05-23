package com.ringcentral.definitions;


public class CommTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;

    public CommTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
