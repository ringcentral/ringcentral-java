package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class UserResponse
{
    /**
         * user status
         */
        public Boolean active;
  public UserResponse active(Boolean active)
  {
    this.active = active;
    return this;
  }
  

        /**
         */
        public UserAddress[] addresses;
  public UserResponse addresses(UserAddress[] addresses)
  {
    this.addresses = addresses;
    return this;
  }
  

        /**
         * Required
         */
        public Email[] emails;
  public UserResponse emails(Email[] emails)
  {
    this.emails = emails;
    return this;
  }
  

        /**
         * external unique resource id defined by provisioning client
         */
        public String externalId;
  public UserResponse externalId(String externalId)
  {
    this.externalId = externalId;
    return this;
  }
  

        /**
         * unique resource id defined by RingCentral
         */
        public String id;
  public UserResponse id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Required
         */
        public Name name;
  public UserResponse name(Name name)
  {
    this.name = name;
    return this;
  }
  

        /**
         */
        public PhoneNumber[] phoneNumbers;
  public UserResponse phoneNumbers(PhoneNumber[] phoneNumbers)
  {
    this.phoneNumbers = phoneNumbers;
    return this;
  }
  

        /**
         */
        public Photo[] photos;
  public UserResponse photos(Photo[] photos)
  {
    this.photos = photos;
    return this;
  }
  

        /**
         * Required
         */
        public String[] schemas;
  public UserResponse schemas(String[] schemas)
  {
    this.schemas = schemas;
    return this;
  }
  

        /**
         */
        @SerializedName("urn:ietf:params:scim:schemas:extension:enterprise:2.0:User")
        public EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
  public UserResponse urn_ietf_params_scim_schemas_extension_enterprise_2_0_User(EnterpriseUser urn_ietf_params_scim_schemas_extension_enterprise_2_0_User)
  {
    this.urn_ietf_params_scim_schemas_extension_enterprise_2_0_User = urn_ietf_params_scim_schemas_extension_enterprise_2_0_User;
    return this;
  }
  

        /**
         * MUST be same as work type email address
         * Required
         */
        public String userName;
  public UserResponse userName(String userName)
  {
    this.userName = userName;
    return this;
  }
  

        /**
         */
        public Meta meta;
  public UserResponse meta(Meta meta)
  {
    this.meta = meta;
    return this;
  }
  
}
