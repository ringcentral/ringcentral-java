package com.ringcentral.definitions;


public class IdentifyInput {
    /**
     * Publicly facing uri
     * Format: uri
     */
    public String contentUri;
    /**
     * The encoding of the original audio
     * Required
     * Example: Wav
     * Enum: Mpeg, Mp4, Wav, Webm, Webp, Aac, Avi, Ogg
     */
    public String encoding;
    /**
     * Language spoken in the audio file.
     * Required
     * Example: en-US
     */
    public String languageCode;
    /**
     * Source of the audio file eg: Phone, RingCentral, GoogleMeet, Zoom etc
     * Example: RingCentral
     */
    public String source;
    /**
     * Type of the audio
     * Example: CallCenter
     * Enum: CallCenter, Meeting, EarningsCalls, Interview, PressConference, Voicemail
     */
    public String audioType;
    /**
     * Set of enrolled speakers to be identified from the media.
     * Required
     * Example: enrollmentId1,enrollmentId2
     */
    public String[] enrollmentIds;
    /**
     * Apply voice activity detection.
     */
    public Boolean enableVoiceActivityDetection;

    public IdentifyInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public IdentifyInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public IdentifyInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public IdentifyInput source(String source) {
        this.source = source;
        return this;
    }

    public IdentifyInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }

    public IdentifyInput enrollmentIds(String[] enrollmentIds) {
        this.enrollmentIds = enrollmentIds;
        return this;
    }

    public IdentifyInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection) {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }
}
