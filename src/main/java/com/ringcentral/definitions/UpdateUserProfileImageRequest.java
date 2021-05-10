package com.ringcentral.definitions;


// Request body for operation updateUserProfileImage
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
