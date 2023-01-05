package com.ringcentral.definitions;


    /**
* Transfer settings applied for department (call queue) extension
* type, returned if CallHandlingAction is set to `TransferToExtension`
* 
*/
public class TransferredExtensionInfo
{
    /**
     */
    public CallHandlingExtensionInfo extension;
    public TransferredExtensionInfo extension(CallHandlingExtensionInfo extension)
    {
        this.extension = extension;
        return this;
    }
}