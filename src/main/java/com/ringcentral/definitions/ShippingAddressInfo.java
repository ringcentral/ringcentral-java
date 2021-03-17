package com.ringcentral.definitions;


    // Shipping address for the order. If it coincides with the Emergency Service Address, then can be omitted. By default the same value as the emergencyServiceAddress. Multiple addresses can be specified; in case the order contains several devices, they can be delivered to different addresses
public class ShippingAddressInfo
{
    /**
         * Name of a primary contact person (receiver)
         */
        public String customerName;
  public ShippingAddressInfo customerName(String customerName)
  {
    this.customerName = customerName;
    return this;
  }
  

        /**
         * Name of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String additionalCustomerName;
  public ShippingAddressInfo additionalCustomerName(String additionalCustomerName)
  {
    this.additionalCustomerName = additionalCustomerName;
    return this;
  }
  

        /**
         * Email of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String customerEmail;
  public ShippingAddressInfo customerEmail(String customerEmail)
  {
    this.customerEmail = customerEmail;
    return this;
  }
  

        /**
         * Email of an additional contact person. Should be specified for countries except the US, Canada, the UK and Australia.
         */
        public String additionalCustomerEmail;
  public ShippingAddressInfo additionalCustomerEmail(String additionalCustomerEmail)
  {
    this.additionalCustomerEmail = additionalCustomerEmail;
    return this;
  }
  

        /**
         * Phone number of a primary contact person (receiver). Should be specified for countries except the US, Canada, the UK and Australia
         */
        public String customerPhone;
  public ShippingAddressInfo customerPhone(String customerPhone)
  {
    this.customerPhone = customerPhone;
    return this;
  }
  

        /**
         * Phone number of an additional contact person. Should be specified for countries except the US, Canada, the UK & Australia.
         */
        public String additionalCustomerPhone;
  public ShippingAddressInfo additionalCustomerPhone(String additionalCustomerPhone)
  {
    this.additionalCustomerPhone = additionalCustomerPhone;
    return this;
  }
  

        /**
         * Street address, line 1 - street address, P.O. box, company name, c/o
         */
        public String street;
  public ShippingAddressInfo street(String street)
  {
    this.street = street;
    return this;
  }
  

        /**
         * Street address, line 2 - apartment, suite, unit, building, floor, etc.
         */
        public String street2;
  public ShippingAddressInfo street2(String street2)
  {
    this.street2 = street2;
    return this;
  }
  

        /**
         * City name
         */
        public String city;
  public ShippingAddressInfo city(String city)
  {
    this.city = city;
    return this;
  }
  

        /**
         * State/province name
         */
        public String state;
  public ShippingAddressInfo state(String state)
  {
    this.state = state;
    return this;
  }
  

        /**
         * Internal identifier of a state
         */
        public String stateId;
  public ShippingAddressInfo stateId(String stateId)
  {
    this.stateId = stateId;
    return this;
  }
  

        /**
         * ISO code of a state
         */
        public String stateIsoCode;
  public ShippingAddressInfo stateIsoCode(String stateIsoCode)
  {
    this.stateIsoCode = stateIsoCode;
    return this;
  }
  

        /**
         * Full name of a state
         */
        public String stateName;
  public ShippingAddressInfo stateName(String stateName)
  {
    this.stateName = stateName;
    return this;
  }
  

        /**
         * Internal identifier of a country
         */
        public String countryId;
  public ShippingAddressInfo countryId(String countryId)
  {
    this.countryId = countryId;
    return this;
  }
  

        /**
         * ISO code of a country
         */
        public String countryIsoCode;
  public ShippingAddressInfo countryIsoCode(String countryIsoCode)
  {
    this.countryIsoCode = countryIsoCode;
    return this;
  }
  

        /**
         * Country name
         */
        public String country;
  public ShippingAddressInfo country(String country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Full name of a country
         */
        public String countryName;
  public ShippingAddressInfo countryName(String countryName)
  {
    this.countryName = countryName;
    return this;
  }
  

        /**
         * Zip code
         */
        public String zip;
  public ShippingAddressInfo zip(String zip)
  {
    this.zip = zip;
    return this;
  }
  

        /**
         * National taxpayer identification number. Should be specified for Brazil (CNPJ/CPF number) and Argentina (CUIT number).
         */
        public String taxId;
  public ShippingAddressInfo taxId(String taxId)
  {
    this.taxId = taxId;
    return this;
  }
  
}
