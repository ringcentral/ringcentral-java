package com.ringcentral.definitions;


/**
 * Site Fax/SMS recipient (operator) reference. Multi-level IVR should
 * be enabled
 */
public class OperatorInfo {
    /**
     * Internal identifier of an operator
     */
    public String id;
    /**
     * Link to an operator resource
     * Format: uri
     */
    public String uri;
    /**
     * Extension number (pin)
     */
    public String extensionNumber;
    /**
     * Operator extension user full name
     */
    public String name;

    public OperatorInfo id(String id) {
        this.id = id;
        return this;
    }

    public OperatorInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public OperatorInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public OperatorInfo name(String name) {
        this.name = name;
        return this;
    }
}
