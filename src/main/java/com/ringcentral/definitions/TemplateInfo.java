package com.ringcentral.definitions;


public class TemplateInfo
{
    /**
         * Link to a template
         */
        public String uri;
  public TemplateInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a template
         */
        public String id;
  public TemplateInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Enum: UserSettings, CallHandling
         */
        public String type;
  public TemplateInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Name of a template
         */
        public String name;
  public TemplateInfo name(String name)
  {
    this.name = name;
    return this;
  }
  

        /**
         * Time of a template creation
         */
        public String creationTime;
  public TemplateInfo creationTime(String creationTime)
  {
    this.creationTime = creationTime;
    return this;
  }
  

        /**
         * Time of the last template modification
         */
        public String lastModifiedTime;
  public TemplateInfo lastModifiedTime(String lastModifiedTime)
  {
    this.lastModifiedTime = lastModifiedTime;
    return this;
  }
  
}
