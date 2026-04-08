package com.ringcentral.definitions;

/** Query parameters for operation deleteMessageByFilter */
public class DeleteMessageByFilterParameters {
    /**
     * Filters shared messages based on the owner extension. Supported if the
     * &#039;SharedVoicemail&#039; or &#039;CallQueueSmsRecipient&#039; feature is enabled Default:
     * Personal Enum: Any, Personal, Shared
     */
    public String[] owner;

    public DeleteMessageByFilterParameters owner(String[] owner) {
        this.owner = owner;
        return this;
    }

    /** ID(s) of a conversation to delete */
    public String[] conversationId;

    public DeleteMessageByFilterParameters conversationId(String[] conversationId) {
        this.conversationId = conversationId;
        return this;
    }

    /**
     * Messages received earlier then the date specified will be deleted. The default value is
     * current date/time Format: date-time
     */
    public String dateTo;

    public DeleteMessageByFilterParameters dateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }

    /** Type of messages to be deleted Default: All Enum: Fax, SMS, VoiceMail, Pager, Text, All */
    public String type;

    public DeleteMessageByFilterParameters type(String type) {
        this.type = type;
        return this;
    }

    /** If the value is `true`, then the messages are purged immediately with all the attachments */
    public Boolean purge;

    public DeleteMessageByFilterParameters purge(Boolean purge) {
        this.purge = purge;
        return this;
    }
}
