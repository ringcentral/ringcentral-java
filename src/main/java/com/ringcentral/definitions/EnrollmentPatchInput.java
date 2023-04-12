package com.ringcentral.definitions;


public class EnrollmentPatchInput {
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

    public EnrollmentPatchInput encoding(String encoding) {
        this.encoding = encoding;
        return this;
    }

    public EnrollmentPatchInput languageCode(String languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    public EnrollmentPatchInput content(String content) {
        this.content = content;
        return this;
    }
}
