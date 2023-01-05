package com.ringcentral.definitions;


    /**
* Query parameters for operation deleteMessage
*/
public class DeleteMessageParameters
{
    /**
     * If the value is &#039;True&#039;, then the message is purged immediately with all the attachments
     */
    public Boolean purge;
    public DeleteMessageParameters purge(Boolean purge)
    {
        this.purge = purge;
        return this;
    }

    /**
     * Internal identifier of a message thread
     * Format: int64
     */
    public Long conversationId;
    public DeleteMessageParameters conversationId(Long conversationId)
    {
        this.conversationId = conversationId;
        return this;
    }
}