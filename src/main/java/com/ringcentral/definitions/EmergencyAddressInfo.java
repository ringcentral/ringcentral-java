package com.ringcentral.definitions;


    /**
* Emergency address information (or information assigned to the
* switch or wireless point - in case of using them). Only one of a pair
* `emergencyAddress` or `emergencyLocationId` should be specified,
* otherwise an error is returned
* 
*/
public class EmergencyAddressInfo
{
    /**
     * Name of a customer
     */
    public String customerName;
    public EmergencyAddressInfo customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }

    /**
     * Street address, line 1 - street address, P.O. box, company
    * name, c/o
     */
    public String street;
    public EmergencyAddressInfo street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Street address, line 2 - apartment, suite, unit, building,
    * floor, etc.
     */
    public String street2;
    public EmergencyAddressInfo street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * City name
     */
    public String city;
    public EmergencyAddressInfo city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Zip code
     */
    public String zip;
    public EmergencyAddressInfo zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * State/province name
     */
    public String state;
    public EmergencyAddressInfo state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public EmergencyAddressInfo stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    public EmergencyAddressInfo stateIsoCode(String stateIsoCode)
    {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    /**
     * Full name of a state
     */
    public String stateName;
    public EmergencyAddressInfo stateName(String stateName)
    {
        this.stateName = stateName;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public EmergencyAddressInfo countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    public EmergencyAddressInfo countryIsoCode(String countryIsoCode)
    {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    /**
     * Country name
     */
    public String country;
    public EmergencyAddressInfo country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Full name of a country
     */
    public String countryName;
    public EmergencyAddressInfo countryName(String countryName)
    {
        this.countryName = countryName;
        return this;
    }

    /**
     * Resulting status of emergency address synchronization. Returned
    * for &#039;Get Device Info&#039; request if `syncEmergencyAddress` parameter is set
    * to &#039;True&#039;
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    public EmergencyAddressInfo syncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
        return this;
    }
}