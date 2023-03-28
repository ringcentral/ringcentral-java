package com.ringcentral.definitions;


/**
 * Query parameters for operation deleteMessage
 */
public class DeleteMessageParameters {
    /**
     * If the value is `true`, then the message is purged immediately
     * with all the attachments
     */
    public Boolean purge;

    public DeleteMessageParameters purge(Boolean purge) {
        this.purge = purge;
        return this;
    }
}
