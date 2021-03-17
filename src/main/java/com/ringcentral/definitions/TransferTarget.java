package com.ringcentral.definitions;


    // Identifier of a call party the call will be transfered to. Only **one of** these parameters: `phoneNumber`, `voicemail`, `extensionNumber` or `parkOrbit` must be specified, otherwise an error is returned.
public class TransferTarget
{
    /**
         * Phone number
         */
        public String phoneNumber;
  public TransferTarget phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Voicemail owner extension identifier
         */
        public String voicemail;
  public TransferTarget voicemail(String voicemail)
  {
    this.voicemail = voicemail;
    return this;
  }
  

        /**
         * Park orbit identifier
         */
        public String parkOrbit;
  public TransferTarget parkOrbit(String parkOrbit)
  {
    this.parkOrbit = parkOrbit;
    return this;
  }
  

        /**
         * Number of extension
         */
        public String extensionNumber;
  public TransferTarget extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
