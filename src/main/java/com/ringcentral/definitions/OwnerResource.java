package com.ringcentral.definitions;


/**
 * Message owner information. Supported for shared voicemail and sms messages only
 */
public class OwnerResource {
    /**
     * Name of a voicemail owner
     */
    public String name;
    /**
     * ExtensionType
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin, RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser
     */
    public String extensionType;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;

    public OwnerResource name(String name) {
        this.name = name;
        return this;
    }

    public OwnerResource extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    public OwnerResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
