package com.ringcentral.definitions;


public class ContactList
{
    /**
         * link to the list of user personal contacts
         */
        public String uri;
  public ContactList uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * List of personal contacts from the extension address book
         */
        public PersonalContactResource[] records;
  public ContactList records(PersonalContactResource[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public UserContactsNavigationInfo navigation;
  public ContactList navigation(UserContactsNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  

        /**
         */
        public UserContactsPagingInfo paging;
  public ContactList paging(UserContactsPagingInfo paging)
  {
    this.paging = paging;
    return this;
  }
  

        /**
         */
        public UserContactsGroupsInfo groups;
  public ContactList groups(UserContactsGroupsInfo groups)
  {
    this.groups = groups;
    return this;
  }
  
}
