package com.ringcentral.definitions;


public class UpdateUserProfileImageRequest {
    /**
     *
     */
    public Attachment image;

    public UpdateUserProfileImageRequest image(Attachment image) {
        this.image = image;
        return this;
    }

}
