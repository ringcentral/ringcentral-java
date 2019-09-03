package com.ringcentral.definitions;


public class BulkAssignAutomaticaLocationUpdatesUsers {
    /**
     *
     */
    public String[] enabledUserIds;
    /**
     *
     */
    public String[] disabledUserIds;

    public BulkAssignAutomaticaLocationUpdatesUsers enabledUserIds(String[] enabledUserIds) {
        this.enabledUserIds = enabledUserIds;
        return this;
    }

    public BulkAssignAutomaticaLocationUpdatesUsers disabledUserIds(String[] disabledUserIds) {
        this.disabledUserIds = disabledUserIds;
        return this;
    }

}
