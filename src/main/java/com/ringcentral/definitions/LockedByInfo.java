package com.ringcentral.definitions;


    // Returned for the note being edited (locked) at the current moment. Information on the user editing the note
public class LockedByInfo
{
    /**
         * Internal identifier of the user editing the note
         */
        public String id;
  public LockedByInfo id(String id)
  {
    this.id = id;
    return this;
  }
  
}
