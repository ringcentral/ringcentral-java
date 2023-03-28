package com.ringcentral.definitions;


public class TaskResultRecordErrorsInfo {
    /**
     *
     */
    public String errorCode;
    /**
     *
     */
    public String message;
    /**
     *
     */
    public String parameterName;
    /**
     *
     */
    public String description;

    public TaskResultRecordErrorsInfo errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public TaskResultRecordErrorsInfo message(String message) {
        this.message = message;
        return this;
    }

    public TaskResultRecordErrorsInfo parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    public TaskResultRecordErrorsInfo description(String description) {
        this.description = description;
        return this;
    }
}
