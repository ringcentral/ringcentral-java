package com.ringcentral.definitions;


    /**
* Event initiator info
*/
public class AccountHistoryRecordPublicInitiator
{
    /**
     * Current user extension identifier
     * Example: 402539300008
     */
    public String extensionId;
    public AccountHistoryRecordPublicInitiator extensionId(String extensionId)
    {
        this.extensionId = extensionId;
        return this;
    }

    /**
     * Current user extension (short) number
     * Example: 101
     */
    public String extensionNumber;
    public AccountHistoryRecordPublicInitiator extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Current user full name
     * Example: Alice Smith
     */
    public String name;
    public AccountHistoryRecordPublicInitiator name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Current user role
     * Example: Super Admin
     */
    public String role;
    public AccountHistoryRecordPublicInitiator role(String role)
    {
        this.role = role;
        return this;
    }
}