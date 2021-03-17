package com.ringcentral.definitions;


public class TaskResultRecord
{
    /**
         * Internal identifier of the created/updated element - wireless point or network switch
         */
        public String id;
  public TaskResultRecord id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Unique 48-bit identifier of the wireless access point complying with MAC address conventions. Returned only for 'Wireless Points Bulk Create' tasks
         */
        public String bssid;
  public TaskResultRecord bssid(String bssid)
  {
    this.bssid = bssid;
    return this;
  }
  

        /**
         * Unique identifier of a network switch. Returned only for 'Switches Bulk Create' tasks
         */
        public String chassisId;
  public TaskResultRecord chassisId(String chassisId)
  {
    this.chassisId = chassisId;
    return this;
  }
  

        /**
         * Operation status
         */
        public String status;
  public TaskResultRecord status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         */
        public TaskResultRecordErrorsInfo[] errors;
  public TaskResultRecord errors(TaskResultRecordErrorsInfo[] errors)
  {
    this.errors = errors;
    return this;
  }
  
}
