package com.ringcentral.definitions;


    /**
* Query parameters for operation readEmergencyLocation
*/
public class ReadEmergencyLocationParameters
{
    /**
     */
    public Boolean syncEmergencyAddress;
    public ReadEmergencyLocationParameters syncEmergencyAddress(Boolean syncEmergencyAddress)
    {
        this.syncEmergencyAddress = syncEmergencyAddress;
        return this;
    }
}