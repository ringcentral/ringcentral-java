package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class ContentAttachment {
    /**
     * Type of the attachment, which is generally a MIME attachment type like &quot;image/jpeg&quot;, etc.
     * <p>
     * Security level in ED determines what type of attachment is allowed.
     * <p>
     * Based on the security level the following attachment types are supported.
     * <p>
     * &quot;Strict&quot; level allows safe extensions below:
     * Content name and supported types
     * * audio (supports aac mp3 ogg m4a)
     * * image (supports bmp gif jpg jpeg png svg webp)
     * * pdf (supports pdf)
     * * text (supports csv txt log)
     * * video (supports avi flv m4v mkv mov mp4 mpg qt wmv)
     * * other (supports amr dms vcard tif tiff mpeg)
     * <p>
     * &quot;Relaxed&quot; level allows documents:
     * Content name and supported types
     * * excel (supports xls xlsm xlsx xlc xlt xltm xltx)
     * * presentation (supports key odp otp)
     * * powerpoint (supports pps ppt pptx pot)
     * * spreadsheet (supports numbers ods ots)
     * * word (supports doc docm docx dotm dotx)
     * * word_processing (supports pages odt ott rtf)
     * <p>
     * &quot;Permissive&quot; level allows all documents.
     * <p>
     * However, there are no security level restrictions for content posted through the channel.
     * Example: image/jpeg
     */
    public String contentType;
    /**
     * Creation time of the attachment.
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String creationTime;
    /**
     * Embedded in a content.
     */
    public Boolean embedded;
    /**
     * Filename of the attachment.
     * Example: 0.jpeg
     */
    public String filename;
    /**
     * Identifier of the attachment.
     * Example: 54085e5b7aa58d8b5d00006c
     */
    public String id;
    /**
     * Privacy setting of the attachment.
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Size of the attachment.
     * Format: int32
     * Example: 217571
     */
    public Long size;
    /**
     * The time when the last modification was completed.
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String lastModifiedTime;
    /**
     * Uri of the attachment.
     * Format: uri
     * Example: https://example.digital.ringcentral.com/files/attachments/54085e5b7aa58d8b5d00006c
     */
    public String uri;

    public ContentAttachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public ContentAttachment creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public ContentAttachment embedded(Boolean embedded) {
        this.embedded = embedded;
        return this;
    }

    public ContentAttachment filename(String filename) {
        this.filename = filename;
        return this;
    }

    public ContentAttachment id(String id) {
        this.id = id;
        return this;
    }

    public ContentAttachment _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public ContentAttachment size(Long size) {
        this.size = size;
        return this;
    }

    public ContentAttachment lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public ContentAttachment uri(String uri) {
        this.uri = uri;
        return this;
    }
}
