package com.ringcentral.definitions;


/**
 * Operator extension information. This extension will receive
 * all calls and messages addressed to an operator.
 */
public class AccountOperatorInfo {
    /**
     * Link to an operator extension resource
     * Format: uri
     */
    public String uri;
    /**
     * Internal identifier of an operator extension
     * Format: int64
     */
    public Long id;
    /**
     * Number of an operator extension
     */
    public String extensionNumber;

    public AccountOperatorInfo uri(String uri) {
        this.uri = uri;
        return this;
    }

    public AccountOperatorInfo id(Long id) {
        this.id = id;
        return this;
    }

    public AccountOperatorInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
}
