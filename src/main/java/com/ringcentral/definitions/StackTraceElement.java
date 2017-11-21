package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class StackTraceElement
{
    //
    public String methodName;
    public StackTraceElement methodName(String methodName) {
        this.methodName = methodName;
        return this;
    }
    //
    public String fileName;
    public StackTraceElement fileName(String fileName) {
        this.fileName = fileName;
        return this;
    }
    //
    public Long lineNumber;
    public StackTraceElement lineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
        return this;
    }
    //
    public String className;
    public StackTraceElement className(String className) {
        this.className = className;
        return this;
    }
    //
    public Boolean nativeMethod;
    public StackTraceElement nativeMethod(Boolean nativeMethod) {
        this.nativeMethod = nativeMethod;
        return this;
    }
}
