package com.ringcentral.definitions;


public class DepartmentResource {
    /**
     *
     */
    public String uri;
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String extensionNumber;

    public DepartmentResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DepartmentResource id(String id) {
        this.id = id;
        return this;
    }

    public DepartmentResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
