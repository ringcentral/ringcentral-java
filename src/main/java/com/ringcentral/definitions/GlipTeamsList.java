package com.ringcentral.definitions;


public class GlipTeamsList {
    /**
     * List of teams
     * Required
     */
    public GlipTeamInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipTeamsList records(GlipTeamInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipTeamsList navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
