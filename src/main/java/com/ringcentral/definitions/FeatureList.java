package com.ringcentral.definitions;


public class FeatureList {
    /**
     *
     */
    public FeatureInfo[] records;

    public FeatureList records(FeatureInfo[] records) {
        this.records = records;
        return this;
    }
}
