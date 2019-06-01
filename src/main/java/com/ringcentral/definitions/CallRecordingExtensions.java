package com.ringcentral.definitions;


public class CallRecordingExtensions {
    /**
     * Link to call recording extension list resource
     */
    public String uri;
    /**
     *
     */
    public CallRecordingExtensionInfo[] records;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

    public CallRecordingExtensions uri(String uri) {
        this.uri = uri;
        return this;
    }

    public CallRecordingExtensions records(CallRecordingExtensionInfo[] records) {
        this.records = records;
        return this;
    }

    public CallRecordingExtensions navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public CallRecordingExtensions paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
