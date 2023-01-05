package com.ringcentral.definitions;


    /**
* SMS and Pager only. Information about a conversation the message belongs to
*/
public class ConversationInfo
{
    /**
     * Internal identifier of a conversation
     */
    public String id;
    public ConversationInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Deprecated. Link to a conversation resource
     */
    public String uri;
    public ConversationInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}