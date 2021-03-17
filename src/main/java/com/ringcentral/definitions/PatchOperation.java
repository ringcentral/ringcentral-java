package com.ringcentral.definitions;


public class PatchOperation
{
    /**
         * Required
         * Enum: add, replace, remove
         */
        public String op;
  public PatchOperation op(String op)
  {
    this.op = op;
    return this;
  }
  

        /**
         */
        public String path;
  public PatchOperation path(String path)
  {
    this.path = path;
    return this;
  }
  

        /**
         * corresponding 'value' of that field specified by 'path'
         */
        public String value;
  public PatchOperation value(String value)
  {
    this.value = value;
    return this;
  }
  
}
