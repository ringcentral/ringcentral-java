package com.ringcentral.definitions;


public class DelegateInfo {
    /**
     *
     */
    public DelegateExtensionInfo extension;
    /**
     * Specifies whether Secretary is permitted to pickup calls on behalf of Boss
     */
    public Boolean callPickup;
    /**
     * Specifies whether Secretary is permitted to organize conference on behalf of Boss
     */
    public Boolean conferencing;

    public DelegateInfo extension(DelegateExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    public DelegateInfo callPickup(Boolean callPickup) {
        this.callPickup = callPickup;
        return this;
    }

    public DelegateInfo conferencing(Boolean conferencing) {
        this.conferencing = conferencing;
        return this;
    }

}
