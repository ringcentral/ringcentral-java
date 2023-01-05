package com.ringcentral.paths.restapi.dictionary;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.Index parent;
public Index(com.ringcentral.paths.restapi.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/dictionary";
        }


  public com.ringcentral.paths.restapi.dictionary.brand.Index brand()
    {
      return this.brand(null);
    }
  public com.ringcentral.paths.restapi.dictionary.brand.Index brand(String brandId)
  {
    return new com.ringcentral.paths.restapi.dictionary.brand.Index(this, brandId);
  }


  public com.ringcentral.paths.restapi.dictionary.state.Index state()
    {
      return this.state(null);
    }
  public com.ringcentral.paths.restapi.dictionary.state.Index state(String stateId)
  {
    return new com.ringcentral.paths.restapi.dictionary.state.Index(this, stateId);
  }


  public com.ringcentral.paths.restapi.dictionary.country.Index country()
    {
      return this.country(null);
    }
  public com.ringcentral.paths.restapi.dictionary.country.Index country(String countryId)
  {
    return new com.ringcentral.paths.restapi.dictionary.country.Index(this, countryId);
  }


  public com.ringcentral.paths.restapi.dictionary.language.Index language()
    {
      return this.language(null);
    }
  public com.ringcentral.paths.restapi.dictionary.language.Index language(String languageId)
  {
    return new com.ringcentral.paths.restapi.dictionary.language.Index(this, languageId);
  }


  public com.ringcentral.paths.restapi.dictionary.greeting.Index greeting()
    {
      return this.greeting(null);
    }
  public com.ringcentral.paths.restapi.dictionary.greeting.Index greeting(String greetingId)
  {
    return new com.ringcentral.paths.restapi.dictionary.greeting.Index(this, greetingId);
  }


  public com.ringcentral.paths.restapi.dictionary.timezone.Index timezone()
    {
      return this.timezone(null);
    }
  public com.ringcentral.paths.restapi.dictionary.timezone.Index timezone(String timezoneId)
  {
    return new com.ringcentral.paths.restapi.dictionary.timezone.Index(this, timezoneId);
  }


    public com.ringcentral.paths.restapi.dictionary.location.Index location()
  {
    return new com.ringcentral.paths.restapi.dictionary.location.Index(this);
  }


  public com.ringcentral.paths.restapi.dictionary.userrole.Index userRole()
    {
      return this.userRole(null);
    }
  public com.ringcentral.paths.restapi.dictionary.userrole.Index userRole(String roleId)
  {
    return new com.ringcentral.paths.restapi.dictionary.userrole.Index(this, roleId);
  }


  public com.ringcentral.paths.restapi.dictionary.permission.Index permission()
    {
      return this.permission(null);
    }
  public com.ringcentral.paths.restapi.dictionary.permission.Index permission(String permissionId)
  {
    return new com.ringcentral.paths.restapi.dictionary.permission.Index(this, permissionId);
  }


    public com.ringcentral.paths.restapi.dictionary.faxcoverpage.Index faxCoverPage()
  {
    return new com.ringcentral.paths.restapi.dictionary.faxcoverpage.Index(this);
  }


  public com.ringcentral.paths.restapi.dictionary.permissioncategory.Index permissionCategory()
    {
      return this.permissionCategory(null);
    }
  public com.ringcentral.paths.restapi.dictionary.permissioncategory.Index permissionCategory(String permissionCategoryId)
  {
    return new com.ringcentral.paths.restapi.dictionary.permissioncategory.Index(this, permissionCategoryId);
  }

}