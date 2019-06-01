package com.ringcentral.definitions;


public class MessageSenderInfo {
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

    public MessageSenderInfo extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public MessageSenderInfo extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    public MessageSenderInfo name(String name) {
        this.name = name;
        return this;
    }

}
