package com.ringcentral.definitions;


    /**
* Recipient data
*/
public class RecipientInfo
{
    /**
     * Link to a recipient extension resource
     */
    public String uri;
    public RecipientInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Internal identifier of a recipient extension
     * Format: int64
     */
    public Long id;
    public RecipientInfo id(Long id)
    {
        this.id = id;
        return this;
    }
}