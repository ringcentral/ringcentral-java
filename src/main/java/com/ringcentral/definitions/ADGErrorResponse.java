package com.ringcentral.definitions;


    // Format of response in case that any error occured during request processing
public class ADGErrorResponse
{
    /**
         * Collection of all gathered errors
         */
        public ADGError[] errors;
  public ADGErrorResponse errors(ADGError[] errors)
  {
    this.errors = errors;
    return this;
  }
  
}
