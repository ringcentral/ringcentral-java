package com.ringcentral.definitions;


    /**
* HardPhone model information
*/
public class AutomaticLocationUpdatesModelInfo
{
    /**
     * Device model identifier
     */
    public String id;
    public AutomaticLocationUpdatesModelInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Device name
     */
    public String name;
    public AutomaticLocationUpdatesModelInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Device feature or multiple features supported
     * Enum: BLA, Intercom, Paging, HELD
     */
    public String[] features;
    public AutomaticLocationUpdatesModelInfo features(String[] features)
    {
        this.features = features;
        return this;
    }
}