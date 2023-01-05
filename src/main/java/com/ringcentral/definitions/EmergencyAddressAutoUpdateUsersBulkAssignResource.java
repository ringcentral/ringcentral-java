package com.ringcentral.definitions;


public class EmergencyAddressAutoUpdateUsersBulkAssignResource
{
    /**
     */
    public String[] enabledUserIds;
    public EmergencyAddressAutoUpdateUsersBulkAssignResource enabledUserIds(String[] enabledUserIds)
    {
        this.enabledUserIds = enabledUserIds;
        return this;
    }

    /**
     */
    public String[] disabledUserIds;
    public EmergencyAddressAutoUpdateUsersBulkAssignResource disabledUserIds(String[] disabledUserIds)
    {
        this.disabledUserIds = disabledUserIds;
        return this;
    }
}