package com.ringcentral.definitions;


    /**
* Address for emergency cases. The same emergency address is assigned to all numbers of a single device. If the emergency address is also specified in `emergency` resource, then this value is ignored
*/
public class EmergencyServiceAddressResourceRequest
{
    /**
     */
    public String street;
    public EmergencyServiceAddressResourceRequest street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     */
    public String street2;
    public EmergencyServiceAddressResourceRequest street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     */
    public String city;
    public EmergencyServiceAddressResourceRequest city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     */
    public String zip;
    public EmergencyServiceAddressResourceRequest zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     */
    public String customerName;
    public EmergencyServiceAddressResourceRequest customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }

    /**
     * State/province name
     */
    public String state;
    public EmergencyServiceAddressResourceRequest state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public EmergencyServiceAddressResourceRequest stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * Country name
     */
    public String country;
    public EmergencyServiceAddressResourceRequest country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public EmergencyServiceAddressResourceRequest countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }
}