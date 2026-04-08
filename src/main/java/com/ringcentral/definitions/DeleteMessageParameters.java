package com.ringcentral.definitions;

/** Query parameters for operation deleteMessage */
public class DeleteMessageParameters {
    /** If the value is `true`, then the message is purged immediately with all the attachments */
    public Boolean purge;

    public DeleteMessageParameters purge(Boolean purge) {
        this.purge = purge;
        return this;
    }

    /** Type of messages to be deleted Default: All Enum: Fax, SMS, VoiceMail, Pager, Text, All */
    public String type;

    public DeleteMessageParameters type(String type) {
        this.type = type;
        return this;
    }
}
