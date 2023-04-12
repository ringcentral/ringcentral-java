package com.ringcentral.definitions;


/**
 * Base schema for call log parties and history call log parties
 */
public class BaseCallLogParty {
    /**
     * Phone number of a party. Usually it is a plain number including country and area code like 18661234567. But sometimes it could be returned from database with some formatting applied, for example (866)123-4567. This property is filled in all cases where parties communicate by means of global phone numbers, for example when calling to direct numbers or sending/receiving SMS
     */
    public String phoneNumber;
    /**
     * Extension short number (usually 3 or 4 digits). This property is filled when parties communicate by means of short internal numbers, for example when calling to other extension or sending/receiving Company Pager message
     */
    public String extensionNumber;
    /**
     * Internal identifier of an extension
     */
    public String extensionId;
    /**
     * Symbolic name associated with a party. If the phone does not belong to the known extension, only the location is returned, the name is not determined then
     */
    public String name;

    public BaseCallLogParty phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public BaseCallLogParty extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public BaseCallLogParty extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public BaseCallLogParty name(String name) {
        this.name = name;
        return this;
    }
}
