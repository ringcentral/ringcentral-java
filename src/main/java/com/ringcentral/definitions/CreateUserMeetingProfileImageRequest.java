package com.ringcentral.definitions;


    /**
* Request body for operation createUserMeetingProfileImage
*/
public class CreateUserMeetingProfileImageRequest
{
    /**
     * Profile image file size cannot exceed 2Mb. Supported formats are: JPG/JPEG, GIF and PNG
     * Required
     */
    public Attachment profilePic;
    public CreateUserMeetingProfileImageRequest profilePic(Attachment profilePic)
    {
        this.profilePic = profilePic;
        return this;
    }
}