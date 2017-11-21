package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class GlipPosts
{
    // List of posts
    public GlipPostInfo[] records;
    public GlipPosts records(GlipPostInfo[] records) {
        this.records = records;
        return this;
    }
    // Information on navigation
    public GlipNavigationInfo navigation;
    public GlipPosts navigation(GlipNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }
}
