package com.ringcentral.definitions;

public class QueueInfoCallBack {
    /**
     * Additional announcements appended to the base callback confirmation. Empty array means no
     * additional announcements. Default: Enum: PositionInQueue, EstimatedWaitTime
     */
    public String[] confirmationAnnouncements;

    public QueueInfoCallBack confirmationAnnouncements(String[] confirmationAnnouncements) {
        this.confirmationAnnouncements = confirmationAnnouncements;
        return this;
    }
}
