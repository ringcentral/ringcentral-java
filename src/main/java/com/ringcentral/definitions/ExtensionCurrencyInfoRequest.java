package com.ringcentral.definitions;


public class ExtensionCurrencyInfoRequest {
    /**
     * Internal Identifier of a currency
     */
    public String id;

    public ExtensionCurrencyInfoRequest id(String id) {
        this.id = id;
        return this;
    }
}
