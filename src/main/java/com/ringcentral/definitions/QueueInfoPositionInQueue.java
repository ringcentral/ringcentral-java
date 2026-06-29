package com.ringcentral.definitions;

public class QueueInfoPositionInQueue {
    /**
     * Controls when position-in-queue announcement is played. `OnPositionChange` - only if the
     * caller&#039;s position changed since the last announcement. Default: EveryInterval Enum:
     * EveryInterval, OnPositionChange
     */
    public String playbackFrequency;

    public QueueInfoPositionInQueue playbackFrequency(String playbackFrequency) {
        this.playbackFrequency = playbackFrequency;
        return this;
    }
}
