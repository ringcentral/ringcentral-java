package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ExtensionAssignmentResult
{
    //
    public Boolean successful;
    public ExtensionAssignmentResult successful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    //
    public ExtensionResource extension;
    public ExtensionAssignmentResult extension(ExtensionResource extension) {
        this.extension = extension;
        return this;
    }
    //
    public ErrorEntity error;
    public ExtensionAssignmentResult error(ErrorEntity error) {
        this.error = error;
        return this;
    }
}
