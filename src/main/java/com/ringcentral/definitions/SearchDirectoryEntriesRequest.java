package com.ringcentral.definitions;


public class SearchDirectoryEntriesRequest
{
    /**
         * String value to filter the contacts. The value specified is searched through the following fields: `firstName`, `lastName`, `extensionNumber`, `phoneNumber`, `email`, `jobTitle`, `department`
         */
        public String searchString;
  public SearchDirectoryEntriesRequest searchString(String searchString)
  {
    this.searchString = searchString;
    return this;
  }
  

        /**
         */
        public String[] searchFields;
  public SearchDirectoryEntriesRequest searchFields(String[] searchFields)
  {
    this.searchFields = searchFields;
    return this;
  }
  

        /**
         * If 'True' then contacts of all accounts in federation are returned. If 'False' then only contacts of the current account are returned, and account section is eliminated in this case
         * Default: true
         */
        public Boolean showFederated;
  public SearchDirectoryEntriesRequest showFederated(Boolean showFederated)
  {
    this.showFederated = showFederated;
    return this;
  }
  

        /**
         * Type of extension to filter the contacts. Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
         * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, IvrMenu, Limited, ApplicationExtension, Site, Bot, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup
         */
        public String extensionType;
  public SearchDirectoryEntriesRequest extensionType(String extensionType)
  {
    this.extensionType = extensionType;
    return this;
  }
  

        /**
         * Sorting settings
         */
        public OrderBy[] orderBy;
  public SearchDirectoryEntriesRequest orderBy(OrderBy[] orderBy)
  {
    this.orderBy = orderBy;
    return this;
  }
  

        /**
         */
        public Long page;
  public SearchDirectoryEntriesRequest page(Long page)
  {
    this.page = page;
    return this;
  }
  

        /**
         */
        public Long perPage;
  public SearchDirectoryEntriesRequest perPage(Long perPage)
  {
    this.perPage = perPage;
    return this;
  }
  
}
