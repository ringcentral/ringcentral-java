package com.ringcentral.definitions;


public class TMTeamList {
    /**
     * List of teams
     * Required
     */
    public TMTeamInfo[] records;
    /**
     *
     */
    public TMNavigationInfo navigation;

    public TMTeamList records(TMTeamInfo[] records) {
        this.records = records;
        return this;
    }

    public TMTeamList navigation(TMNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
