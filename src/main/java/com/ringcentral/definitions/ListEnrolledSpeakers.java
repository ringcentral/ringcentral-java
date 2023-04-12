package com.ringcentral.definitions;


public class ListEnrolledSpeakers {
    /**
     * Required
     */
    public PagingSchema paging;
    /**
     * Required
     */
    public EnrollmentStatus[] records;

    public ListEnrolledSpeakers paging(PagingSchema paging) {
        this.paging = paging;
        return this;
    }

    public ListEnrolledSpeakers records(EnrollmentStatus[] records) {
        this.records = records;
        return this;
    }
}
