package com.ringcentral.definitions;


public class DiarizeInput
{
    /**
     * Publicly facing uri
     * Format: uri
     */
    public String contentUri;
    public DiarizeInput contentUri(String contentUri)
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
    public DiarizeInput encoding(String encoding)
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
    public DiarizeInput languageCode(String languageCode)
    {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Source of the audio file eg: Phone, RingCentral, GoogleMeet, Zoom etc
     * Example: RingCentral
     */
    public String source;
    public DiarizeInput source(String source)
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
    public DiarizeInput audioType(String audioType)
    {
        this.audioType = audioType;
        return this;
    }

    /**
     * Set to True if the input audio is multi-channel and each channel has a separate speaker.
     */
    public Boolean separateSpeakerPerChannel;
    public DiarizeInput separateSpeakerPerChannel(Boolean separateSpeakerPerChannel)
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
    public DiarizeInput speakerCount(Long speakerCount)
    {
        this.speakerCount = speakerCount;
        return this;
    }

    /**
     * Apply voice activity detection.
     */
    public Boolean enableVoiceActivityDetection;
    public DiarizeInput enableVoiceActivityDetection(Boolean enableVoiceActivityDetection)
    {
        this.enableVoiceActivityDetection = enableVoiceActivityDetection;
        return this;
    }
}