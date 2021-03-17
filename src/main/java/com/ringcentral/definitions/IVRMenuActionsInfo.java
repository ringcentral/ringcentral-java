package com.ringcentral.definitions;


public class IVRMenuActionsInfo
{
    /**
         * Key. The following values are supported: numeric: '1' to '9' Star Hash NoInput
         */
        public String input;
  public IVRMenuActionsInfo input(String input)
  {
    this.input = input;
    return this;
  }
  

        /**
         * Internal identifier of an answering rule
         * Enum: Connect, Voicemail, DialByName, Transfer, Repeat, ReturnToRoot, ReturnToPrevious, Disconnect, ReturnToTopLevelMenu, DoNothing, ConnectToOperator
         */
        public String action;
  public IVRMenuActionsInfo action(String action)
  {
    this.action = action;
    return this;
  }
  

        /**
         */
        public IVRMenuExtensionInfo extension;
  public IVRMenuActionsInfo extension(IVRMenuExtensionInfo extension)
  {
    this.extension = extension;
    return this;
  }
  

        /**
         * For 'Transfer' action only. PSTN number in E.164 format
         */
        public String phoneNumber;
  public IVRMenuActionsInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
}
