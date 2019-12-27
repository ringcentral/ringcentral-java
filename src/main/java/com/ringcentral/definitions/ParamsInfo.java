package com.ringcentral.definitions;


public class ParamsInfo {
    /**
     * Parameter name
     */
    public String name;
    /**
     * Parameter value
     */
    public String value;

    public ParamsInfo name(String name) {
        this.name = name;
        return this;
    }

    public ParamsInfo value(String value) {
        this.value = value;
        return this;
    }

}
