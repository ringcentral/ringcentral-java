package com.ringcentral.definitions;


    /**
* Phone Number Parser service's Parse Phone Numbers API request schema.
*/
public class ParsePhoneNumbersRequest
{
    /**
     * Array of strings containing numbers to be parsed.
    * 
    * Empty strings or `null` values of the array are ignored and excluded from the request.
     * Required
     */
    public String[] originalStrings;
    public ParsePhoneNumbersRequest originalStrings(String[] originalStrings)
    {
        this.originalStrings = originalStrings;
        return this;
    }

    /**
     * The source of the parsing context.
    * 
    * **Possible values**:
    * &lt;br&gt;- `Default` - using default values of parameters for the parsing;
    * &lt;br&gt;- `Account` - populating parsing context from requester&#039;s account settings.
    * |`context.`                  |`Default`|`Account`
    * |----------------------------|---------|--------------------------------------------
    * |`brandId`                   |`null`   |brand from the request context header
    * |`country`                   |`null`   |home country of the requester&#039;s account
    * |`defaultAreaCode`           |`null`   |`null`
    * |`vanityPhoneNumbersAllowed` |`false`  |`true`
    * |`maxExtensionNumberLength`  |_5_      |the value from the requester&#039;s account settings
    * |`shortCodesAllowed`         |`false`  |the value from the requester&#039;s account settings
    * |`siteCode`                  |`null`   |`null`
    * |`shortExtensionNumberLength`|_3_      |the value from the requester&#039;s account settings
    * |`outboundCallPrefix`        |`null`   |the value from the requester&#039;s account settings
    * |`maskedPhoneNumbersAllowed` |`false`  |`false`
    * |`conflictHandling`          |`Default`|the value from the requester&#039;s account settings
     * Example: Account
     * Default: Default
     * Enum: Default, Account
     */
    public String contextSource;
    public ParsePhoneNumbersRequest contextSource(String contextSource)
    {
        this.contextSource = contextSource;
        return this;
    }

    /**
     */
    public NumberParserContext context;
    public ParsePhoneNumbersRequest context(NumberParserContext context)
    {
        this.context = context;
        return this;
    }

    /**
     */
    public ResultContent resultContent;
    public ParsePhoneNumbersRequest resultContent(ResultContent resultContent)
    {
        this.resultContent = resultContent;
        return this;
    }
}