package com.ringcentral.definitions;


public class PermissionIdResource
{
    /**
         */
        public String uri;
  public PermissionIdResource uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         */
        public String id;
  public PermissionIdResource id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Site compatibility flag set for permission
         * Enum: Compatible, Incompatible, Independent
         */
        public String siteCompatible;
  public PermissionIdResource siteCompatible(String siteCompatible)
  {
    this.siteCompatible = siteCompatible;
    return this;
  }
  

        /**
         * Specifies if the permission is editable on UI (if set to 'True') or not (if set to 'False')
         */
        public Boolean readOnly;
  public PermissionIdResource readOnly(Boolean readOnly)
  {
    this.readOnly = readOnly;
    return this;
  }
  

        /**
         * Specifies if the permission can be assigned by the account administrator
         */
        public Boolean assignable;
  public PermissionIdResource assignable(Boolean assignable)
  {
    this.assignable = assignable;
    return this;
  }
  
}
