package com.ringcentral.definitions;


public class ParticipantTypeModel {
    /**
     * The type of the participant specified in invite or determined at join time
     * Required
     * Default: User
     * Enum: User, Room
     */
    public String type;

    public ParticipantTypeModel type(String type) {
        this.type = type;
        return this;
    }
}
