package com.ringcentral.paths;

import com.ringcentral.definitions.GlipNavigationInfo;
import com.ringcentral.definitions.GlipPostInfo;

public class Posts {
    public static class PostParameters {
        // Internal identifier of a group to send post to
        public String groupId;
        // Text of a post, the maximum is 10000 characters
        public String text;

        public PostParameters groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public PostParameters text(String text) {
            this.text = text;
            return this;
        }
    }

    public static class ListParameters {
        // Identifier of a group to filter posts
        public String groupId;
        // Token of a page to be returned, see Glip Navigation Info
        public String pageToken;
        // Max numbers of records to be returned. The default/maximum value is 250
        public Long recordCount;

        public ListParameters groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        public ListParameters pageToken(String pageToken) {
            this.pageToken = pageToken;
            return this;
        }

        public ListParameters recordCount(Long recordCount) {
            this.recordCount = recordCount;
            return this;
        }
    }

    public static class ListResponse {
        // List of posts
        public GlipPostInfo[] records;
        // Information on navigation
        public GlipNavigationInfo navigation;

        public ListResponse records(GlipPostInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(GlipNavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }
    }
}
