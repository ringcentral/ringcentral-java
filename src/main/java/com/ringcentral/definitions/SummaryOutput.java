package com.ringcentral.definitions;


public class SummaryOutput {
    /**
     *
     */
    public SummaryOutputUnit[] summaries;

    public SummaryOutput summaries(SummaryOutputUnit[] summaries) {
        this.summaries = summaries;
        return this;
    }
}
