package com.ringcentral.definitions;


public class SummaryApiResponse {
    /**
     *
     */
    public SummaryOutputUnit[] summaries;

    public SummaryApiResponse summaries(SummaryOutputUnit[] summaries) {
        this.summaries = summaries;
        return this;
    }
}
