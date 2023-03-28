package com.ringcentral.definitions;


public class MultipartRequestEntryBase {
    /**
     * Internal identifier of a resource (required when alternative syntax with &#039;*&#039; is used)
     * Example: 1724099032020
     */
    public String resourceId;

    public MultipartRequestEntryBase resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
}
