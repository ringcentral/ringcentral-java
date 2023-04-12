package com.ringcentral.definitions;


public class ParticipantListResource {
    /**
     * Required
     */
    public ParticipantExtendedModel[] records;
    /**
     * Required
     */
    public RcwPagingModel paging;

    public ParticipantListResource records(ParticipantExtendedModel[] records) {
        this.records = records;
        return this;
    }

    public ParticipantListResource paging(RcwPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
