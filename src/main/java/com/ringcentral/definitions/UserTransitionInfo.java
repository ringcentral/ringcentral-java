package com.ringcentral.definitions;


/**
 * For NotActivated extensions only. Welcome email settings
 */
public class UserTransitionInfo {
    /**
     * Specifies if a welcome/activation email is sent to the existing
     * users during account confirmation
     */
    public Boolean sendWelcomeEmailsToUsers;
    /**
     * Specifies if a welcome/activation email is sent to the new users (within extension status changing from
     * &#039;Unassigned&#039; to &#039;NotActivated/Disabled&#039;)
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
