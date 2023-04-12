package com.ringcentral.definitions;


public class InteractionApiResponse {
    /**
     * Enum: Success, Fail
     */
    public String status;
    /**
     *
     */
    public InteractionApiResponseResponse response;

    public InteractionApiResponse status(String status) {
        this.status = status;
        return this;
    }

    public InteractionApiResponse response(InteractionApiResponseResponse response) {
        this.response = response;
        return this;
    }
}
