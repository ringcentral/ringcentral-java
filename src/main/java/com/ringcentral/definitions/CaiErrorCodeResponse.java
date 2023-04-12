package com.ringcentral.definitions;


public class CaiErrorCodeResponse {
    /**
     * Required
     * Enum: CAI-101, CAI-102, CAI-103, CAI-104, CAI-105, CAI-106, CAI-107, CAI-108, CAI-109, CAI-110
     */
    public String errorCode;
    /**
     * Helpful description of the errorCode
     * Required
     */
    public String message;
    /**
     * Name of parameter if specified in the message
     */
    public String parameterName;

    public CaiErrorCodeResponse errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public CaiErrorCodeResponse message(String message) {
        this.message = message;
        return this;
    }

    public CaiErrorCodeResponse parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }
}
