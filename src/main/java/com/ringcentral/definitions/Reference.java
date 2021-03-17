package com.ringcentral.definitions;


public class Reference
{
    /**
         * Enum: PartnerId, CustomerDirectoryId
         */
        public String type;
  public Reference type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public String ref;
  public Reference ref(String ref)
  {
    this.ref = ref;
    return this;
  }
  
}
