package com.ringcentral.definitions;


public class GrantInfo {
    /**
     * Canonical URI of a grant
     */
    public String uri;
    /**
     * Extension information
     */
    public ExtensionInfoGrants extension;
    /**
     * Specifies if picking up of other extensions' calls is allowed for the extension. If 'Presence' feature is disabled for the given extension, the flag is not returned
     */
    public Boolean callPickup;
    /**
     * Specifies if monitoring of other extensions' calls is allowed for the extension. If 'CallMonitoring' feature is disabled for the given extension, the flag is not returned
     */
    public Boolean callMonitoring;
    /**
     * Specifies whether the current extension is able to make or receive calls on behalf of the user referenced in extension object
     */
    public Boolean callOnBehalfOf;
    /**
     * Specifies whether the current extension can delegate a call to the user referenced in extension object
     */
    public Boolean callDelegation;
    /**
     * Specifies whether the current extension is allowed to call Paging Only group referenced to in extension object
     */
    public Boolean groupPaging;
    /**
     * Specifies whether the current extension is assigned as a Full-Access manager in the call queue referenced in extension object
     */
    public Boolean callQueueSetup;
    /**
     * Specifies whether the current extension is assigned as a Members-Only manager in the call queue referenced in extension object
     */
    public Boolean callQueueMembersSetup;

    public GrantInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public GrantInfo extension(ExtensionInfoGrants extension) {
        this.extension = extension;
        return this;
    }

    public GrantInfo callPickup(Boolean callPickup) {
        this.callPickup = callPickup;
        return this;
    }

    public GrantInfo callMonitoring(Boolean callMonitoring) {
        this.callMonitoring = callMonitoring;
        return this;
    }

    public GrantInfo callOnBehalfOf(Boolean callOnBehalfOf) {
        this.callOnBehalfOf = callOnBehalfOf;
        return this;
    }

    public GrantInfo callDelegation(Boolean callDelegation) {
        this.callDelegation = callDelegation;
        return this;
    }

    public GrantInfo groupPaging(Boolean groupPaging) {
        this.groupPaging = groupPaging;
        return this;
    }

    public GrantInfo callQueueSetup(Boolean callQueueSetup) {
        this.callQueueSetup = callQueueSetup;
        return this;
    }

    public GrantInfo callQueueMembersSetup(Boolean callQueueMembersSetup) {
        this.callQueueMembersSetup = callQueueMembersSetup;
        return this;
    }

}
