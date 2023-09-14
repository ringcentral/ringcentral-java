package com.ringcentral.definitions;


public class TaskResultRecord {
    /**
     * Internal identifier of the created/updated element - wireless point or network switch
     */
    public String id;
    /**
     * Unique 48-bit identifier of the wireless access point complying with MAC address conventions. Returned only for &#039;Wireless Points Bulk Create&#039; tasks
     */
    public String bssid;
    /**
     * Unique identifier of a network switch. Returned only for &#039;Switches Bulk Create&#039; tasks
     */
    public String chassisId;
    /**
     * Switch entity extension for better diversity. Should be used together with chassisId.
     */
    public String port;
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

    public TaskResultRecord port(String port) {
        this.port = port;
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
