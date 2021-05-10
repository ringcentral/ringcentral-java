package com.ringcentral.definitions;


// Please note that legacy 'Department' extension type corresponds to 'Call Queue' extensions in modern RingCentral product terminology
public class DeviceDepartmentResource {
    /**
     * Format: uri
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

    public DeviceDepartmentResource uri(String uri) {
        this.uri = uri;
        return this;
    }

    public DeviceDepartmentResource id(String id) {
        this.id = id;
        return this;
    }

    public DeviceDepartmentResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
