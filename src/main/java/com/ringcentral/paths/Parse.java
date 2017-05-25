package com.ringcentral.paths;

import com.ringcentral.HttpModel;
import com.ringcentral.definitions.ParsePhoneNumber_CountryInfo;
import com.ringcentral.definitions.ParsePhoneNumber_PhoneNumberInfo;

public class Parse {
    public static class PostParameters implements HttpModel {
        // Internal identifier of a home country. The default value is ISO code (ISO 3166) of the user's home country or brand country, if the user is undefined
        public String homeCountry;
        // The default value is "False". If "True", the numbers that are closer to the home country are given higher priority
        public Boolean nationalAsPriority;

        public PostParameters homeCountry(String homeCountry) {
            this.homeCountry = homeCountry;
            return this;
        }

        public PostParameters nationalAsPriority(Boolean nationalAsPriority) {
            this.nationalAsPriority = nationalAsPriority;
            return this;
        }
    }

    public static class PostResponse implements HttpModel {
        // Canonical URI of a resource
        public String uri;
        // Information on a user home country
        public ParsePhoneNumber_CountryInfo[] homeCountry;
        // Parsed phone numbers data
        public ParsePhoneNumber_PhoneNumberInfo[] phoneNumbers;
        // One of the numbers to be parsed, passed as a string in response
        public String originalString;
        // Area code of the location (3-digit usually), according to the NANP number format, that can be summarized as NPA-NXX-xxxx and covers Canada, the United States, parts of the Caribbean Sea, and some Atlantic and Pacific islands. See North American Numbering Plan for details
        public String areaCode;
        // Domestic format of a phone number
        public String formattedNational;
        // International format of a phone number
        public String formattedInternational;
        // Dialing format of a phone number
        public String dialable;
        // E.164 (11-digits) format of a phone number
        public String e164;
        // "True" if the number is in a special format (for example N11 code)
        public Boolean special;
        // E.164 (11-digits) format of a phone number without the plus sign ('+')
        public String normalized;
        // Information on a country the phone number belongs to
        public ParsePhoneNumber_CountryInfo[] country;

        public PostResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public PostResponse homeCountry(ParsePhoneNumber_CountryInfo[] homeCountry) {
            this.homeCountry = homeCountry;
            return this;
        }

        public PostResponse phoneNumbers(ParsePhoneNumber_PhoneNumberInfo[] phoneNumbers) {
            this.phoneNumbers = phoneNumbers;
            return this;
        }

        public PostResponse originalString(String originalString) {
            this.originalString = originalString;
            return this;
        }

        public PostResponse areaCode(String areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        public PostResponse formattedNational(String formattedNational) {
            this.formattedNational = formattedNational;
            return this;
        }

        public PostResponse formattedInternational(String formattedInternational) {
            this.formattedInternational = formattedInternational;
            return this;
        }

        public PostResponse dialable(String dialable) {
            this.dialable = dialable;
            return this;
        }

        public PostResponse e164(String e164) {
            this.e164 = e164;
            return this;
        }

        public PostResponse special(Boolean special) {
            this.special = special;
            return this;
        }

        public PostResponse normalized(String normalized) {
            this.normalized = normalized;
            return this;
        }

        public PostResponse country(ParsePhoneNumber_CountryInfo[] country) {
            this.country = country;
            return this;
        }
    }
}
