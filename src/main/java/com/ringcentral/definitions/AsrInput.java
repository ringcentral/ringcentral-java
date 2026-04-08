package com.ringcentral.definitions;

public class AsrInput {
    /** Publicly facing uri Format: uri */
    public String contentUri;

    public AsrInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * The encoding of the original audio Required Example: Wav Enum: Mpeg, Mp4, Wav, Webm, Webp,
     * Aac, Avi, Ogg
     */
    public String encoding;

    public AsrInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /** Language spoken in the audio file. Required Example: en-US */
    public String languageCode;

    public AsrInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Source of the audio file eg: Phone, RingCentral, GoogleMeet, Zoom etc Example: RingCentral
     */
    public String source;

    public AsrInput source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Type of the audio Example: CallCenter Enum: CallCenter, Meeting, EarningsCalls, Interview,
     * PressConference, Voicemail
     */
    public String audioType;

    public AsrInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }

    /** Indicates that the input audio is multi-channel and each channel has a separate speaker. */
    public Boolean separateSpeakerPerChannel;

    public AsrInput separateSpeakerPerChannel(Boolean separateSpeakerPerChannel) {
        this.separateSpeakerPerChannel = separateSpeakerPerChannel;
        return this;
    }

    /** Number of speakers in the file, omit parameter if unknown Format: int32 Example: 2 */
    public Long speakerCount;

    public AsrInput speakerCount(Long speakerCount) {
        this.speakerCount = speakerCount;
        return this;
    }

    /** Apply voice activity detection. */
    public Boolean enableVoiceActivityDetection;

    public AsrInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection) {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }

    /** Enables Smart Punctuation API. */
    public Boolean enablePunctuation;

    public AsrInput enablePunctuation(Boolean enablePunctuation) {
        this.enablePunctuation = enablePunctuation;
        return this;
    }

    /** Tags each word corresponding to the speaker. */
    public Boolean enableSpeakerDiarization;

    public AsrInput enableSpeakerDiarization(Boolean enableSpeakerDiarization) {
        this.enableSpeakerDiarization = enableSpeakerDiarization;
        return this;
    }

    /**
     * Indicates the words/phrases that will be used for boosting the transcript. This can help to
     * boost accuracy for cases like Person Names, Company names etc.
     */
    public SpeechContextPhrasesInput[] speechContexts;

    public AsrInput speechContexts(SpeechContextPhrasesInput[] speechContexts) {
        this.speechContexts = speechContexts;
        return this;
    }
}
