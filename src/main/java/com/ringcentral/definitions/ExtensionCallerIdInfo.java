package com.ringcentral.definitions;


public class ExtensionCallerIdInfo {
    /**
     * Canonical URL of a caller ID resource
     */
    public String uri;
    /**
     *
     */
    public CallerIdByDevice[] byDevice;
    /**
     *
     */
    public CallerIdByFeature[] byFeature;
    /**
     * If 'True', then user first name and last name will be used as caller ID when making outbound calls from extension
     */
    public Boolean extensionNameForOutboundCalls;
    /**
     * If 'True', then extension number will be used as caller ID when making internal calls
     */
    public Boolean extensionNumberForInternalCalls;

    public ExtensionCallerIdInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionCallerIdInfo byDevice(CallerIdByDevice[] byDevice) {
        this.byDevice = byDevice;
        return this;
    }

    public ExtensionCallerIdInfo byFeature(CallerIdByFeature[] byFeature) {
        this.byFeature = byFeature;
        return this;
    }

    public ExtensionCallerIdInfo extensionNameForOutboundCalls(Boolean extensionNameForOutboundCalls) {
        this.extensionNameForOutboundCalls = extensionNameForOutboundCalls;
        return this;
    }

    public ExtensionCallerIdInfo extensionNumberForInternalCalls(Boolean extensionNumberForInternalCalls) {
        this.extensionNumberForInternalCalls = extensionNumberForInternalCalls;
        return this;
    }

}
