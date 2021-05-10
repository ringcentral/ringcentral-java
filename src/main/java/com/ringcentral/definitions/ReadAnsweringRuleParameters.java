package com.ringcentral.definitions;


// Query parameters for operation readAnsweringRule
public class ReadAnsweringRuleParameters {
    /**
     * Indicates whether inactive numbers should be returned or not
     */
    public Boolean showInactiveNumbers;

    public ReadAnsweringRuleParameters showInactiveNumbers(Boolean showInactiveNumbers) {
        this.showInactiveNumbers = showInactiveNumbers;
        return this;
    }
}
