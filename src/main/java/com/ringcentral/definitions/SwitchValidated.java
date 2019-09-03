package com.ringcentral.definitions;


public class SwitchValidated {
    /**
     * Internal identifier of a switch
     */
    public String id;
    /**
     * Unique identifier of a network switch
     */
    public String chassisId;
    /**
     * Validation result status
     * Enum: Valid, Invalid
     */
    public String status;
    /**
     *
     */
    public ValidationError[] errors;

    public SwitchValidated id(String id) {
        this.id = id;
        return this;
    }

    public SwitchValidated chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public SwitchValidated status(String status) {
        this.status = status;
        return this;
    }

    public SwitchValidated errors(ValidationError[] errors) {
        this.errors = errors;
        return this;
    }

}
