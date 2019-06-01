package com.ringcentral.definitions;


public class MessageStoreReportArchive {
    /**
     *
     */
    public ArchiveInfo[] records;

    public MessageStoreReportArchive records(ArchiveInfo[] records) {
        this.records = records;
        return this;
    }

}
