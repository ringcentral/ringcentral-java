package com.ringcentral.definitions;


public class OrderBy
{
    /**
         * Sorting priority index, starting from '1'. Optional if only one element in `orderBy` array is specified
         */
        public Long index;
  public OrderBy index(Long index)
  {
    this.index = index;
    return this;
  }
  

        /**
         * Field name by which to sort the contacts
         * Enum: firstName, lastName, extensionNumber, phoneNumber, email, jobTitle, department
         */
        public String fieldName;
  public OrderBy fieldName(String fieldName)
  {
    this.fieldName = fieldName;
    return this;
  }
  

        /**
         * Sorting direction
         * Enum: Asc, Desc
         */
        public String direction;
  public OrderBy direction(String direction)
  {
    this.direction = direction;
    return this;
  }
  
}
