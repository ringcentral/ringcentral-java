package com.ringcentral.definitions;


public class ExportTaskResultInfo {
    /**
     * Internal identifier of a dataset
     */
    public String id;
    /**
     * Link for downloading a dataset
     */
    public String uri;
    /**
     * Size of ta dataset in bytes
     */
    public Long size;

    public ExportTaskResultInfo id(String id) {
        this.id = id;
        return this;
    }

    public ExportTaskResultInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExportTaskResultInfo size(Long size) {
        this.size = size;
        return this;
    }
}
