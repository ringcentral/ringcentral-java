package com.ringcentral.definitions;

public class AudioInput {
    /** Publicly facing uri Format: uri */
    public String contentUri;

    public AudioInput contentUri(String contentUri) {
        this.contentUri = contentUri;
        return this;
    }

    /**
     * The encoding of the original audio Required Example: Wav Enum: Mpeg, Mp4, Wav, Webm, Webp,
     * Aac, Avi, Ogg
     */
    public String encoding;

    public AudioInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    /** Language spoken in the audio file. Required Example: en-US */
    public String languageCode;

    public AudioInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * Source of the audio file eg: Phone, RingCentral, GoogleMeet, Zoom etc Example: RingCentral
     */
    public String source;

    public AudioInput source(String source) {
        this.source = source;
        return this;
    }

    /**
     * Type of the audio Example: CallCenter Enum: CallCenter, Meeting, EarningsCalls, Interview,
     * PressConference, Voicemail
     */
    public String audioType;

    public AudioInput audioType(String audioType) {
        this.audioType = audioType;
        return this;
    }
}
