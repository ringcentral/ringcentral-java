package com.ringcentral.definitions;


public class RecordingDownloadModel {
    /**
     * Download URI (available only for webinar host or admin)
     * Required
     * Format: uri
     */
    public String downloadUri;
    /**
     * MIME type of the file to download.
     * Required
     * Default: video/mp4
     * Enum: video/mp4, audio/m4a
     */
    public String downloadContentType;
    /**
     * Download file size in bytes
     * Required
     * Format: int64
     * Example: 20821092300
     */
    public Long downloadSize;

    public RecordingDownloadModel downloadUri(String downloadUri) {
        this.downloadUri = downloadUri;
        return this;
    }

    public RecordingDownloadModel downloadContentType(String downloadContentType) {
        this.downloadContentType = downloadContentType;
        return this;
    }

    public RecordingDownloadModel downloadSize(Long downloadSize) {
        this.downloadSize = downloadSize;
        return this;
    }
}
