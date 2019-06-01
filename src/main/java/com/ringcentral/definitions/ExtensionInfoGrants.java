package com.ringcentral.definitions;


public class ExtensionInfoGrants {
    /**
     * Internal identifier of an extension
     */
    public String id;
    /**
     * Canonical URI of an extension
     */
    public String uri;
    /**
     * Extension short number (usually 3 or 4 digits)
     */
    public String extensionNumber;
    /**
     * Extension type
     * Enum: User, Fax User, VirtualUser, DigitalUser, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, IvrMenu, ApplicationExtension, Park Location
     */
    public String type;

    public ExtensionInfoGrants id(String id) {
        this.id = id;
        return this;
    }

    public ExtensionInfoGrants uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionInfoGrants extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionInfoGrants type(String type) {
        this.type = type;
        return this;
    }

}
