package com.ringcentral.definitions;


public class DiarizeInput {
    /**
     * Publicly facing uri
     * Format: uri
     */
    public String contentUri;
    /**
     * The encoding of the original audio
     * Required
     * Example: Mpeg
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
     * Example: Meeting
     * Enum: CallCenter, Meeting, EarningsCalls, Interview, PressConference, Voicemail
     */
    public String audioType;
    /**
     * Set to True if the input audio is multi-channel and each channel has a separate speaker.
     */
    public Boolean separateSpeakerPerChannel;
    /**
     * Number of speakers in the file, omit parameter if unknown
     * Format: int32
     * Example: 3
     */
    public Long speakerCount;
    /**
     * Optional set of speakers to be identified from the call.
     * Example: enrollmentId1,enrollmentId2
     */
    public String[] enrollmentIds;
    /**
     * Apply voice activity detection.
     */
    public Boolean enableVoiceActivityDetection;

    public DiarizeInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public DiarizeInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public DiarizeInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public DiarizeInput source(String source) {
        this.source = source;
        return this;
    }

    public DiarizeInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }

    public DiarizeInput separateSpeakerPerChannel(Boolean separateSpeakerPerChannel) {
        this.separateSpeakerPerChannel = separateSpeakerPerChannel;
        return this;
    }

    public DiarizeInput speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public DiarizeInput enrollmentIds(String[] enrollmentIds) {
        this.enrollmentIds = enrollmentIds;
        return this;
    }

    public DiarizeInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection) {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }
}
