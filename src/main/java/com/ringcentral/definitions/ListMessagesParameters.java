package com.ringcentral.definitions;


/**
 * Query parameters for operation listMessages
 */
public class ListMessagesParameters {
    /**
     * Specifies the availability status for resulting messages.
     * Multiple values are accepted
     * Enum: Alive, Deleted, Purged
     */
    public String[] availability;
    /**
     * Specifies a conversation identifier for the resulting messages
     */
    public String conversationId;
    /**
     * Start date/time for resulting messages in ISO 8601 format
     * including timezone, for example 2016-03-10T18:07:52.534Z. The default value
     * is dateTo minus 24 hours
     * Format: date-time
     */
    public String dateFrom;
    /**
     * End date/time for resulting messages in ISO 8601 format including
     * timezone, for example 2016-03-10T18:07:52.534Z. The default value is current
     * time
     * Format: date-time
     */
    public String dateTo;
    /**
     * Direction for resulting messages. If not specified, both
     * inbound and outbound messages are returned. Multiple values are accepted
     * Enum: Inbound, Outbound
     */
    public String[] direction;
    /**
     * If `true`, then the latest messages per every conversation ID
     * are returned
     */
    public Boolean distinctConversations;
    /**
     * Type of resulting messages. If not specified, all messages
     * without message type filtering are returned. Multiple values are accepted
     * Enum: Fax, SMS, VoiceMail, Pager
     */
    public String[] messageType;
    /**
     * Read status for resulting messages. Multiple values are
     * accepted
     * Enum: Read, Unread
     */
    public String[] readStatus;
    /**
     * Indicates a page number to retrieve. Only positive number values
     * are accepted
     * Format: int32
     * Default: 1
     */
    public Long page;
    /**
     * Indicates a page size (number of items)
     * Format: int32
     * Default: 100
     */
    public Long perPage;
    /**
     * Phone number. If specified, messages are returned for this
     * particular phone number only
     */
    public String phoneNumber;
    /**
     * Deprecated. Filters voicemail messages based on the owner extension. Supported if the &#039;SharedVoicemail&#039;
     * feature is enabled.
     */
    public String[] voicemailOwner;
    /**
     * Filters shared messages based on the owner extension. Supported if the &#039;SharedVoicemail&#039; or &#039;CallQueueSmsRecipient&#039;
     * feature is enabled.
     */
    public String[] owner;
    /**
     * Filters shared messages based on the owner extension type. Supported if &quot;SharedVoicemail&quot; or &quot;CallQueueSmsRecipient&quot;
     * feature is enabled.
     * Enum: User, Department, Announcement, Voicemail, DigitalUser, VirtualUser, FaxUser, PagingOnly, SharedLinesGroup, DelegatedLinesGroup, GroupCallPickup, IvrMenu, ApplicationExtension, ProxyAdmin, RoomConnector, ParkLocation, Limited, Bot, Site, Room, FlexibleUser
     */
    public String[] ownerExtensionType;

    public ListMessagesParameters availability(String[] availability) {
        this.availability = availability;
        return this;
    }

    public ListMessagesParameters conversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    public ListMessagesParameters dateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }

    public ListMessagesParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    public ListMessagesParameters direction(String[] direction) {
        this.direction = direction;
        return this;
    }

    public ListMessagesParameters distinctConversations(Boolean distinctConversations) {
        this.distinctConversations = distinctConversations;
        return this;
    }

    public ListMessagesParameters messageType(String[] messageType) {
        this.messageType = messageType;
        return this;
    }

    public ListMessagesParameters readStatus(String[] readStatus) {
        this.readStatus = readStatus;
        return this;
    }

    public ListMessagesParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListMessagesParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListMessagesParameters phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public ListMessagesParameters voicemailOwner(String[] voicemailOwner) {
        this.voicemailOwner = voicemailOwner;
        return this;
    }

    public ListMessagesParameters owner(String[] owner) {
        this.owner = owner;
        return this;
    }

    public ListMessagesParameters ownerExtensionType(String[] ownerExtensionType) {
        this.ownerExtensionType = ownerExtensionType;
        return this;
    }
}
