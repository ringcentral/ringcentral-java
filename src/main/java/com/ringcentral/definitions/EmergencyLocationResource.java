package com.ringcentral.definitions;


    /**
* Company emergency response location details
*/
public class EmergencyLocationResource
{
    /**
     * Internal identifier of an emergency response location
     */
    public String id;
    public EmergencyLocationResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public EmergencyLocationAddressInfo address;
    public EmergencyLocationResource address(EmergencyLocationAddressInfo address)
    {
        this.address = address;
        return this;
    }

    /**
     * Emergency response location name
     */
    public String name;
    public EmergencyLocationResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public ShortSiteInfo site;
    public EmergencyLocationResource site(ShortSiteInfo site)
    {
        this.site = site;
        return this;
    }

    /**
     * Emergency address status
     * Enum: Valid, Invalid, Provisioning
     */
    public String addressStatus;
    public EmergencyLocationResource addressStatus(String addressStatus)
    {
        this.addressStatus = addressStatus;
        return this;
    }

    /**
     * Status of emergency response location usage.
     * Enum: Active, Inactive
     */
    public String usageStatus;
    public EmergencyLocationResource usageStatus(String usageStatus)
    {
        this.usageStatus = usageStatus;
        return this;
    }

    /**
     * Resulting status of emergency address synchronization. Returned
    * if `syncEmergencyAddress` parameter is set to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, ActivationProcess, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    public EmergencyLocationResource syncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * Enum: LocationWithElins, LocationWithEndpoint
     */
    public String addressType;
    public EmergencyLocationResource addressType(String addressType)
    {
        this.addressType = addressType;
        return this;
    }

    /**
     * Visibility of an emergency response location. If `Private`
    * is set, then location is visible only for the restricted number of users,
    * specified in `owners` array
     * Default: Public
     * Enum: Private, Public
     */
    public String visibility;
    public EmergencyLocationResource visibility(String visibility)
    {
        this.visibility = visibility;
        return this;
    }

    /**
     * List of private location owners
     */
    public LocationOwnerInfo[] owners;
    public EmergencyLocationResource owners(LocationOwnerInfo[] owners)
    {
        this.owners = owners;
        return this;
    }
}