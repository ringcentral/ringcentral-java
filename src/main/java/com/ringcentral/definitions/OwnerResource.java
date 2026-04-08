package com.ringcentral.definitions;

/** Message owner information. Supported for shared voicemail and sms messages only */
public class OwnerResource {
    /** Name of a voicemail owner */
    public String name;

    public OwnerResource name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Type of the extension. For unrecognized types the `Unknown` value is returned. Please note
     * that legacy &#039;Department&#039; extension type corresponds to &#039;Call Queue&#039;
     * extensions in modern RingCentral product terminology Example: User Enum: User, Department,
     * Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup,
     * DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin,
     * RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser, TieLine, Unknown
     */
    public String extensionType;

    public OwnerResource extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }

    /** Internal identifier of an extension */
    public String extensionId;

    public OwnerResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
}
