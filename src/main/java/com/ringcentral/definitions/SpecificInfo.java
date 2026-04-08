package com.ringcentral.definitions;


    /**
* Information specified in request
*/
public class SpecificInfo
{
    /**
     * Starting time for data collection
     * Format: date-time
     */
    public String timeFrom;
    public SpecificInfo timeFrom(String timeFrom)
    {
        this.timeFrom = timeFrom;
        return this;
    }

    /**
     * Ending time for data collection
     * Format: date-time
     */
    public String timeTo;
    public SpecificInfo timeTo(String timeTo)
    {
        this.timeTo = timeTo;
        return this;
    }

    /**
     */
    public DataExportTaskContactInfo[] contacts;
    public SpecificInfo contacts(DataExportTaskContactInfo[] contacts)
    {
        this.contacts = contacts;
        return this;
    }

    /**
     * List of chats from which the data (posts, files, tasks, events, notes, etc.) will be collected
     */
    public String[] chatIds;
    public SpecificInfo chatIds(String[] chatIds)
    {
        this.chatIds = chatIds;
        return this;
    }
}