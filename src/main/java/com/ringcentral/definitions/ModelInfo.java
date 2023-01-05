package com.ringcentral.definitions;


    /**
* HardPhone model information
*/
public class ModelInfo
{
    /**
     * Internal identifier of a HardPhone device model
     */
    public String id;
    public ModelInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Device name
     */
    public String name;
    public ModelInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Addons description
     */
    public AddonInfo[] addons;
    public ModelInfo addons(AddonInfo[] addons)
    {
        this.addons = addons;
        return this;
    }

    /**
     */
    public String deviceClass;
    public ModelInfo deviceClass(String deviceClass)
    {
        this.deviceClass = deviceClass;
        return this;
    }

    /**
     * Device feature or multiple features supported
     * Enum: BLA, CommonPhone, Intercom, Paging, HELD
     */
    public String[] features;
    public ModelInfo features(String[] features)
    {
        this.features = features;
        return this;
    }

    /**
     * Max supported count of phone lines
     */
    public Long lineCount;
    public ModelInfo lineCount(Long lineCount)
    {
        this.lineCount = lineCount;
        return this;
    }
}