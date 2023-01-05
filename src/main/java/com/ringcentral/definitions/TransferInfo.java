package com.ringcentral.definitions;


public class TransferInfo
{
    /**
     */
    public TransferExtensionInfo extension;
    public TransferInfo extension(TransferExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }

    /**
     * Event that initiates transferring to the specified extension
     * Enum: HoldTimeExpiration, MaxCallers, NoAnswer
     */
    public String action;
    public TransferInfo action(String action)
    {
        this.action = action;
        return this;
    }
}