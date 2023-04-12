package com.ringcentral.definitions;


public class AsrInput {
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
     * Indicates that the input audio is multi-channel and each channel has a separate speaker.
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
    /**
     * Enables Smart Punctuation API.
     */
    public Boolean enablePunctuation;
    /**
     * Tags each word corresponding to the speaker.
     */
    public Boolean enableSpeakerDiarization;
    /**
     * Indicates the words/phrases that will be used for boosting the transcript. This can help to boost accuracy for cases like Person Names, Company names etc.
     */
    public SpeechContextPhrasesInput[] speechContexts;

    public AsrInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public AsrInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public AsrInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public AsrInput source(String source) {
        this.source = source;
        return this;
    }

    public AsrInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }

    public AsrInput separateSpeakerPerChannel(Boolean separateSpeakerPerChannel) {
        this.separateSpeakerPerChannel = separateSpeakerPerChannel;
        return this;
    }

    public AsrInput speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    public AsrInput enrollmentIds(String[] enrollmentIds) {
        this.enrollmentIds = enrollmentIds;
        return this;
    }

    public AsrInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection) {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }

    public AsrInput enablePunctuation(Boolean enablePunctuation) {
        this.enablePunctuation = enablePunctuation;
        return this;
    }

    public AsrInput enableSpeakerDiarization(Boolean enableSpeakerDiarization) {
        this.enableSpeakerDiarization = enableSpeakerDiarization;
        return this;
    }

    public AsrInput speechContexts(SpeechContextPhrasesInput[] speechContexts) {
        this.speechContexts = speechContexts;
        return this;
    }
}
