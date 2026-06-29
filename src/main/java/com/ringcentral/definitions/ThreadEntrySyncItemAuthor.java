package com.ringcentral.definitions;

public class ThreadEntrySyncItemAuthor {
    /** Thread user&#039;s extension ID Example: 9876453210 */
    public String extensionId;

    public ThreadEntrySyncItemAuthor extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /** Thread user&#039;s name (first + last) Example: John Doe */
    public String name;

    public ThreadEntrySyncItemAuthor name(String name) {
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

    public ThreadEntrySyncItemAuthor extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }
}
