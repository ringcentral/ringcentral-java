package com.ringcentral.definitions;


/**
 * Swap device request
 */
public class SwapDeviceRequest {
    /**
     * Internal identifier of a target device, to which the current one will be swapped
     * Example: 8459879873
     */
    public String targetDeviceId;

    public SwapDeviceRequest targetDeviceId(String targetDeviceId) {
        this.targetDeviceId = targetDeviceId;
        return this;
    }
}
