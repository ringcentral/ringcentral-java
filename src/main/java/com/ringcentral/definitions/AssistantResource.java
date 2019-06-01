package com.ringcentral.definitions;


public class AssistantResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String name;

    public AssistantResource id(String id) {
        this.id = id;
        return this;
    }

    public AssistantResource name(String name) {
        this.name = name;
        return this;
    }

}
