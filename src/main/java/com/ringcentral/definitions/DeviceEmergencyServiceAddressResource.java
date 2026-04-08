package com.ringcentral.definitions;


    /**
* Address for emergency cases. The same emergency address is assigned to all numbers of a single device
*/
public class DeviceEmergencyServiceAddressResource
{
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
     * Internal identifier of a country
     */
    public String countryId;
    public DeviceEmergencyServiceAddressResource countryId(String countryId)
    {
        this.countryId = countryId;
        return this;
    }

    /**
     * Two-letter country code in [ISO 3166-1 alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format
     * Example: US
     */
    public String countryIsoCode;
    public DeviceEmergencyServiceAddressResource countryIsoCode(String countryIsoCode)
    {
        this.countryIsoCode = countryIsoCode;
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
     * City name
     */
    public String city;
    public DeviceEmergencyServiceAddressResource city(String city)
    {
        this.city = city;
        return this;
    }

    /**
     * Customer name
     */
    public String customerName;
    public DeviceEmergencyServiceAddressResource customerName(String customerName)
    {
        this.customerName = customerName;
        return this;
    }

    /**
     * Email of a primary contact person (receiver). Should be specified
    * for countries except the US, Canada, the UK and Australia
     * Format: email
     */
    public String customerEmail;
    public DeviceEmergencyServiceAddressResource customerEmail(String customerEmail)
    {
        this.customerEmail = customerEmail;
        return this;
    }

    /**
     * Email of an additional contact person. Should be specified
    * for countries except the US, Canada, the UK and Australia
     * Format: email
     */
    public String additionalCustomerEmail;
    public DeviceEmergencyServiceAddressResource additionalCustomerEmail(String additionalCustomerEmail)
    {
        this.additionalCustomerEmail = additionalCustomerEmail;
        return this;
    }

    /**
     * Name of an additional contact person. Should be specified for
    * countries except the US, Canada, the UK and Australia
     */
    public String additionalCustomerName;
    public DeviceEmergencyServiceAddressResource additionalCustomerName(String additionalCustomerName)
    {
        this.additionalCustomerName = additionalCustomerName;
        return this;
    }

    /**
     * Phone number of a primary contact person (receiver). Should
    * be specified for countries except the US, Canada, the UK and Australia
     */
    public String customerPhone;
    public DeviceEmergencyServiceAddressResource customerPhone(String customerPhone)
    {
        this.customerPhone = customerPhone;
        return this;
    }

    /**
     * Phone number of an additional contact person. Should be specified
    * for countries except the US, Canada, the UK &amp; Australia
     */
    public String additionalCustomerPhone;
    public DeviceEmergencyServiceAddressResource additionalCustomerPhone(String additionalCustomerPhone)
    {
        this.additionalCustomerPhone = additionalCustomerPhone;
        return this;
    }

    /**
     * State/province name. Mandatory for the USA, the UK and Canada
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
     * First line address
     */
    public String street;
    public DeviceEmergencyServiceAddressResource street(String street)
    {
        this.street = street;
        return this;
    }

    /**
     * Second line address (apartment, suite, unit, building, floor,
    * etc.)
     */
    public String street2;
    public DeviceEmergencyServiceAddressResource street2(String street2)
    {
        this.street2 = street2;
        return this;
    }

    /**
     * Street type
     */
    public String streetType;
    public DeviceEmergencyServiceAddressResource streetType(String streetType)
    {
        this.streetType = streetType;
        return this;
    }

    /**
     * (Optional) Building name
     */
    public String buildingName;
    public DeviceEmergencyServiceAddressResource buildingName(String buildingName)
    {
        this.buildingName = buildingName;
        return this;
    }

    /**
     * Building/street number
     */
    public String buildingNumber;
    public DeviceEmergencyServiceAddressResource buildingNumber(String buildingNumber)
    {
        this.buildingNumber = buildingNumber;
        return this;
    }

    /**
     * Specifies if the emergency address is out of country
     */
    public Boolean outOfCountry;
    public DeviceEmergencyServiceAddressResource outOfCountry(Boolean outOfCountry)
    {
        this.outOfCountry = outOfCountry;
        return this;
    }

    /**
     * Postal (Zip) code
     */
    public String zip;
    public DeviceEmergencyServiceAddressResource zip(String zip)
    {
        this.zip = zip;
        return this;
    }

    /**
     * Status of a digital line provisioning
     * Enum: Provisioning, Valid, Invalid
     */
    public String lineProvisioningStatus;
    public DeviceEmergencyServiceAddressResource lineProvisioningStatus(String lineProvisioningStatus)
    {
        this.lineProvisioningStatus = lineProvisioningStatus;
        return this;
    }

    /**
     * Resulting status of emergency address synchronization. Returned
    * if `syncEmergencyAddress` parameter is set to `true`
     * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
     */
    public String syncStatus;
    public DeviceEmergencyServiceAddressResource syncStatus(String syncStatus)
    {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * Internal identifier of a tax
     */
    public String taxId;
    public DeviceEmergencyServiceAddressResource taxId(String taxId)
    {
        this.taxId = taxId;
        return this;
    }
}