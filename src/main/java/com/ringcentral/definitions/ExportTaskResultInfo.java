package com.ringcentral.definitions;


public class ExportTaskResultInfo {
    /**
     * Size of the collected data archive in bytes
     */
    public Long size;
    /**
     * Canonical URI for downloading an archive
     */
    public String uri;

    public ExportTaskResultInfo size(Long size) {
        this.size = size;
        return this;
    }

    public ExportTaskResultInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

}
