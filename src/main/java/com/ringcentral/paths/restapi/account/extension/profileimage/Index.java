package com.ringcentral.paths.restapi.account.extension.profileimage;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.CreateUserProfileImageRequest;
import com.ringcentral.definitions.UpdateUserProfileImageRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;
    public String scaleSize;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent, String scaleSize) {
        this.parent = parent;
        this.rc = parent.rc;
        this.scaleSize = scaleSize;
    }

    public String path(Boolean withParameter) {
        if (withParameter && scaleSize != null) {
            return parent.path() + "/profile-image/" + scaleSize;
        }
        return parent.path() + "/profile-image";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a profile image of an extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public byte[] list() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), null);
        return rb.bytes();
    }

    /**
     * Uploads the extension profile image.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image
     * Rate Limit Group: Heavy
     * App Permission: EditExtensions
     * User Permission: EditUserInfo
     */
    public String post(CreateUserProfileImageRequest createUserProfileImageRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), createUserProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART);
        return rb.string();
    }

    /**
     * Updates the extension profile image
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image
     * Rate Limit Group: Heavy
     * App Permission: EditExtensions
     * User Permission: EditUserInfo
     */
    public String put(UpdateUserProfileImageRequest updateUserProfileImageRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(false), updateUserProfileImageRequest, null, com.ringcentral.ContentType.MULTIPART);
        return rb.string();
    }

    /**
     * Returns scaled profile image of an extension.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/profile-image/{scaleSize}
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        if (scaleSize == null) {
            throw new IllegalArgumentException("Parameter scaleSize cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.bytes();
    }
}
