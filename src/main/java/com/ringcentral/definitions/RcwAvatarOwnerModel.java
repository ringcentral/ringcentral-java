package com.ringcentral.definitions;


public class RcwAvatarOwnerModel {
    /**
     * A token to access avatar image from CDN. Available only for authenticated panel members and attendees
     * Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;

    public RcwAvatarOwnerModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }
}
