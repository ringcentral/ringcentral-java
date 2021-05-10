package com.ringcentral.definitions;


// Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
public class DepartmentInfo {
    /**
     * Internal identifier of a department extension
     */
    public String id;
    /**
     * Canonical URI of a department extension
     */
    public String uri;
    /**
     * Number of a department extension
     */
    public String extensionNumber;

    public DepartmentInfo id(String id) {
        this.id = id;
        return this;
    }

    public DepartmentInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DepartmentInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
