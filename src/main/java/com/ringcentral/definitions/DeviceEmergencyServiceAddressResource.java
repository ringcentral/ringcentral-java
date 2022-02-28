package com.ringcentral.definitions;


    /**
* Address for emergency cases. The same emergency address is assigned to all the numbers of one device
*/
public class DeviceEmergencyServiceAddressResource
{
    /**
     */
    public String street;
    public DeviceEmergencyServiceAddressResource street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     */
    public String street2;
    public DeviceEmergencyServiceAddressResource street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     */
    public String city;
    public DeviceEmergencyServiceAddressResource city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     */
    public String zip;
    public DeviceEmergencyServiceAddressResource zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     */
    public String customerName;
    public DeviceEmergencyServiceAddressResource customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }

    /**
     * State/province name
     */
    public String state;
    public DeviceEmergencyServiceAddressResource state(String state)
    {
        this.state = state;
        return this;
    }

    /**
     * Internal identifier of a state
     */
    public String stateId;
    public DeviceEmergencyServiceAddressResource stateId(String stateId)
    {
        this.stateId = stateId;
        return this;
    }

    /**
     * ISO code of a state
     */
    public String stateIsoCode;
    public DeviceEmergencyServiceAddressResource stateIsoCode(String stateIsoCode)
    {
        this.stateIsoCode = stateIsoCode;
        return this;
    }

    /**
     * Full name of a state
     */
    public String stateName;
    public DeviceEmergencyServiceAddressResource stateName(String stateName)
    {
        this.stateName = stateName;
        return this;
    }

    /**
     * Internal identifier of a country
     */
    public String countryId;
    public DeviceEmergencyServiceAddressResource countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * ISO code of a country
     */
    public String countryIsoCode;
    public DeviceEmergencyServiceAddressResource countryIsoCode(String countryIsoCode)
    {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    /**
     * Country name
     */
    public String country;
    public DeviceEmergencyServiceAddressResource country(String country)
    {
        this.country = country;
        return this;
    }

    /**
     * Full name of a country
     */
    public String countryName;
    public DeviceEmergencyServiceAddressResource countryName(String countryName)
    {
        this.countryName = countryName;
        return this;
    }

    /**
     * Specifies if emergency address is out of country
     */
    public Boolean outOfCountry;
    public DeviceEmergencyServiceAddressResource outOfCountry(Boolean outOfCountry)
    {
        this.outOfCountry = outOfCountry;
        return this;
    }
}