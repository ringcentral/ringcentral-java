package com.ringcentral.definitions;


public class TaskResultRecordErrorsInfo
{
    /**
     */
    public String errorCode;
    public TaskResultRecordErrorsInfo errorCode(String errorCode)
    {
        this.errorCode = errorCode;
        return this;
    }

    /**
     */
    public String message;
    public TaskResultRecordErrorsInfo message(String message)
    {
        this.message = message;
        return this;
    }

    /**
     */
    public String parameterName;
    public TaskResultRecordErrorsInfo parameterName(String parameterName)
    {
        this.parameterName = parameterName;
        return this;
    }

    /**
     */
    public String description;
    public TaskResultRecordErrorsInfo description(String description)
    {
        this.description = description;
        return this;
    }
}