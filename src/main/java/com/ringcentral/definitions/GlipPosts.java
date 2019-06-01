package com.ringcentral.definitions;


public class GlipPosts {
    /**
     * List of posts
     * Required
     */
    public GlipPostInfo[] records;
    /**
     *
     */
    public GlipNavigationInfo navigation;

    public GlipPosts records(GlipPostInfo[] records) {
        this.records = records;
        return this;
    }

    public GlipPosts navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

}
