package com.ringcentral.definitions;


public class GrantInfo
{
    /**
     * Canonical URI of a grant
     * Format: uri
     */
    public String uri;
    public GrantInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public ExtensionInfoGrants extension;
    public GrantInfo extension(ExtensionInfoGrants extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Specifies if picking up of other extensions&#039; calls is allowed
    * for the extension. If &#039;Presence&#039; feature is disabled for the given extension,
    * the flag is not returned
     */
    public Boolean callPickup;
    public GrantInfo callPickup(Boolean callPickup)
    {
        this.callPickup = callPickup;
        return this;
    }

    /**
     * Specifies if monitoring of other extensions&#039; calls is allowed
    * for the extension. If &#039;CallMonitoring&#039; feature is disabled for the given
    * extension, the flag is not returned
     */
    public Boolean callMonitoring;
    public GrantInfo callMonitoring(Boolean callMonitoring)
    {
        this.callMonitoring = callMonitoring;
        return this;
    }

    /**
     * Specifies whether the current extension is able to make or
    * receive calls on behalf of the user referenced in extension object
     */
    public Boolean callOnBehalfOf;
    public GrantInfo callOnBehalfOf(Boolean callOnBehalfOf)
    {
        this.callOnBehalfOf = callOnBehalfOf;
        return this;
    }

    /**
     * Specifies whether the current extension can delegate a call
    * to the user referenced in extension object
     */
    public Boolean callDelegation;
    public GrantInfo callDelegation(Boolean callDelegation)
    {
        this.callDelegation = callDelegation;
        return this;
    }

    /**
     * Specifies whether the current extension is allowed to call
    * Paging Only group referenced to in extension object
     */
    public Boolean groupPaging;
    public GrantInfo groupPaging(Boolean groupPaging)
    {
        this.groupPaging = groupPaging;
        return this;
    }

    /**
     * Specifies whether the current extension is assigned as a Full-Access
    * manager in the call queue referenced in extension object
     */
    public Boolean callQueueSetup;
    public GrantInfo callQueueSetup(Boolean callQueueSetup)
    {
        this.callQueueSetup = callQueueSetup;
        return this;
    }

    /**
     * Specifies whether the current extension is assigned as a Members-Only
    * manager in the call queue referenced in extension object
     */
    public Boolean callQueueMembersSetup;
    public GrantInfo callQueueMembersSetup(Boolean callQueueMembersSetup)
    {
        this.callQueueMembersSetup = callQueueMembersSetup;
        return this;
    }

    /**
     * Specifies whether the current extension is assigned as a Messages Manager
    * in the queue referenced in extension object
     */
    public Boolean callQueueMessages;
    public GrantInfo callQueueMessages(Boolean callQueueMessages)
    {
        this.callQueueMessages = callQueueMessages;
        return this;
    }
}