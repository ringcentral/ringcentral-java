package com.ringcentral.definitions;


public class EnrollmentStatus {
    /**
     * Quality of the enrollment.
     * Example: Average
     * Enum: Poor, Average, Good, High
     */
    public String enrollmentQuality;
    /**
     * Status of the enrollment.
     * Required
     * Example: true
     */
    public Boolean enrollmentComplete;
    /**
     * Required
     * Example: JohnDoe
     */
    public String speakerId;
    /**
     * Total speech duration of the enrollment in seconds.
     * Format: float
     * Example: 20.1
     */
    public Double totalEnrollDuration;
    /**
     * Total duration of the enrollment in seconds.
     * Required
     * Format: float
     * Example: 30.5
     */
    public Double totalSpeechDuration;

    public EnrollmentStatus enrollmentQuality(String enrollmentQuality) {
        this.enrollmentQuality = enrollmentQuality;
        return this;
    }

    public EnrollmentStatus enrollmentComplete(Boolean enrollmentComplete) {
        this.enrollmentComplete = enrollmentComplete;
        return this;
    }

    public EnrollmentStatus speakerId(String speakerId) {
        this.speakerId = speakerId;
        return this;
    }

    public EnrollmentStatus totalEnrollDuration(Double totalEnrollDuration) {
        this.totalEnrollDuration = totalEnrollDuration;
        return this;
    }

    public EnrollmentStatus totalSpeechDuration(Double totalSpeechDuration) {
        this.totalSpeechDuration = totalSpeechDuration;
        return this;
    }
}
