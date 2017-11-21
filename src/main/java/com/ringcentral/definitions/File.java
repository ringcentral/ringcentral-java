package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class File
{
    //
    public String sourceFile;
    public File sourceFile(String sourceFile) {
        this.sourceFile = sourceFile;
        return this;
    }
    //
    public String originalFileName;
    public File originalFileName(String originalFileName) {
        this.originalFileName = originalFileName;
        return this;
    }
}
