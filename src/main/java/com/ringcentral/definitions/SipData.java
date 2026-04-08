package com.ringcentral.definitions;


    /**
* SIP (Session Initiation Protocol) information.
* Returned if query parameter sipData is set to 'True'
* 
*/
public class SipData
{
    /**
     * Recipient&#039;s data
     */
    public String toTag;
    public SipData toTag(String toTag)
    {
        this.toTag = toTag;
        return this;
    }

    /**
     * Sender&#039;s data
     */
    public String fromTag;
    public SipData fromTag(String fromTag)
    {
        this.fromTag = fromTag;
        return this;
    }

    /**
     * SIP call identifier
     */
    public String callId;
    public SipData callId(String callId)
    {
        this.callId = callId;
        return this;
    }
}