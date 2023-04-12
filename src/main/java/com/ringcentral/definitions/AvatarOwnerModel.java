package com.ringcentral.definitions;


public class AvatarOwnerModel {
    /**
     * A token to access avatar image from CDN. Available only for authenticated panelists
     * Example: wedyugwied8wud98u90i329silqdjalidj
     */
    public String avatarToken;

    public AvatarOwnerModel avatarToken(String avatarToken) {
        this.avatarToken = avatarToken;
        return this;
    }
}
