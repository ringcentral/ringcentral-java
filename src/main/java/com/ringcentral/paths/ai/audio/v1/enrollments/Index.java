package com.ringcentral.paths.ai.audio.v1.enrollments;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.v1.Index parent;
    public String speakerId;

    public Index(com.ringcentral.paths.ai.audio.v1.Index parent, String speakerId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.speakerId = speakerId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && speakerId != null) {
            return parent.path() + "/enrollments/" + speakerId;
        }
        return parent.path() + "/enrollments";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the List of Enrolled Speakers
     * HTTP Method: get
     * Endpoint: /ai/audio/v1/enrollments
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public ListEnrolledSpeakers list(CaiEnrollmentsListParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), ListEnrolledSpeakers.class);
    }

    public ListEnrolledSpeakers list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates Enrollment for the provided Speaker.
     * HTTP Method: post
     * Endpoint: /ai/audio/v1/enrollments
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public EnrollmentStatus post(EnrollmentInput enrollmentInput) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), enrollmentInput, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EnrollmentStatus.class);
    }

    /**
     * Get The Status of Enrollment for the provided Speaker.
     * HTTP Method: get
     * Endpoint: /ai/audio/v1/enrollments/{speakerId}
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public EnrollmentStatus get() throws com.ringcentral.RestException, java.io.IOException {
        if (speakerId == null) {
            throw new IllegalArgumentException("Parameter speakerId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EnrollmentStatus.class);
    }

    /**
     * Delete The Enrollment for the provided Speaker.
     * HTTP Method: delete
     * Endpoint: /ai/audio/v1/enrollments/{speakerId}
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (speakerId == null) {
            throw new IllegalArgumentException("Parameter speakerId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Add newer audio data to improve an existing speaker enrollment
     * HTTP Method: patch
     * Endpoint: /ai/audio/v1/enrollments/{speakerId}
     * Rate Limit Group: Heavy
     * App Permission: AI
     */
    public EnrollmentStatus patch(EnrollmentPatchInput enrollmentPatchInput) throws com.ringcentral.RestException, java.io.IOException {
        if (speakerId == null) {
            throw new IllegalArgumentException("Parameter speakerId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), enrollmentPatchInput, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), EnrollmentStatus.class);
    }
}
