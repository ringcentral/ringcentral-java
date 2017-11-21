package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PronouncedNameInfo
{
    // Voice name typeDefault - default extension name; first name and last name specified in user profileTextToSpeech - custom text; user name spelled the way it sounds and specified by userRecorded - custom audio; user name recorded in user's own voice (supported only for extension retrieval) = ['Default', 'TextToSpeech', 'Recorded']
    public String type;
    public PronouncedNameInfo type(String type) {
        this.type = type;
        return this;
    }
    // Custom text
    public String text;
    public PronouncedNameInfo text(String text) {
        this.text = text;
        return this;
    }
}
