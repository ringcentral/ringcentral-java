package com.ringcentral.definitions;


public class ExtensionCallerIdInfoRequest
{
    /**
     * Canonical URL of a caller ID resource
     * Format: uri
     */
    public String uri;
    public ExtensionCallerIdInfoRequest uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public CallerIdByDeviceRequest[] byDevice;
    public ExtensionCallerIdInfoRequest byDevice(CallerIdByDeviceRequest[] byDevice)
    {
        this.byDevice = byDevice;
        return this;
    }

    /**
     */
    public CallerIdByFeatureRequest[] byFeature;
    public ExtensionCallerIdInfoRequest byFeature(CallerIdByFeatureRequest[] byFeature)
    {
        this.byFeature = byFeature;
        return this;
    }

    /**
     * If &#039;True&#039;, then the user first name and last name will be used
    * as caller ID when making outbound calls from extension
     */
    public Boolean extensionNameForOutboundCalls;
    public ExtensionCallerIdInfoRequest extensionNameForOutboundCalls(Boolean extensionNameForOutboundCalls)
    {
        this.extensionNameForOutboundCalls = extensionNameForOutboundCalls;
        return this;
    }

    /**
     * If &#039;True&#039;, then extension number will be used as caller ID
    * when making internal calls
     */
    public Boolean extensionNumberForInternalCalls;
    public ExtensionCallerIdInfoRequest extensionNumberForInternalCalls(Boolean extensionNumberForInternalCalls)
    {
        this.extensionNumberForInternalCalls = extensionNumberForInternalCalls;
        return this;
    }
}