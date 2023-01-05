package com.ringcentral.definitions;


    /**
* Alert information
*/
public class AlertInfo
{
    /**
     * Title of a message
     */
    public String title;
    public AlertInfo title(String title)
    {
        this.title = title;
        return this;
    }

    /**
     * Message Description
     */
    public String body;
    public AlertInfo body(String body)
    {
        this.body = body;
        return this;
    }
}