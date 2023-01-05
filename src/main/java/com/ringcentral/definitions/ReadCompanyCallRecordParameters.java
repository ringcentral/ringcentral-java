package com.ringcentral.definitions;


    /**
* Query parameters for operation readCompanyCallRecord
*/
public class ReadCompanyCallRecordParameters
{
    /**
     * Defines the level of details for returned call records
     * Default: Simple
     * Enum: Simple, Detailed
     */
    public String view;
    public ReadCompanyCallRecordParameters view(String view)
    {
        this.view = view;
        return this;
    }
}