package com.ringcentral.definitions;


    /**
* Settings about automatic reply message sending to collect consent.
*/
public class AutomaticConsentCollecting
{
    /**
     * Necessity of automatic reply message sending to collect consent.
     */
    public Boolean enabled;
    public AutomaticConsentCollecting enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Reply message which will contain instructions how to grant opt-in or opt-out consent.
     */
    public String replyMessageBody;
    public AutomaticConsentCollecting replyMessageBody(String replyMessageBody)
    {
        this.replyMessageBody = replyMessageBody;
        return this;
    }
}