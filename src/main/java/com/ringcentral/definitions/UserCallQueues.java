package com.ringcentral.definitions;


public class UserCallQueues {
    /**
     * List of the queues where the extension is an agent
     */
    public QueueShortInfoResource[] records;

    public UserCallQueues records(QueueShortInfoResource[] records) {
        this.records = records;
        return this;
    }

}
