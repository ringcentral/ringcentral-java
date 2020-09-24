package com.ringcentral.definitions;


// Operator extension information
public class AccountOperatorInfo {
    /**
     * Link to an operator extension resource
     */
    public String uri;
    /**
     * Internal identifier of an operator extension
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
