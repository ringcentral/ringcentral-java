package com.ringcentral.definitions;


public class CallRecordingExtensions {
    /**
     * Link to call recording extension list resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public CallRecordingExtensionInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public CallRecordingExtensions uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingExtensions records(CallRecordingExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public CallRecordingExtensions navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallRecordingExtensions paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
