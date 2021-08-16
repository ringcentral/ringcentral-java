package com.ringcentral.definitions;


public class ExtensionCallerIdInfoRequest {
    /**
     * Canonical URL of a caller ID resource
     */
    public String uri;
    /**
     *
     */
    public CallerIdByDeviceRequest[] byDevice;
    /**
     *
     */
    public CallerIdByFeatureRequest[] byFeature;
    /**
     * If &#039;True&#039;, then user first name and last name will be used as caller ID when making outbound calls from extension
     */
    public Boolean extensionNameForOutboundCalls;
    /**
     * If &#039;True&#039;, then extension number will be used as caller ID when making internal calls
     */
    public Boolean extensionNumberForInternalCalls;

    public ExtensionCallerIdInfoRequest uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionCallerIdInfoRequest byDevice(CallerIdByDeviceRequest[] byDevice) {
        this.byDevice = byDevice;
        return this;
    }

    public ExtensionCallerIdInfoRequest byFeature(CallerIdByFeatureRequest[] byFeature) {
        this.byFeature = byFeature;
        return this;
    }

    public ExtensionCallerIdInfoRequest extensionNameForOutboundCalls(Boolean extensionNameForOutboundCalls) {
        this.extensionNameForOutboundCalls = extensionNameForOutboundCalls;
        return this;
    }

    public ExtensionCallerIdInfoRequest extensionNumberForInternalCalls(Boolean extensionNumberForInternalCalls) {
        this.extensionNumberForInternalCalls = extensionNumberForInternalCalls;
        return this;
    }
}
