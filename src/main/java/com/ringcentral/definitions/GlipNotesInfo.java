package com.ringcentral.definitions;


public class GlipNotesInfo
{
    /**
         */
        public GlipNoteInfo[] records;
  public GlipNotesInfo records(GlipNoteInfo[] records)
  {
    this.records = records;
    return this;
  }
  

        /**
         */
        public GlipNavigationInfo navigation;
  public GlipNotesInfo navigation(GlipNavigationInfo navigation)
  {
    this.navigation = navigation;
    return this;
  }
  
}
