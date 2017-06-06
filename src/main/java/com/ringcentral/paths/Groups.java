package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.GlipGroupInfo;
import com.ringcentral.definitions.GlipNavigationInfo;

public class Groups {
    public static class PostParameters implements RequestParameters {
        // Type of a group to be created. 'PrivateChat' is a group of 2 members. 'Team' is a chat of 1 and more participants, the membership can be modified in future
        public String type;
        // For 'Team' group type only. Team access level
        public Boolean isPublic;
        // For 'Team' group type only. Team name
        public String name;
        // For 'Team' group type only. Team description
        public String description;
        // Identifier(s) of group members. For 'PrivateChat' group type 2 members only are supported
        public String[] members;

        public PostParameters type(String type) {
            this.type = type;
            return this;
        }

        public PostParameters isPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }

        public PostParameters name(String name) {
            this.name = name;
            return this;
        }

        public PostParameters description(String description) {
            this.description = description;
            return this;
        }

        public PostParameters members(String[] members) {
            this.members = members;
            return this;
        }
    }

    public static class ListParameters implements RequestParameters {
        // Type of a group. 'PrivateChat' is a group of 2 members. 'Group' is a chat of 2 and more participants, the membership cannot be changed after group creation. 'Team' is a chat of 1 and more participants, the membership can be modified in future
        public String type;
        // Token of a page to be returned, see Glip Navigation Info
        public String pageToken;
        // Max numbers of records to be returned. The default/maximum value is 250
        public Long recordCount;

        public ListParameters type(String type) {
            this.type = type;
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

    public static class ListResponse implements RequestParameters {
        // List of groups/teams/private chats
        public GlipGroupInfo[] records;
        // Information on navigation
        public GlipNavigationInfo navigation;

        public ListResponse records(GlipGroupInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(GlipNavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }
    }
}
