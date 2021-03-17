package com.ringcentral.definitions;


public class GlipPostMembersListBody
{
    /**
         * List of glip members
         * Required
         */
        public CreateGlipMember[] members;
  public GlipPostMembersListBody members(CreateGlipMember[] members)
  {
    this.members = members;
    return this;
  }
  
}
