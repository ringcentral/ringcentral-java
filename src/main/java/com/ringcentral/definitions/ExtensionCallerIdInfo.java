package com.ringcentral.definitions;


public class ExtensionCallerIdInfo
{
    /**
     * Canonical URL of a caller ID resource
     * Format: uri
     */
    public String uri;
    public ExtensionCallerIdInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public CallerIdByDevice[] byDevice;
    public ExtensionCallerIdInfo byDevice(CallerIdByDevice[] byDevice)
    {
        this.byDevice = byDevice;
        return this;
    }

    /**
     */
    public CallerIdByFeature[] byFeature;
    public ExtensionCallerIdInfo byFeature(CallerIdByFeature[] byFeature)
    {
        this.byFeature = byFeature;
        return this;
    }

    /**
     * If &#039;True&#039;, then user first name and last name will be used
    * as caller ID when making outbound calls from extension
     */
    public Boolean extensionNameForOutboundCalls;
    public ExtensionCallerIdInfo extensionNameForOutboundCalls(Boolean extensionNameForOutboundCalls)
    {
        this.extensionNameForOutboundCalls = extensionNameForOutboundCalls;
        return this;
    }

    /**
     * If &#039;True&#039;, then extension number will be used as caller ID
    * when making internal calls
     */
    public Boolean extensionNumberForInternalCalls;
    public ExtensionCallerIdInfo extensionNumberForInternalCalls(Boolean extensionNumberForInternalCalls)
    {
        this.extensionNumberForInternalCalls = extensionNumberForInternalCalls;
        return this;
    }
}