package com.ringcentral.definitions;


public class DeleteUserCallLogParameters
{
    /**
         * The end datetime for records deletion in (ISO 8601)[https://en.wikipedia.org/wiki/ISO_8601]  format including timezone, for example 2016-03-10T18:07:52.534Z. The default value is current time
         */
        public String dateTo;
  public DeleteUserCallLogParameters dateTo(String dateTo)
  {
    this.dateTo = dateTo;
    return this;
  }
  

        /**
         */
        public String phoneNumber;
  public DeleteUserCallLogParameters phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         */
        public String extensionNumber;
  public DeleteUserCallLogParameters extensionNumber(String extensionNumber)
  {
    this.extensionNumber = extensionNumber;
    return this;
  }
  

        /**
         */
        public String[] type;
  public DeleteUserCallLogParameters type(String[] type)
  {
    this.type = type;
    return this;
  }
  

        /**
         */
        public String[] direction;
  public DeleteUserCallLogParameters direction(String[] direction)
  {
    this.direction = direction;
    return this;
  }
  

        /**
         */
        public String dateFrom;
  public DeleteUserCallLogParameters dateFrom(String dateFrom)
  {
    this.dateFrom = dateFrom;
    return this;
  }
  
}
