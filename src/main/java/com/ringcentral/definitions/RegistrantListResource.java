package com.ringcentral.definitions;


public class RegistrantListResource {
    /**
     * Required
     */
    public RegistrantModelWithQuestionnaire[] records;
    /**
     * Required
     */
    public RcwPagingForwardModel paging;

    public RegistrantListResource records(RegistrantModelWithQuestionnaire[] records) {
        this.records = records;
        return this;
    }

    public RegistrantListResource paging(RcwPagingForwardModel paging) {
        this.paging = paging;
        return this;
    }
}
