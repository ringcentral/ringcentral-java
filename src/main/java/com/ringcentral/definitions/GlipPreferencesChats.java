package com.ringcentral.definitions;


public class GlipPreferencesChats
{
    /**
         */
        public Long maxCount;
  public GlipPreferencesChats maxCount(Long maxCount)
  {
    this.maxCount = maxCount;
    return this;
  }
  

        /**
         * Default: CombineAllChatTypes
         * Enum: SeparateAllChatTypes, SeparateConversationsAndTeams, CombineAllChatTypes
         */
        public String leftRailMode;
  public GlipPreferencesChats leftRailMode(String leftRailMode)
  {
    this.leftRailMode = leftRailMode;
    return this;
  }
  
}
