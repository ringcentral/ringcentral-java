package com.ringcentral.definitions;


public class MessageTemplatesListResponse
{
    /**
     * List of text message templates
     */
    public MessageTemplateResponse[] records;
    public MessageTemplatesListResponse records(MessageTemplateResponse[] records)
    {
        this.records = records;
        return this;
    }
}