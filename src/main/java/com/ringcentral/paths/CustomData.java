package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.AttachmentInfo;

public class CustomData {
    public static class PutParameters implements RequestParameters {
        // Custom data access key. Optional. If specified, must match the custom key in the URL
        public String id;
        // Description of custom data. Mandatory for create, if there is no attachment specified. Maximum length is limited to 256 symbols
        public String value;

        public PutParameters id(String id) {
            this.id = id;
            return this;
        }

        public PutParameters value(String value) {
            this.value = value;
            return this;
        }
    }

    public static class PutResponse implements RequestParameters {
        // Custom data access key
        public String id;
        // Link to the custom data
        public String uri;
        // Description of custom data
        public String value;
        // Time of the last change in custom data
        public String lastModifiedTime;
        // Attachment data: link and type
        public AttachmentInfo attachment;

        public PutResponse id(String id) {
            this.id = id;
            return this;
        }

        public PutResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public PutResponse value(String value) {
            this.value = value;
            return this;
        }

        public PutResponse lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        public PutResponse attachment(AttachmentInfo attachment) {
            this.attachment = attachment;
            return this;
        }
    }
}
