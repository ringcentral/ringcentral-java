package com.ringcentral.definitions;

public class ThreadNoteList {
    /** Required */
    public ThreadNoteModel[] records;

    public ThreadNoteList records(ThreadNoteModel[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public EnumeratedPagingModel paging;

    public ThreadNoteList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
