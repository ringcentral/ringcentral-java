package com.ringcentral.definitions;


public class EnrollmentInput {
    /**
     * The encoding of the original audio
     * Required
     * Example: Mpeg
     * Enum: Mpeg, Mp4, Wav, Webm, Webp, Aac, Avi, Ogg
     */
    public String encoding;
    /**
     * Language spoken in the audio file.
     * Example: en-US
     */
    public String languageCode;
    /**
     * Base64-encoded audio file data.
     * Required
     * Example: base64EncodedAudioInput
     */
    public String content;
    /**
     * The enrollment ID to be registered. Acceptable format [a-zA-Z0-9_]+
     * Required
     * Example: JohnDoe
     */
    public String enrollmentId;

    public EnrollmentInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public EnrollmentInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public EnrollmentInput content(String content) {
        this.content = content;
        return this;
    }

    public EnrollmentInput enrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
        return this;
    }
}
