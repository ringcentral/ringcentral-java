package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TransferredExtensionInfo
{
    //
    public ExtensionInfo extension;
    public TransferredExtensionInfo extension(ExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
