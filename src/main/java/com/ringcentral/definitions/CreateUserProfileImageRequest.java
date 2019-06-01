package com.ringcentral.definitions;


public class CreateUserProfileImageRequest {
    /**
     *
     */
    public Attachment image;

    public CreateUserProfileImageRequest image(Attachment image) {
        this.image = image;
        return this;
    }

}
