package com.ringcentral.definitions;


public class UpdateEveryoneTeamRequest {
    /**
     * Everyone chat name. Maximum number of characters supported is 250
     */
    public String name;
    /**
     * Everyone chat description. Maximum number of characters supported is 1000
     */
    public String description;

    public UpdateEveryoneTeamRequest name(String name) {
        this.name = name;
        return this;
    }

    public UpdateEveryoneTeamRequest description(String description) {
        this.description = description;
        return this;
    }
}
