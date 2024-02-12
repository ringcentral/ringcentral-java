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
    /**
     * Internal identifier of an extension created by partner. Supported for Partner Applications.
     * The RingCentral supports the mapping of accounts and stores the corresponding account ID/extension
     * ID for each partner ID of a client application. In request URIs partner IDs are accepted instead
     * of regular RingCentral native IDs as path parameters using `pid=XXX` clause.
     * Though in response URIs contain the corresponding account IDs and extension
     * IDs. In all request and response bodies these values are reflected via
     * partnerId attributes of account and extension
     */
    public String partnerId;

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

    public AccountOperatorInfo partnerId(String partnerId) {
        this.partnerId = partnerId;
        return this;
    }
}
