package com.ringcentral.definitions;


public class CallRecordingExtensions
{
    /**
     * Link to call recording extension list resource
     * Format: uri
     */
    public String uri;
    public CallRecordingExtensions uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public CallRecordingExtensionResource[] records;
    public CallRecordingExtensions records(CallRecordingExtensionResource[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public PageNavigationModel navigation;
    public CallRecordingExtensions navigation(PageNavigationModel navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPagingModel paging;
    public CallRecordingExtensions paging(EnumeratedPagingModel paging)
    {
        this.paging = paging;
        return this;
    }
}