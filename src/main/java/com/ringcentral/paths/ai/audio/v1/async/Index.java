package com.ringcentral.paths.ai.audio.v1.async;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.ai.audio.v1.Index parent;

    public Index(com.ringcentral.paths.ai.audio.v1.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path(false) + "/async";
    }

    public String path(Boolean withParameter) {
        return path();
    }


    public com.ringcentral.paths.ai.audio.v1.async.speechtotext.Index speechToText() {
        return new com.ringcentral.paths.ai.audio.v1.async.speechtotext.Index(this);
    }


    public com.ringcentral.paths.ai.audio.v1.async.speakerdiarize.Index speakerDiarize() {
        return new com.ringcentral.paths.ai.audio.v1.async.speakerdiarize.Index(this);
    }


    public com.ringcentral.paths.ai.audio.v1.async.speakeridentify.Index speakerIdentify() {
        return new com.ringcentral.paths.ai.audio.v1.async.speakeridentify.Index(this);
    }

}
