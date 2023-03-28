package com.ringcentral.definitions;


/**
 * Action target object (company/extension)
 */
public class AccountHistoryRecordTarget {
    /**
     * Extension identifier of the affected entity or &quot;0&quot; for Company level
     * Example: 404611540004
     */
    public String objectId;
    /**
     * Type of the entity.
     * Example: Extension
     * Enum: Extension, Account, Company, Template
     */
    public String objectType;
    /**
     * Target extension name
     * Example: Charlie Williams
     */
    public String name;
    /**
     * Target extension (short) number  of the affected entity (if the objectType is EXTENSION).
     * Example: 103
     */
    public String extensionNumber;
    /**
     * Target extension site identifier (if any)
     * Example: 871836004
     */
    public String siteId;

    public AccountHistoryRecordTarget objectId(String objectId) {
        this.objectId = objectId;
        return this;
    }

    public AccountHistoryRecordTarget objectType(String objectType) {
        this.objectType = objectType;
        return this;
    }

    public AccountHistoryRecordTarget name(String name) {
        this.name = name;
        return this;
    }

    public AccountHistoryRecordTarget extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public AccountHistoryRecordTarget siteId(String siteId) {
        this.siteId = siteId;
        return this;
    }
}
