package com.ringcentral.definitions;


public class BridgeDiscovery {
    /**
     * URI that can be used to join to the meeting.
     * It contains password parameter only if the request was done by bridge owner, his delegate or any user who has
     * the Super Admin privilege.
     * Example: https://v.ringcentral.com/join/018209241352?pw=99e4f8e6a241fc71279449a9c8f46eef
     */
    public String web;

    public BridgeDiscovery web(String web) {
        this.web = web;
        return this;
    }
}
