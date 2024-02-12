package com.ringcentral.definitions;


/**
 * Information on the extension, to which the phone number is assigned.
 * Returned only for the request of Account phone number list
 */
public class ExtensionInfo {
    /**
     * Internal identifier of an extension
     * Format: int64
     */
    public Long id;
    /**
     * Canonical URI of an extension
     * Format: uri
     */
    public String uri;
    /**
     * Extension name
     */
    public String name;
    /**
     * Extension short number
     */
    public String extensionNumber;
    /**
     * For partner applications. Internal identifier of an extension
     * created by partner. The RingCentral supports the mapping of accounts and
     * stores the corresponding account ID/extension ID for each partner ID of
     * a client application. In request URIs partner IDs are accepted instead
     * of regular RingCentral native IDs as path parameters using `pid=XXX` clause.
     * Though in response URIs contain the corresponding account IDs and extension
     * IDs. In all request and response bodies these values are reflected via
     * partnerId attributes of account and extension
     */
    public String partnerId;

    public ExtensionInfo id(Long id) {
        this.id = id;
        return this;
    }

    public ExtensionInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public ExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    public ExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ExtensionInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
}
