package com.ringcentral.definitions;

/**
 * The manually set parsing context to override the context parameter values taken from the context
 * source.
 */
public class NumberParserContext {
    /**
     * Internal identifier of the RingCentral brand. Brand context definition.
     *
     * <p>- If the value is not specified, it&#039;s taken from the context source: - `Default`
     * -&gt; `null` - `Account` -&gt; brand from the request context header - Explicitly set value
     * redefines the value taken from the context source. - Explicitly set `null` value disables
     * brand context for parsing. Example: 1210
     */
    public String brandId;

    public NumberParserContext brandId(String brandId) {
        this.brandId = brandId;
        return this;
    }

    /** */
    public CountryContext country;

    public NumberParserContext country(CountryContext country) {
        this.country = country;
        return this;
    }

    /**
     * Default area code of the caller. Provides support for the dial plan feature &quot;[Default
     * Area
     * Code](https://support.ringcentral.com/article/dial-plan-default-area-code-ringcentral-mvp.html)&quot;.
     *
     * <p>If the value is not specified or explicitly set to `null`, the feature &quot;Default Area
     * Code&quot; context is disabled for parsing. Example: 650
     */
    public String defaultAreaCode;

    public NumberParserContext defaultAreaCode(String defaultAreaCode) {
        this.defaultAreaCode = defaultAreaCode;
        return this;
    }

    /**
     * Vanity phone numbers are supported in the parsing input. Provides support for the feature
     * &quot;[Vanity Numbers
     * dialing](https://support.ringcentral.com/article/Requesting-a-toll-free-vanity-number.html)&quot;.
     *
     * <p>- If the value is not specified, it&#039;s taken from the context source: - `Default`
     * -&gt; `false` - `Account` -&gt; `true` - Explicitly set value redefines the value taken from
     * the context source. Example: true
     */
    public Boolean vanityPhoneNumbersAllowed;

    public NumberParserContext vanityPhoneNumbersAllowed(Boolean vanityPhoneNumbersAllowed) {
        this.vanityPhoneNumbersAllowed = vanityPhoneNumbersAllowed;
        return this;
    }

    /**
     * The maximum allowed length of extension numbers on the account. Provides support for the dial
     * plan feature &quot;[Variable-length
     * Extensions](https://support.ringcentral.com/article/11277-Enterprise-Dial-Plan-Max-Extension-Length.html)&quot;.
     *
     * <p>- If the value is not specified, it&#039;s taken from the context source: - `Default`
     * -&gt; _5_ - `Account` -&gt; the value from the requester&#039;s account settings - Explicitly
     * set value redefines the value taken from the context source. - Explicitly set `null` value
     * disables extension numbers detection. Maximum: 9 Minimum: 1 Format: int32
     */
    public Long maxExtensionNumberLength;

    public NumberParserContext maxExtensionNumberLength(Long maxExtensionNumberLength) {
        this.maxExtensionNumberLength = maxExtensionNumberLength;
        return this;
    }

    /**
     * Short codes are supported in the parsing input. Provides support for the feature
     * &quot;Shortcodes dialing&quot;.
     *
     * <p>- If the value is not specified, it&#039;s taken from the context source: - `Default`
     * -&gt; `false` - `Account` -&gt; the value from the requester&#039;s account settings -
     * Explicitly set value redefines the value taken from the context source.
     */
    public Boolean shortCodesAllowed;

    public NumberParserContext shortCodesAllowed(Boolean shortCodesAllowed) {
        this.shortCodesAllowed = shortCodesAllowed;
        return this;
    }

    /**
     * The site code of caller. Together with parameter `context.shortExtensionNumberLength`
     * provides support for the feature &quot;[Site
     * Codes](https://support.ringcentral.com/article/11279-Enterprise-Dial-Plan-Site-Codes.html)&quot;.
     *
     * <p>- If the value is not specified or explicitly set to `null`, the feature &quot;Site
     * Codes&quot; context is disabled for parsing. Example: 13
     */
    public String siteCode;

    public NumberParserContext siteCode(String siteCode) {
        this.siteCode = siteCode;
        return this;
    }

    /**
     * The allowed length of short extension numbers on the account. Together with parameter
     * `context.siteCode` provides support for the feature &quot;[Site
     * Codes](https://support.ringcentral.com/article/11279-Enterprise-Dial-Plan-Site-Codes.html)&quot;.
     *
     * <p>- The value is ignored and treated as `null` if parameter `context.siteCode` is not
     * specified or explicitly set to `null`. - If the value is not specified, it&#039;s taken from
     * the context source: - `Default` -&gt; _3_ - `Account` -&gt; the value from the
     * requester&#039;s account settings - Explicitly set value redefines the value taken from the
     * context source. Maximum: 8 Minimum: 1 Format: int32 Example: 4
     */
    public Long shortExtensionNumberLength;

    public NumberParserContext shortExtensionNumberLength(Long shortExtensionNumberLength) {
        this.shortExtensionNumberLength = shortExtensionNumberLength;
        return this;
    }

    /**
     * Digit of outbound call prefix on the account. Provides support for the dial plan feature
     * &quot;[Outbound Call
     * Prefix](https://support.ringcentral.com/article/11278-Enterprise-Dial-Plan-Outbound-Call-Prefix.html)&quot;.
     *
     * <p>- If the value is not specified, it&#039;s taken from the context source: - `Default`
     * -&gt; `null` - `Account` -&gt; the value from the requester&#039;s account settings -
     * Explicitly set value redefines the value taken from the context source. - Explicitly set
     * `null` value disables outbound call prefix detection. Example: 9
     */
    public String outboundCallPrefix;

    public NumberParserContext outboundCallPrefix(String outboundCallPrefix) {
        this.outboundCallPrefix = outboundCallPrefix;
        return this;
    }

    /**
     * Masked phone numbers are supported in the the parsing input. Provides support for the feature
     * &quot;[Masked
     * Numbers](https://support.ringcentral.com/article/Number-Masking-French-Numbers.html)&quot;.
     *
     * <p>- If the value is not specified or explicitly set to `false`, the feature &quot;Masked
     * Numbers&quot; context is disabled for parsing.
     */
    public Boolean maskedPhoneNumbersAllowed;

    public NumberParserContext maskedPhoneNumbersAllowed(Boolean maskedPhoneNumbersAllowed) {
        this.maskedPhoneNumbersAllowed = maskedPhoneNumbersAllowed;
        return this;
    }

    /**
     * A character used for masking phone numbers.
     *
     * <p>Absent if the request&#039;s parameter `context.maskedPhoneNumbersAllowed` value is set to
     * `false`. Example: X
     */
    public String maskSymbol;

    public NumberParserContext maskSymbol(String maskSymbol) {
        this.maskSymbol = maskSymbol;
        return this;
    }

    /**
     * The number of last digits of the phone number which are masked.
     *
     * <p>Absent if the request&#039;s parameter `context.maskedPhoneNumbersAllowed` value is set to
     * `false`. Format: int32 Example: 4
     */
    public Long maskLength;

    public NumberParserContext maskLength(Long maskLength) {
        this.maskLength = maskLength;
        return this;
    }

    /**
     * Defines the logic of conflicts resolving when it&#039;s impossible to detect whether the
     * inputted string corresponds to an extension number or a phone number. Provides support for
     * the feature &quot;Smart Dial Plan Routing&quot;.
     *
     * <p>**Possible values**:
     *
     * <p>- `Default` - the ambiguous number will always be classified as an extension number; -
     * `Client` - the ambiguous number will get `Ambiguous` category and the final decision whether
     * the number is an extension number or a phone number should be made by the requester. - If the
     * value is not specified, it&#039;s taken from the context source: - `Default` -&gt; _Default_
     * - `Client` -&gt; the value from the requester&#039;s account settings - Explicitly set value
     * redefines the value taken from the context source. Example: Client Default: Default Enum:
     * Default, Client
     */
    public String conflictHandling;

    public NumberParserContext conflictHandling(String conflictHandling) {
        this.conflictHandling = conflictHandling;
        return this;
    }
}
