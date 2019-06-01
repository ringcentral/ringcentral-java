package com.ringcentral.definitions;


public class UpdateGlipEveryoneRequest {
    /**
     * Everyone chat name. Maximum number of characters supported is 250
     */
    public Long name;
    /**
     * Everyone chat description. Maximum number of characters supported is 1000
     */
    public String description;

    public UpdateGlipEveryoneRequest name(Long name) {
        this.name = name;
        return this;
    }

    public UpdateGlipEveryoneRequest description(String description) {
        this.description = description;
        return this;
    }

}
