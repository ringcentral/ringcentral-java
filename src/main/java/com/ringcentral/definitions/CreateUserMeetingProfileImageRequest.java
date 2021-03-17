package com.ringcentral.definitions;


public class CreateUserMeetingProfileImageRequest
{
    /**
         * Profile image file size cannot exceed 2Mb. Supported formats are: JPG/JPEG, GIF and PNG
         */
        public String profilePic;
  public CreateUserMeetingProfileImageRequest profilePic(String profilePic)
  {
    this.profilePic = profilePic;
    return this;
  }
  
}
