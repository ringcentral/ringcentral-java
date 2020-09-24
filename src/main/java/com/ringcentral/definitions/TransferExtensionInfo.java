package com.ringcentral.definitions;


public class TransferExtensionInfo {
    /**
     * Internal identifier of an extension the call is transferred to
     */
    public String id;
    /**
     * Extension name
     */
    public String name;
    /**
     * Extension number
     */
    public String extensionNumber;

    public TransferExtensionInfo id(String id) {
        this.id = id;
        return this;
    }

    public TransferExtensionInfo name(String name) {
        this.name = name;
        return this;
    }

    public TransferExtensionInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

}
