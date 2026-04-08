package com.ringcentral.definitions;

/** Query parameters for operation listMessages */
public class ListMessagesParameters {
    /**
     * Filters shared messages based on the owner extension. Supported if the
     * &#039;SharedVoicemail&#039; or &#039;CallQueueSmsRecipient&#039; feature is enabled Default:
     * Personal Enum: Any, Personal, Shared
     */
    public String[] owner;

    public ListMessagesParameters owner(String[] owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Specifies the availability status for resulting messages. Multiple values are accepted Enum:
     * Alive, Deleted, Purged
     */
    public String[] availability;

    public ListMessagesParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    /** Specifies a conversation identifier for the resulting messages */
    public String conversationId;

    public ListMessagesParameters conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Start date/time for resulting messages in ISO 8601 format including timezone, for example
     * 2016-03-10T18:07:52.534Z. The default value is dateTo minus 24 hours Format: date-time
     */
    public String dateFrom;

    public ListMessagesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    /**
     * End date/time for resulting messages in ISO 8601 format including timezone, for example
     * 2016-03-10T18:07:52.534Z. The default value is current time Format: date-time
     */
    public String dateTo;

    public ListMessagesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    /**
     * Direction for resulting messages. If not specified, both inbound and outbound messages are
     * returned. Multiple values are accepted Enum: Inbound, Outbound
     */
    public String[] direction;

    public ListMessagesParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    /** If `true`, then the latest messages per every conversation ID are returned */
    public Boolean distinctConversations;

    public ListMessagesParameters distinctConversations(Boolean distinctConversations) {
        this.distinctConversations = distinctConversations;
        return this;
    }

    /**
     * Type of resulting messages. If not specified, all messages without message type filtering are
     * returned. Multiple values are accepted Enum: Fax, SMS, VoiceMail, Pager
     */
    public String[] messageType;

    public ListMessagesParameters messageType(String[] messageType) {
        this.messageType = messageType;
        return this;
    }

    /** Read status for resulting messages. Multiple values are accepted Enum: Read, Unread */
    public String[] readStatus;

    public ListMessagesParameters readStatus(String[] readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    /**
     * Indicates a page number to retrieve. Only positive number values are accepted Format: int32
     * Default: 1
     */
    public Long page;

    public ListMessagesParameters page(Long page) {
        this.page = page;
        return this;
    }

    /** Indicates a page size (number of items) Format: int32 Default: 100 */
    public Long perPage;

    public ListMessagesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    /** Phone number. If specified, messages are returned for this particular phone number only */
    public String phoneNumber;

    public ListMessagesParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Deprecated. Filters voicemail messages based on the owner extension. Supported if the
     * &#039;SharedVoicemail&#039; feature is enabled.
     */
    public String[] voicemailOwner;

    public ListMessagesParameters voicemailOwner(String[] voicemailOwner) {
        this.voicemailOwner = voicemailOwner;
        return this;
    }

    /**
     * Filters shared messages based on the owner extension type. Supported if
     * &quot;SharedVoicemail&quot; or &quot;CallQueueSmsRecipient&quot; feature is enabled. Enum:
     * User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly,
     * SharedLinesGroup, DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension,
     * ProxyAdmin, RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser, TieLine,
     * Unknown
     */
    public String[] ownerExtensionType;

    public ListMessagesParameters ownerExtensionType(String[] ownerExtensionType) {
        this.ownerExtensionType = ownerExtensionType;
        return this;
    }
}
