package com.ringcentral.definitions;


// Returns data on call recording custom greetings.
public class CallRecordingCustomGreetings {
    /**
     *
     */
    public CallRecordingCustomGreeting[] records;

    public CallRecordingCustomGreetings records(CallRecordingCustomGreeting[] records) {
        this.records = records;
        return this;
    }

}
