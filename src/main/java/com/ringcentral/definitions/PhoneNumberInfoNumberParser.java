package com.ringcentral.definitions;


public class PhoneNumberInfoNumberParser
{
    /**
         * Area code of location. The portion of the [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) number that identifies a specific geographic region/numbering area of the national numbering plan (NANP); that can be summarized as `NPA-NXX-xxxx` and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See [North American Numbering Plan] (https://en.wikipedia.org/wiki/North_American_Numbering_Plan) for details
         */
        public String areaCode;
  public PhoneNumberInfoNumberParser areaCode(String areaCode)
  {
    this.areaCode = areaCode;
    return this;
  }
  

        /**
         */
        public GetCountryInfoNumberParser country;
  public PhoneNumberInfoNumberParser country(GetCountryInfoNumberParser country)
  {
    this.country = country;
    return this;
  }
  

        /**
         * Dialing format of a phone number
         */
        public String dialable;
  public PhoneNumberInfoNumberParser dialable(String dialable)
  {
    this.dialable = dialable;
    return this;
  }
  

        /**
         * Phone number [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format
         */
        public String e164;
  public PhoneNumberInfoNumberParser e164(String e164)
  {
    this.e164 = e164;
    return this;
  }
  

        /**
         * International format of a phone number
         */
        public String formattedInternational;
  public PhoneNumberInfoNumberParser formattedInternational(String formattedInternational)
  {
    this.formattedInternational = formattedInternational;
    return this;
  }
  

        /**
         * Domestic format of a phone number
         */
        public String formattedNational;
  public PhoneNumberInfoNumberParser formattedNational(String formattedNational)
  {
    this.formattedNational = formattedNational;
    return this;
  }
  

        /**
         * One of the numbers to be parsed, passed as a string in response
         */
        public String originalString;
  public PhoneNumberInfoNumberParser originalString(String originalString)
  {
    this.originalString = originalString;
    return this;
  }
  

        /**
         * 'True' if the number is in a special format (for example N11 code)
         */
        public Boolean special;
  public PhoneNumberInfoNumberParser special(Boolean special)
  {
    this.special = special;
    return this;
  }
  

        /**
         * Phone number [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format without plus sign ('+')
         */
        public String normalized;
  public PhoneNumberInfoNumberParser normalized(String normalized)
  {
    this.normalized = normalized;
    return this;
  }
  

        /**
         * Specifies if a phone number is toll free or not
         */
        public Boolean tollFree;
  public PhoneNumberInfoNumberParser tollFree(Boolean tollFree)
  {
    this.tollFree = tollFree;
    return this;
  }
  

        /**
         * Sub-Address. The portion of the number that identifies a subscriber into the subscriber internal (non-public) network.
         */
        public String subAddress;
  public PhoneNumberInfoNumberParser subAddress(String subAddress)
  {
    this.subAddress = subAddress;
    return this;
  }
  

        /**
         * Subscriber number. The portion of the [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) number that identifies a subscriber in a network or numbering area.
         */
        public String subscriberNumber;
  public PhoneNumberInfoNumberParser subscriberNumber(String subscriberNumber)
  {
    this.subscriberNumber = subscriberNumber;
    return this;
  }
  

        /**
         * DTMF (Dual Tone Multi-Frequency) postfix
         */
        public String dtmfPostfix;
  public PhoneNumberInfoNumberParser dtmfPostfix(String dtmfPostfix)
  {
    this.dtmfPostfix = dtmfPostfix;
    return this;
  }
  
}
