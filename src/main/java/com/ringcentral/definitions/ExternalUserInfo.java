package com.ringcentral.definitions;

public class ExternalUserInfo {
    // User type of a meeting account
    public String accountId;
    // Meeting account user identifier
    public String userId;
    // Meeting account user token
    public String userToken;
    // Meeting account user type
    public Long userType;

    public ExternalUserInfo accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    public ExternalUserInfo userId(String userId) {
        this.userId = userId;
        return this;
    }

    public ExternalUserInfo userToken(String userToken) {
        this.userToken = userToken;
        return this;
    }

    public ExternalUserInfo userType(Long userType) {
        this.userType = userType;
        return this;
    }
}
