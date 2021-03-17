package com.ringcentral.definitions;


public class CustomFieldInfo
{
    /**
         * Internal identifier of a custom field
         */
        public String id;
  public CustomFieldInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Custom field value
         */
        public String value;
  public CustomFieldInfo value(String value)
  {
    this.value = value;
    return this;
  }
  

        /**
         */
        public String displayName;
  public CustomFieldInfo displayName(String displayName)
  {
    this.displayName = displayName;
    return this;
  }
  
}
