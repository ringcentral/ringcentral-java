package com.ringcentral.definitions;


// Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
public class TransferredExtensionInfo {
    /**
     *
     */
    public CallHandlingExtensionInfo extension;

    public TransferredExtensionInfo extension(CallHandlingExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
