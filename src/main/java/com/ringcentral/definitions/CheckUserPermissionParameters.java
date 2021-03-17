package com.ringcentral.definitions;


public class CheckUserPermissionParameters
{
    /**
         */
        public String permissionId;
  public CheckUserPermissionParameters permissionId(String permissionId)
  {
    this.permissionId = permissionId;
    return this;
  }
  

        /**
         */
        public String targetExtensionId;
  public CheckUserPermissionParameters targetExtensionId(String targetExtensionId)
  {
    this.targetExtensionId = targetExtensionId;
    return this;
  }
  
}
