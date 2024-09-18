package com.ringcentral.definitions;

import com.google.gson.annotations.SerializedName;


public class SocMsgContentAttachment {
    /**
     * Type of attachment, which is generally a MIME attachment type like `image/jpeg`, etc.
     * Security level in RingCX determines what type of attachment is allowed.
     * Based on the security level the following attachment types are supported.
     * <p>
     * *&#039;Strict&#039;* level allows safe extensions below:
     * Content name and supported types:
     * <p>
     * - audio (AAC, MP3, OGG, M4A)
     * - image (BMP, GIF, JPG, JPEG, PNG, SVG, WEBP)
     * - pdf (PDF)
     * - text (CSV, TXT, LOG)
     * - video (AVI, FLV, M4V, MKV, MOV, MP4, MPG, QT, WMV)
     * - other (AMR, DMS, VCARD, TIF, TIFF, MPEG)
     * <p>
     * *&#039;Relaxed&#039;* level allows documents:
     * Content name and supported types:
     * <p>
     * - excel (XLS, XLSM, XLSX, XLC, XLT, XLTM, XLTX)
     * - presentation (KEY, ODP, OTP)
     * - powerpoint (PPS, PPT, PPTX, POT)
     * - spreadsheet (Numbers - ODS, OTS)
     * - word (DOC, DOCM, DOCX, DOTM, DOTX)
     * - word_processing (Pages - ODT, OTT, RTF)
     * <p>
     * *&#039;Permissive&#039;* level allows all documents.
     * <p>
     * However, there are no security level restrictions for content posted through the channel
     * Example: image/jpeg
     */
    public String contentType;
    /**
     * Creation time of the resource.
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String creationTime;
    /**
     * Specifies if attachment is embedded in content
     */
    public Boolean embedded;
    /**
     * Filename of attachment
     * Example: 0.jpeg
     */
    public String filename;
    /**
     * Identifier of the attachment.
     * Example: 54085e5b7aa58d8b5d00006c
     */
    public String id;
    /**
     * Attachment privacy setting
     * Default: true
     */
    @SerializedName("public")
    public Boolean _public;
    /**
     * Size of attachment
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
     * Attachment URI
     * Format: uri
     * Example: https://example.digital.ringcentral.com/files/attachments/54085e5b7aa58d8b5d00006c
     */
    public String uri;

    public SocMsgContentAttachment contentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    public SocMsgContentAttachment creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public SocMsgContentAttachment embedded(Boolean embedded) {
        this.embedded = embedded;
        return this;
    }

    public SocMsgContentAttachment filename(String filename) {
        this.filename = filename;
        return this;
    }

    public SocMsgContentAttachment id(String id) {
        this.id = id;
        return this;
    }

    public SocMsgContentAttachment _public(Boolean _public) {
        this._public = _public;
        return this;
    }

    public SocMsgContentAttachment size(Long size) {
        this.size = size;
        return this;
    }

    public SocMsgContentAttachment lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public SocMsgContentAttachment uri(String uri) {
        this.uri = uri;
        return this;
    }
}
