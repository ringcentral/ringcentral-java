package com.ringcentral.definitions;


public class CommStateConditionRequest
{
    /**
     * State condition type
     * Required
     * Enum: Schedule, State
     */
    public String type;
    public CommStateConditionRequest type(String type)
    {
        this.type = type;
        return this;
    }
}