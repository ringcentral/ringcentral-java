package com.ringcentral.paths.glip.post;

public class PostParameters {
    public String groupId;

    public String text;

    public PostParameters(){}

    public PostParameters(String groupId, String text) {
        this.groupId = groupId;
        this.text = text;
    }
}
