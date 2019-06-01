package com.ringcentral.definitions;


public class DeleteUserCallLogParameters {
    /**
     * The end datetime for records deletion in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
     */
    public String dateTo;
    /**
     *
     */
    public String phoneNumber;
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String[] type;
    /**
     *
     */
    public String[] direction;
    /**
     *
     */
    public String dateFrom;

    public DeleteUserCallLogParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public DeleteUserCallLogParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public DeleteUserCallLogParameters extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public DeleteUserCallLogParameters type(String[] type) {
        this.type = type;
        return this;
    }

    public DeleteUserCallLogParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public DeleteUserCallLogParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

}
