package com.ringcentral.definitions;


    // Information on account service plan
public class ServicePlanInfo
{
    /**
         * Internal identifier of a service plan
         */
        public String id;
  public ServicePlanInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Name of a service plan
         */
        public String name;
  public ServicePlanInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Edition of a service plan
         */
        public String edition;
  public ServicePlanInfo edition(String edition)
  {
    this.edition = edition;
    return this;
  }
  

        /**
         * Enum: Freyja, Phoenix
         */
        public String freemiumProductType;
  public ServicePlanInfo freemiumProductType(String freemiumProductType)
  {
    this.freemiumProductType = freemiumProductType;
    return this;
  }
  
}
