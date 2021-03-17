package com.ringcentral.definitions;


    // Site Fax/SMS recipient (operator) reference. Multi-level IVR should be enabled
public class OperatorInfo
{
    /**
         * Internal identifier of an operator
         */
        public String id;
  public OperatorInfo id(String id)
  {
    this.id = id;
    return this;
  }
  

        /**
         * Link to an operator resource
         */
        public String uri;
  public OperatorInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Extension number (pin)
         */
        public String extensionNumber;
  public OperatorInfo extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         * Operator extension user full name
         */
        public String name;
  public OperatorInfo name(String name)
  {
    this.name = name;
    return this;
  }
  
}
