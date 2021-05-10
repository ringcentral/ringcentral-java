package com.ringcentral.definitions;


// List of users whose data is collected. The following data will be exported: posts, tasks, events, etc. posted by the user(s); posts addressing the user(s) via direct and @Mentions; tasks assigned to the listed user(s). The list of 10 users per request is supported.
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
