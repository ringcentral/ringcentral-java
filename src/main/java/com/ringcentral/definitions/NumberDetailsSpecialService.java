package com.ringcentral.definitions;

public class NumberDetailsSpecialService {
    /**
     * The type of special service. Example: NonEmergencyMedical Enum: Emergency,
     * DirectoryAssistance, UpdateEmergencyAddress, CustomerSupport, NonEmergencyPolice,
     * NonEmergencyMedical, TelecommunicationRelay, Unsupported, Supplementary, Unknown
     */
    public String type;

    public NumberDetailsSpecialService type(String type) {
        this.type = type;
        return this;
    }

    /** Example: 116xxx */
    public String pattern;

    public NumberDetailsSpecialService pattern(String pattern) {
        this.pattern = pattern;
        return this;
    }
}
