package com.ringcentral.paths;

import com.ringcentral.HttpModel;

public class Companies {
    public static class GetResponse implements HttpModel {
        // Internal identifier of an RC account/Glip company, or tilde (~) to indicate a company the current user belongs to
        public String id;
        // Name of a company
        public String name;
        // Domain name of a company
        public String domain;
        // Datetime of creation in ISO 8601 format
        public String creationTime;
        // Datetime of last modification in ISO 8601 format
        public String lastModifiedTime;

        public GetResponse id(String id) {
            this.id = id;
            return this;
        }

        public GetResponse name(String name) {
            this.name = name;
            return this;
        }

        public GetResponse domain(String domain) {
            this.domain = domain;
            return this;
        }

        public GetResponse creationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }

        public GetResponse lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
    }
}
