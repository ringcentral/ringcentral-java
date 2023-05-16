package com.ringcentral.definitions;


public class AudioInput {
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

    public AudioInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    public AudioInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public AudioInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public AudioInput source(String source) {
        this.source = source;
        return this;
    }

    public AudioInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }
}
