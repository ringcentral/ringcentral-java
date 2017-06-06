package com.ringcentral.paths;

import com.ringcentral.definitions.PermissionDetailsInfo;

public class Check {
    public static class GetParameters {
        // Permission to check
        public String permissionId;
        // Optional. Internal identifier of an extension for which user permissions are to be checked. The default value is the currently logged-in extension
        public String targetExtensionId;

        public GetParameters permissionId(String permissionId) {
            this.permissionId = permissionId;
            return this;
        }

        public GetParameters targetExtensionId(String targetExtensionId) {
            this.targetExtensionId = targetExtensionId;
            return this;
        }
    }

    public static class GetResponse {
        // Canonical URI of a permission resource
        public String uri;
        // Specifies if check result is successful or not
        public Boolean successful;
        // Information on a permission checked. Returned if successful is 'True'
        public PermissionDetailsInfo details;
        // List of active scopes for permission. Returned if successful is 'True'
        public String[] scopes;

        public GetResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetResponse successful(Boolean successful) {
            this.successful = successful;
            return this;
        }

        public GetResponse details(PermissionDetailsInfo details) {
            this.details = details;
            return this;
        }

        public GetResponse scopes(String[] scopes) {
            this.scopes = scopes;
            return this;
        }
    }
}
