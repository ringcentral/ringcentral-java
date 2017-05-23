package com.ringcentral.paths;

import com.ringcentral.definitions.LookUpPhoneNumber_PhoneNumberInfo;

public class Lookup {
    static
    public class PostParameters {
        // Area code of the location
        public Long areaCode;
        // Two-letter country code, complying with the ISO standard
        public String countryCode;
        // Internal identifier of a country; '1'- the US; '39' - Canada; '224' - the UK. The default value is '1'
        public String countryId;
        // A string of digits (one and more) that should not appear among the last four digits (line part) of the phone numbers that will be returned. It is possible to specify several exclude parameters. If specified, it is taken into account in all returned phone numbers both in the phone numbers satisfying to parameters of lookup and in alternative phone numbers (in case when extendedSearch is specified)
        public String exclude;
        // If the value is 'False', then the returned numbers exactly correspond to the specified NXX, NPA and LINE or countryCode, areaCode and numberPattern parameters. If the value is 'True', then the resulting numbers are ranked and returned with the rank attribute values (1-10). The default value is 'False'
        public Boolean extendedSearch;
        // LINE pattern for vanity or wildcard search. Digits, Latin characters and asterisks are allowed (usually 4 characters)
        public String line;
        // Phone number pattern (for wildcard or vanity search). For NANP countries (US, Canada) is concatenation of nxx (the first three digits) and line. If the first three characters are specified as not digits (e.g. 5** or CAT) then parameter extendedSearch will be ignored.
        public String numberPattern;
        // NXX pattern for vanity or wildcard search. Digits, Latin characters and asterisks are allowed (usually 3 characters)
        public String nxx;
        // Area code (mandatory). For example, 800, 844, 855, 866, 877, 888 for North America; and 647 for Canada
        public String npa;
        // Payment type. Default is 'Local' (it should correlate with the npa provided)
        public String paymentType;
        // Indicates the page size (number of items). If not specified, the value is '10' by default
        public Long perPage;
        // Specifies if SMS activation is available for the number. If specified, it is taken into account in all returned phone numbers both in the phone numbers satisfying to parameters of lookup and in alternative phone numbers (in case when extendedSearch is specified). If not specified, the value is null.
        public Boolean smsEnabled;

        public PostParameters areaCode(Long areaCode) {
            this.areaCode = areaCode;
            return this;
        }

        public PostParameters countryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public PostParameters countryId(String countryId) {
            this.countryId = countryId;
            return this;
        }

        public PostParameters exclude(String exclude) {
            this.exclude = exclude;
            return this;
        }

        public PostParameters extendedSearch(Boolean extendedSearch) {
            this.extendedSearch = extendedSearch;
            return this;
        }

        public PostParameters line(String line) {
            this.line = line;
            return this;
        }

        public PostParameters numberPattern(String numberPattern) {
            this.numberPattern = numberPattern;
            return this;
        }

        public PostParameters nxx(String nxx) {
            this.nxx = nxx;
            return this;
        }

        public PostParameters npa(String npa) {
            this.npa = npa;
            return this;
        }

        public PostParameters paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        public PostParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        public PostParameters smsEnabled(Boolean smsEnabled) {
            this.smsEnabled = smsEnabled;
            return this;
        }
    }

    static
    public class PostResponse {
        // Canonical URI of the phone numbers resource
        public String uri;
        // List of phone numbers filtered by the specified criteria
        public LookUpPhoneNumber_PhoneNumberInfo[] records;

        public PostResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public PostResponse records(LookUpPhoneNumber_PhoneNumberInfo[] records) {
            this.records = records;
            return this;
        }
    }
}
