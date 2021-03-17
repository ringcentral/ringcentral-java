package com.ringcentral.definitions;


    // Timezone setting. For extension bulk assignment is configured automatically based on contact info setting
public class TimezoneResource
{
    /**
         */
        public String uri;
  public TimezoneResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String id;
  public TimezoneResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public String name;
  public TimezoneResource name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public String description;
  public TimezoneResource description(String description)
  {
    this.description = description;
    return this;
  }
  

        /**
         */
        public String bias;
  public TimezoneResource bias(String bias)
  {
    this.bias = bias;
    return this;
  }
  
}
