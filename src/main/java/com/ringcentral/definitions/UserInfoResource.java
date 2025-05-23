package com.ringcentral.definitions;


public class UserInfoResource {
    /**
     * Subject - the End-User internal identifier. Contains RingCentral user (extension) ID
     * Required
     * Example: 987654321
     */
    public String sub;
    /**
     * End-User&#039;s preferred e-mail address
     * Format: email
     * Example: john.doe@acme.com
     */
    public String email;
    /**
     * Indicates if the End-User&#039;s e-mail address has been verified
     */
    public Boolean email_verified;
    /**
     * The End-User&#039;s company account identifier. Contains RingCentral account ID
     */
    public String account_id;
    /**
     * The last name of the End-User
     */
    public String family_name;
    /**
     * The first name of the End-User
     */
    public String given_name;

    public UserInfoResource sub(String sub) {
        this.sub = sub;
        return this;
    }

    public UserInfoResource email(String email) {
        this.email = email;
        return this;
    }

    public UserInfoResource email_verified(Boolean email_verified) {
        this.email_verified = email_verified;
        return this;
    }

    public UserInfoResource account_id(String account_id) {
        this.account_id = account_id;
        return this;
    }

    public UserInfoResource family_name(String family_name) {
        this.family_name = family_name;
        return this;
    }

    public UserInfoResource given_name(String given_name) {
        this.given_name = given_name;
        return this;
    }
}
