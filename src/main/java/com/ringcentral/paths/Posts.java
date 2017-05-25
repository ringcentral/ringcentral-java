package com.ringcentral.paths;

import com.ringcentral.definitions.GlipNavigationInfo;
import com.ringcentral.definitions.GlipPostInfo;

public class Posts {
    static
    public class ListParameters {
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

    static
    public class ListResponse {
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
