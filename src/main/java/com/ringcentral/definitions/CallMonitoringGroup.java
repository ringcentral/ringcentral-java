package com.ringcentral.definitions;


public class CallMonitoringGroup
{
    /**
         * Link to a call monitoring group resource
         */
        public String uri;
  public CallMonitoringGroup uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a group
         */
        public String id;
  public CallMonitoringGroup id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Name of a group
         */
        public String name;
  public CallMonitoringGroup name(String name)
  {
    this.name = name;
    return this;
  }
  
}
