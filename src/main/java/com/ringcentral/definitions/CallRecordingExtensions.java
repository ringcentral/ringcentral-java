package com.ringcentral.definitions;


public class CallRecordingExtensions
{
    /**
     * Link to call recording extension list resource
     */
    public String uri;
    public CallRecordingExtensions uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public CallRecordingExtensionInfo[] records;
    public CallRecordingExtensions records(CallRecordingExtensionInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public CallRecordingExtensions navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public CallRecordingExtensions paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }
}