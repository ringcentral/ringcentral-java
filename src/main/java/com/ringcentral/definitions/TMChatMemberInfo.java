package com.ringcentral.definitions;


public class TMChatMemberInfo {
    /**
     * Internal identifier of a user
     */
    public String id;

    public TMChatMemberInfo id(String id) {
        this.id = id;
        return this;
    }
}
