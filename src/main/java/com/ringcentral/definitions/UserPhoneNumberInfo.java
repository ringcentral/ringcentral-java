package com.ringcentral.definitions;


public class UserPhoneNumberInfo
{
    /**
         * Link to the user's phone number resource
         */
        public String uri;
  public UserPhoneNumberInfo uri(String uri)
  {
    this.uri = uri;
    return this;
  }
  

        /**
         * Internal identifier of a phone number
         */
        public Long id;
  public UserPhoneNumberInfo id(Long id)
  {
    this.id = id;
    return this;
  }
  

        /**
         */
        public CountryInfo country;
  public UserPhoneNumberInfo country(CountryInfo country)
  {
    this.country = country;
    return this;
  }
  

        /**
         */
        public ContactCenterProvider contactCenterProvider;
  public UserPhoneNumberInfo contactCenterProvider(ContactCenterProvider contactCenterProvider)
  {
    this.contactCenterProvider = contactCenterProvider;
    return this;
  }
  

        /**
         */
        public UserPhoneNumberExtensionInfo extension;
  public UserPhoneNumberInfo extension(UserPhoneNumberExtensionInfo extension)
  {
    this.extension = extension;
    return this;
  }
  

        /**
         * Custom user name of a phone number, if any
         */
        public String label;
  public UserPhoneNumberInfo label(String label)
  {
    this.label = label;
    return this;
  }
  

        /**
         * Location (City, State). Filled for local US numbers
         */
        public String location;
  public UserPhoneNumberInfo location(String location)
  {
    this.location = location;
    return this;
  }
  

        /**
         * Payment type. 'External' is returned for forwarded numbers which are not terminated in the RingCentral phone system
         * Enum: External, TollFree, Local, BusinessMobileNumberProvider, ExternalNumberProvider
         */
        public String paymentType;
  public UserPhoneNumberInfo paymentType(String paymentType)
  {
    this.paymentType = paymentType;
    return this;
  }
  

        /**
         * Phone number
         */
        public String phoneNumber;
  public UserPhoneNumberInfo phoneNumber(String phoneNumber)
  {
    this.phoneNumber = phoneNumber;
    return this;
  }
  

        /**
         * Status of a phone number. If the value is 'Normal', the phone number is ready to be used. Otherwise it is an external number not yet ported to RingCentral
         */
        public String status;
  public UserPhoneNumberInfo status(String status)
  {
    this.status = status;
    return this;
  }
  

        /**
         * Phone number type
         * Enum: VoiceFax, FaxOnly, VoiceOnly
         */
        public String type;
  public UserPhoneNumberInfo type(String type)
  {
    this.type = type;
    return this;
  }
  

        /**
         * Usage type of a phone number. Numbers of 'NumberPool' type wont't be returned for phone number list requests
         * Enum: MainCompanyNumber, AdditionalCompanyNumber, CompanyNumber, DirectNumber, CompanyFaxNumber, ForwardedNumber, ForwardedCompanyNumber, ContactCenterNumber, ConferencingNumber, NumberPool, BusinessMobileNumber, ExternalMobileNumber
         */
        public String usageType;
  public UserPhoneNumberInfo usageType(String usageType)
  {
    this.usageType = usageType;
    return this;
  }
  

        /**
         * List of features of a phone number
         */
        public String[] features;
  public UserPhoneNumberInfo features(String[] features)
  {
    this.features = features;
    return this;
  }
  
}
