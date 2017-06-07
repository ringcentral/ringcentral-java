package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Recording extends Path {
    public Recording(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "recording", id);
    }

    public Content content(String id) {
        return new Content(restClient, pathSegment, id);
    }

    public Content content() {
        return new Content(restClient, pathSegment, null);
    }

    public static class GetResponse {
        // Internal identifier of the call recording
        public String id;
        // Link to the call recording binary content
        public String contentUri;
        // Call recording file format. Supported format is audio/x-wav
        public String contentType;
        // Recorded call duration
        public Long duration;

        public GetResponse id(String id) {
            this.id = id;
            return this;
        }

        public GetResponse contentUri(String contentUri) {
            this.contentUri = contentUri;
            return this;
        }

        public GetResponse contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        public GetResponse duration(Long duration) {
            this.duration = duration;
            return this;
        }
    }
}
