package com.ringcentral.definitions;


    // Operator's extension information. This extension will receive all calls and messages intended for the operator.
public class AccountOperatorInfo
{
    /**
         * Link to an operator extension resource
         */
        public String uri;
  public AccountOperatorInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of an operator extension
         */
        public Long id;
  public AccountOperatorInfo id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Number of an operator extension
         */
        public String extensionNumber;
  public AccountOperatorInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  
}
