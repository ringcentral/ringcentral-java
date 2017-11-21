package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Check extends Path {
    public Check (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "check", id);
    }
    public static class GetParameters
    {
        //
        public String permissionId;
        public GetParameters permissionId(String permissionId) {
            this.permissionId = permissionId;
            return this;
        }
        //
        public String targetExtensionId;
        public GetParameters targetExtensionId(String targetExtensionId) {
            this.targetExtensionId = targetExtensionId;
            return this;
        }
    }
}
