package com.ringcentral.definitions;


public class GlipTaskList {
    /**
     *
     */
    public GlipTaskInfo[] records;

    public GlipTaskList records(GlipTaskInfo[] records) {
        this.records = records;
        return this;
    }
}
