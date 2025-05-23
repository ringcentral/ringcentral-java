package com.ringcentral.definitions;


public class CommImsVoiceMailTerminatingTargetRequest {
    /**
     * Terminating target type
     * Required
     * Example: ImsVoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;

    public CommImsVoiceMailTerminatingTargetRequest type(String type) {
        this.type = type;
        return this;
    }
}
