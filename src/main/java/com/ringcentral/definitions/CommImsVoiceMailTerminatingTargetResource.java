package com.ringcentral.definitions;


public class CommImsVoiceMailTerminatingTargetResource {
    /**
     * Required
     */
    public String name;
    /**
     * Terminating target type
     * Required
     * Example: ImsVoiceMailTerminatingTarget
     * Enum: ExtensionTerminatingTarget, PhoneNumberTerminatingTarget, PlayAnnouncementTerminatingTarget, VoiceMailTerminatingTarget, ImsVoiceMailTerminatingTarget
     */
    public String type;

    public CommImsVoiceMailTerminatingTargetResource name(String name) {
        this.name = name;
        return this;
    }

    public CommImsVoiceMailTerminatingTargetResource type(String type) {
        this.type = type;
        return this;
    }
}
