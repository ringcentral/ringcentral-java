package com.ringcentral.definitions;


    /**
* Controls whether participants can start and pause recording
*/
public class EveryoneCanControl
{
    /**
     * Controls whether preference is enabled
     * Example: true
     */
    public Boolean enabled;
    public EveryoneCanControl enabled(Boolean enabled)
    {
        this.enabled = enabled;
        return this;
    }

    /**
     * Describes whether preference is locked on Service Web
     */
    public Boolean locked;
    public EveryoneCanControl locked(Boolean locked)
    {
        this.locked = locked;
        return this;
    }
}