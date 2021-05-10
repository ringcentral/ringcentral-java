package com.ringcentral.definitions;


// Request body for operation createUserProfileImage
public class CreateUserProfileImageRequest {
    /**
     * Required
     */
    public Attachment image;

    public CreateUserProfileImageRequest image(Attachment image) {
        this.image = image;
        return this;
    }
}
