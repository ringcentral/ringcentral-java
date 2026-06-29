package com.ringcentral.definitions;

public class MessageAttachmentResponseEntry {
    /** Unique identifier of an attachment Required */
    public String id;

    public MessageAttachmentResponseEntry id(String id) {
        this.id = id;
        return this;
    }

    /** MIME content type of an attachment Required Example: audio/mpeg */
    public String contentType;

    public MessageAttachmentResponseEntry contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /** Suggested filename of an attachment. Example: my-song.mp3 */
    public String filename;

    public MessageAttachmentResponseEntry filename(String filename) {
        this.filename = filename;
        return this;
    }

    /** Link to the attachment binary content Required Format: uri */
    public String contentUri;

    public MessageAttachmentResponseEntry contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /** Size of the file in bytes Required Format: int64 */
    public Long size;

    public MessageAttachmentResponseEntry size(Long size) {
        this.size = size;
        return this;
    }
}
