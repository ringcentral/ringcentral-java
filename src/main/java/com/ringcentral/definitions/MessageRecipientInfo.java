package com.ringcentral.definitions;


public class MessageRecipientInfo {
    /**
     *
     */
    public String extensionNumber;
    /**
     *
     */
    public String extensionId;
    /**
     *
     */
    public String name;

    public MessageRecipientInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public MessageRecipientInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MessageRecipientInfo name(String name) {
        this.name = name;
        return this;
    }

}
