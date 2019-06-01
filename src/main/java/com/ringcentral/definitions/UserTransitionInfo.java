package com.ringcentral.definitions;


public class UserTransitionInfo {
    /**
     * Specifies if an activation email is automatically sent to new users (Not Activated extensions) or not
     */
    public Boolean sendWelcomeEmailsToUsers;
    /**
     * Supported for account confirmation. Specifies whether welcome email is sent
     */
    public Boolean sendWelcomeEmail;

    public UserTransitionInfo sendWelcomeEmailsToUsers(Boolean sendWelcomeEmailsToUsers) {
        this.sendWelcomeEmailsToUsers = sendWelcomeEmailsToUsers;
        return this;
    }

    public UserTransitionInfo sendWelcomeEmail(Boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
        return this;
    }

}
