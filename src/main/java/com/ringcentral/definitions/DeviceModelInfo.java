package com.ringcentral.definitions;


    /**
* HardPhone model information
*/
public class DeviceModelInfo
{
    /**
     * Addon identifier. For HardPhones of certain types, which are compatible with this addon identifier
     */
    public String id;
    public DeviceModelInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Device name
     */
    public String name;
    public DeviceModelInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Addons description
     * Required
     */
    public DeviceAddonInfo[] addons;
    public DeviceModelInfo addons(DeviceAddonInfo[] addons)
    {
        this.addons = addons;
        return this;
    }

    /**
     * Device feature or multiple features supported
     * Enum: BLA, Intercom, Paging, HELD
     */
    public String[] features;
    public DeviceModelInfo features(String[] features)
    {
        this.features = features;
        return this;
    }
}