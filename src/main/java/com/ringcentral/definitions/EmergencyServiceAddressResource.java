package com.ringcentral.definitions;


    // Address for emergency cases. The same emergency address is assigned to all the numbers of one device
public class EmergencyServiceAddressResource
{
    /**
         */
        public String street;
  public EmergencyServiceAddressResource street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         */
        public String street2;
  public EmergencyServiceAddressResource street2(String street2)
  {
    this.street2 = street2;
    return this;
  }
  

        /**
         */
        public String city;
  public EmergencyServiceAddressResource city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         */
        public String zip;
  public EmergencyServiceAddressResource zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  

        /**
         */
        public String customerName;
  public EmergencyServiceAddressResource customerName(String customerName)
  {
    this.customerName = customerName;
    return this;
  }
  

        /**
         * State/province name
         */
        public String state;
  public EmergencyServiceAddressResource state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Internal identifier of a state
         */
        public String stateId;
  public EmergencyServiceAddressResource stateId(String stateId)
  {
    this.stateId = stateId;
    return this;
  }
  

        /**
         * ISO code of a state
         */
        public String stateIsoCode;
  public EmergencyServiceAddressResource stateIsoCode(String stateIsoCode)
  {
    this.stateIsoCode = stateIsoCode;
    return this;
  }
  

        /**
         * Full name of a state
         */
        public String stateName;
  public EmergencyServiceAddressResource stateName(String stateName)
  {
    this.stateName = stateName;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public String countryId;
  public EmergencyServiceAddressResource countryId(String countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * ISO code of a country
         */
        public String countryIsoCode;
  public EmergencyServiceAddressResource countryIsoCode(String countryIsoCode)
  {
    this.countryIsoCode = countryIsoCode;
    return this;
  }
  

        /**
         * Country name
         */
        public String country;
  public EmergencyServiceAddressResource country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Full name of a country
         */
        public String countryName;
  public EmergencyServiceAddressResource countryName(String countryName)
  {
    this.countryName = countryName;
    return this;
  }
  

        /**
         * Specifies if emergency address is out of country
         */
        public Boolean outOfCountry;
  public EmergencyServiceAddressResource outOfCountry(Boolean outOfCountry)
  {
    this.outOfCountry = outOfCountry;
    return this;
  }
  

        /**
         * Resulting status of emergency address synchronization. Returned if `syncEmergencyAddress` parameter is set to 'True'
         * Enum: Verified, Updated, Deleted, NotRequired, Unsupported, Failed
         */
        public String syncStatus;
  public EmergencyServiceAddressResource syncStatus(String syncStatus)
  {
    this.syncStatus = syncStatus;
    return this;
  }
  

        /**
         * Name of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String additionalCustomerName;
  public EmergencyServiceAddressResource additionalCustomerName(String additionalCustomerName)
  {
    this.additionalCustomerName = additionalCustomerName;
    return this;
  }
  

        /**
         * Email of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String customerEmail;
  public EmergencyServiceAddressResource customerEmail(String customerEmail)
  {
    this.customerEmail = customerEmail;
    return this;
  }
  

        /**
         * Email of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String additionalCustomerEmail;
  public EmergencyServiceAddressResource additionalCustomerEmail(String additionalCustomerEmail)
  {
    this.additionalCustomerEmail = additionalCustomerEmail;
    return this;
  }
  

        /**
         * Phone number of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia
         */
        public String customerPhone;
  public EmergencyServiceAddressResource customerPhone(String customerPhone)
  {
    this.customerPhone = customerPhone;
    return this;
  }
  

        /**
         * Phone number of an additional contact person. Should be specified for countries except the US, Canada, the UK & Australia.
         */
        public String additionalCustomerPhone;
  public EmergencyServiceAddressResource additionalCustomerPhone(String additionalCustomerPhone)
  {
    this.additionalCustomerPhone = additionalCustomerPhone;
    return this;
  }
  

        /**
         * Internal identifier of a tax
         */
        public String taxId;
  public EmergencyServiceAddressResource taxId(String taxId)
  {
    this.taxId = taxId;
    return this;
  }
  
}
