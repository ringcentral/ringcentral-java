package com.ringcentral.definitions;


public class UpdateGlipEveryoneRequest
{
    /**
         * Everyone chat name. Maximum number of characters supported is 250
         */
        public Long name;
  public UpdateGlipEveryoneRequest name(Long name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Everyone chat description. Maximum number of characters supported is 1000
         */
        public String description;
  public UpdateGlipEveryoneRequest description(String description)
  {
    this.description = description;
    return this;
  }
  
}
