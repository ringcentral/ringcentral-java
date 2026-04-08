package com.ringcentral.definitions;

/** Query parameters for operation readAnsweringRule */
public class ReadAnsweringRuleParameters {
    /** Indicates whether inactive numbers should be returned or not */
    public Boolean showInactiveNumbers;

    public ReadAnsweringRuleParameters showInactiveNumbers(Boolean showInactiveNumbers) {
        this.showInactiveNumbers = showInactiveNumbers;
        return this;
    }

    /** If true, internal identifiers are returned in the response */
    public Boolean internalIds;

    public ReadAnsweringRuleParameters internalIds(Boolean internalIds) {
        this.internalIds = internalIds;
        return this;
    }
}
