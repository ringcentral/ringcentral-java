package com.ringcentral.definitions;


    /**
* Phone Number Parser service's Parse Phone Numbers API successful response schema.
*/
public class ParsePhoneNumberResponseV2
{
    /**
     */
    public NumberParserContext context;
    public ParsePhoneNumberResponseV2 context(NumberParserContext context)
    {
        this.context = context;
        return this;
    }

    /**
     */
    public ParsePhoneNumberResponseV2Results[] results;
    public ParsePhoneNumberResponseV2 results(ParsePhoneNumberResponseV2Results[] results)
    {
        this.results = results;
        return this;
    }
}