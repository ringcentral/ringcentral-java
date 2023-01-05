package com.ringcentral.definitions;


    /**
* The statuses of the messages filtered by batch/account/phone numbers.
*/
public class MessageStatusesResponse
{
    /**
     */
    public MessageStatuses messageStatuses;
    public MessageStatusesResponse messageStatuses(MessageStatuses messageStatuses)
    {
        this.messageStatuses = messageStatuses;
        return this;
    }
}