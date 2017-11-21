package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Throwable
{
    //
    public Throwable cause;
    public Throwable cause(Throwable cause) {
        this.cause = cause;
        return this;
    }
    //
    public StackTraceElement[] stackTrace;
    public Throwable stackTrace(StackTraceElement[] stackTrace) {
        this.stackTrace = stackTrace;
        return this;
    }
    //
    public String localizedMessage;
    public Throwable localizedMessage(String localizedMessage) {
        this.localizedMessage = localizedMessage;
        return this;
    }
    //
    public String message;
    public Throwable message(String message) {
        this.message = message;
        return this;
    }
    //
    public Throwable[] suppressed;
    public Throwable suppressed(Throwable[] suppressed) {
        this.suppressed = suppressed;
        return this;
    }
}
