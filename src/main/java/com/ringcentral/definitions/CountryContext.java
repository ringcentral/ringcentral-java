package com.ringcentral.definitions;

/**
 * Country context definition.
 *
 * <p>**In the request**:
 *
 * <p>Country context can be identified by `country.isoCode` value only: - If the value is not
 * specified, it's taken from the context source: - `Default` -> `null` - `Account` -> home country
 * of the requester's account - Explicitly set value redefines the value taken from the context
 * source. - Explicitly set `null` value disables country context for parsing.
 *
 * <p>**In the response**:
 *
 * <p>Country context is returned with additional attributes.
 *
 * <p>**In particular result items**:
 *
 * <p>Country attribute is absent for the `results.category` response's attribute values: `Unknown`
 * and `Extension`.
 */
public class CountryContext {
    /**
     * Two-letter country code in [ISO 3166-1
     * alpha-2](https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2) format Example: US
     */
    public String isoCode;

    public CountryContext isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    /** The official name of the country. Example: United States */
    public String name;

    public CountryContext name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Country calling code defined by [ITU-T](http://en.wikipedia.org/wiki/ITU-T) recommendations,
     * [E.123](http://en.wikipedia.org/wiki/E.123) and [E.164](http://en.wikipedia.org/wiki/E.164).
     * See also [Calling Codes](http://en.wikipedia.org/wiki/List_of_country_calling_codes)
     */
    public String callingCode;

    public CountryContext callingCode(String callingCode) {
        this.callingCode = callingCode;
        return this;
    }
}
