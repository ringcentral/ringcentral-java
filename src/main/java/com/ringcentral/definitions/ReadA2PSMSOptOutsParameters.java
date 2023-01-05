package com.ringcentral.definitions;


    /**
* Query parameters for operation readA2PSMSOptOuts
*/
public class ReadA2PSMSOptOutsParameters
{
    /**
     * The sender&#039;s phone number in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages. The asterisk value &quot;*&quot; means any number in `from` field
     * Example: 15551234455
     */
    public String from;
    public ReadA2PSMSOptOutsParameters from(String from)
    {
        this.from = from;
        return this;
    }

    /**
     * The receiver&#039;s phone number (`to` field) in [E.164](https://www.itu.int/rec/T-REC-E.164-201011-I) format for filtering messages
     * Example: 15551237755
     */
    public String to;
    public ReadA2PSMSOptOutsParameters to(String to)
    {
        this.to = to;
        return this;
    }

    /**
     * The status (opted out, opted in, or both) to be used as the filter
     * Example: optout
     * Default: optout
     * Enum: optout, optin, all
     */
    public String status;
    public ReadA2PSMSOptOutsParameters status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * The page token of the page to be retrieved
     * Example: pgt1
     */
    public String pageToken;
    public ReadA2PSMSOptOutsParameters pageToken(String pageToken)
    {
        this.pageToken = pageToken;
        return this;
    }

    /**
     * The number of records to be returned for the page
     * Format: int32
     * Example: 5
     * Default: 1000
     */
    public Long perPage;
    public ReadA2PSMSOptOutsParameters perPage(Long perPage)
    {
        this.perPage = perPage;
        return this;
    }
}