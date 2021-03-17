package com.ringcentral.definitions;


    // For NotActivated extensions only. Welcome email settings
public class UserTransitionInfo
{
    /**
         * Specifies if a welcome/activation email is sent to the existing users during account confirmation
         */
        public Boolean sendWelcomeEmailsToUsers;
  public UserTransitionInfo sendWelcomeEmailsToUsers(Boolean sendWelcomeEmailsToUsers)
  {
    this.sendWelcomeEmailsToUsers = sendWelcomeEmailsToUsers;
    return this;
  }
  

        /**
         * Specifies if a welcome/activation email is sent to the new users (within extension status changing from 'Unsassigned' to 'NotActivated/Disabled')
         */
        public Boolean sendWelcomeEmail;
  public UserTransitionInfo sendWelcomeEmail(Boolean sendWelcomeEmail)
  {
    this.sendWelcomeEmail = sendWelcomeEmail;
    return this;
  }
  
}
