package com.ringcentral.definitions;


public class DataExportTaskContactInfo {
    /**
     * Internal identifier of a contact
     */
    public String id;
    /**
     * Email address of a contact
     */
    public String email;

    public DataExportTaskContactInfo id(String id) {
        this.id = id;
        return this;
    }

    public DataExportTaskContactInfo email(String email) {
        this.email = email;
        return this;
    }

}
