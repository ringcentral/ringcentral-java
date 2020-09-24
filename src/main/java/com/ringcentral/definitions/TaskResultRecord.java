package com.ringcentral.definitions;


public class TaskResultRecord {
    /**
     * Internal identifier of the created/updated element - wireless point or network switch
     */
    public String id;
    /**
     * Unique 48-bit identifier of the wireless access point complying with MAC address conventions. Returned only for 'Wireless Points Bulk Create' tasks
     */
    public String bssid;
    /**
     * Unique identifier of a network switch. Returned only for 'Switches Bulk Create' tasks
     */
    public String chassisId;
    /**
     * Operation status
     */
    public String status;
    /**
     *
     */
    public TaskResultRecordErrorsInfo[] errors;

    public TaskResultRecord id(String id) {
        this.id = id;
        return this;
    }

    public TaskResultRecord bssid(String bssid) {
        this.bssid = bssid;
        return this;
    }

    public TaskResultRecord chassisId(String chassisId) {
        this.chassisId = chassisId;
        return this;
    }

    public TaskResultRecord status(String status) {
        this.status = status;
        return this;
    }

    public TaskResultRecord errors(TaskResultRecordErrorsInfo[] errors) {
        this.errors = errors;
        return this;
    }

}
