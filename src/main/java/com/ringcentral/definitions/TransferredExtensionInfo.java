package com.ringcentral.definitions;


    // Transfer settings applied for department (call queue) extension type, with 'TransferToExtension' call handling action
public class TransferredExtensionInfo
{
    /**
         */
        public ExtensionInfo extension;
  public TransferredExtensionInfo extension(ExtensionInfo extension)
  {
    this.extension = extension;
    return this;
  }
  
}
