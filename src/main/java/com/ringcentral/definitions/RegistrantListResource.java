package com.ringcentral.definitions;

public class RegistrantListResource {
    /** Required */
    public RegistrantModelWithQuestionnaire[] records;

    public RegistrantListResource records(RegistrantModelWithQuestionnaire[] records) {
        this.records = records;
        return this;
    }

    /** Required */
    public RcwPagingForwardModel paging;

    public RegistrantListResource paging(RcwPagingForwardModel paging) {
        this.paging = paging;
        return this;
    }
}
