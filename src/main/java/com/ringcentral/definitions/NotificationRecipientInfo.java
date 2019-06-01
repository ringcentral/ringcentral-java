package com.ringcentral.definitions;


public class NotificationRecipientInfo {
    /**
     * Phone number in E.164 (with '+' sign) format
     */
    public String phoneNumber;
    /**
     * Extension number
     */
    public String extensionNumber;
    /**
     * 'True' specifies that message is sent exactly to this recipient. Returned in to field for group MMS. Useful if one extension has several phone numbers
     */
    public Boolean target;
    /**
     * Contains party location (city, state) if one can be determined from phoneNumber. This property is filled only when phoneNumber is not empty and server can calculate location information from it (for example, this information is unavailable for US toll-free numbers)
     */
    public String location;
    /**
     * Symbolic name associated with a caller/callee. If the phone does not belong to the known extension, only the location is returned, the name is not determined then
     */
    public String name;

    public NotificationRecipientInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public NotificationRecipientInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public NotificationRecipientInfo target(Boolean target) {
        this.target = target;
        return this;
    }

    public NotificationRecipientInfo location(String location) {
        this.location = location;
        return this;
    }

    public NotificationRecipientInfo name(String name) {
        this.name = name;
        return this;
    }

}
