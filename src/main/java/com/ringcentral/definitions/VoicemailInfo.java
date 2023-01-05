package com.ringcentral.definitions;


    /**
* Specifies whether to take a voicemail and who should do it
*/
public class VoicemailInfo
{
    /**
     * If &#039;True&#039; then voicemails are allowed to be received
     */
    public Boolean enabled;
    public VoicemailInfo enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     */
    public RecipientInfo recipient;
    public VoicemailInfo recipient(RecipientInfo recipient)
    {
        this.recipient = recipient;
        return this;
    }
}