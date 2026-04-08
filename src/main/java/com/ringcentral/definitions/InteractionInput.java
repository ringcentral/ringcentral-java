package com.ringcentral.definitions;


public class InteractionInput
{
    /**
     * Publicly facing uri
     * Format: uri
     */
    public String contentUri;
    public InteractionInput contentUri(String contentUri)
    {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * The encoding of the original audio
     * Required
     * Example: Wav
     * Enum: Mpeg, Mp4, Wav, Webm, Webp, Aac, Avi, Ogg
     */
    public String encoding;
    public InteractionInput encoding(String encoding)
    {
        this.encoding = encoding;
        return this;
    }

    /**
     * Language spoken in the audio file.
     * Required
     * Example: en-US
     */
    public String languageCode;
    public InteractionInput languageCode(String languageCode)
    {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Source of the audio file eg: Phone, RingCentral, GoogleMeet, Zoom etc
     * Example: RingCentral
     */
    public String source;
    public InteractionInput source(String source)
    {
        this.source = source;
        return this;
    }

    /**
     * Type of the audio
     * Example: CallCenter
     * Enum: CallCenter, Meeting, EarningsCalls, Interview, PressConference, Voicemail
     */
    public String audioType;
    public InteractionInput audioType(String audioType)
    {
        this.audioType = audioType;
        return this;
    }

    /**
     * Set to True if the input audio is multi-channel and each channel has a separate speaker.
     */
    public Boolean separateSpeakerPerChannel;
    public InteractionInput separateSpeakerPerChannel(Boolean separateSpeakerPerChannel)
    {
        this.separateSpeakerPerChannel = separateSpeakerPerChannel;
        return this;
    }

    /**
     * Number of speakers in the file, omit parameter if unknown
     * Format: int32
     * Example: 2
     */
    public Long speakerCount;
    public InteractionInput speakerCount(Long speakerCount)
    {
        this.speakerCount = speakerCount;
        return this;
    }

    /**
     * Apply voice activity detection.
     */
    public Boolean enableVoiceActivityDetection;
    public InteractionInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection)
    {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }

    /**
     * Enum: All, KeyPhrases, AbstractiveSummaryLong, AbstractiveSummaryShort, ExtractiveSummary, Topics, TalkToListenRatio, Pace, QuestionsAsked
     */
    public String[] insights;
    public InteractionInput insights(String[] insights)
    {
        this.insights = insights;
        return this;
    }

    /**
     * Indicates the words/phrases that will be used for boosting the transcript. This can help to boost accuracy for cases like Person Names, Company names etc.
     */
    public SpeechContextPhrasesInput[] speechContexts;
    public InteractionInput speechContexts(SpeechContextPhrasesInput[] speechContexts)
    {
        this.speechContexts = speechContexts;
        return this;
    }
}