package com.ringcentral.definitions;


/**
 * Request body for operation createFaxMessage
 */
public class CreateFaxMessageRequest {
    /**
     * Fax only. Resolution of a fax message. &#039;High&#039; for black and
     * white image scanned at 200 dpi, &#039;Low&#039; for black and white image scanned
     * at 100 dpi
     * Enum: High, Low
     */
    public String faxResolution;
    /**
     * Recipient&#039;s phone number
     * Required
     */
    public FaxReceiver[] to;
    /**
     * Timestamp to send a fax at. If not specified, current or the past
     * a fax message is sent immediately
     * Format: date-time
     */
    public String sendTime;
    /**
     * ISO Code. e.g UK
     */
    public String isoCode;
    /**
     * Cover page identifier. If `coverIndex` is set to &#039;0&#039; (zero) a cover page
     * is not attached. For a list of available cover page identifiers (1-13)
     * please call the Fax Cover Pages method. If not specified, the default cover
     * page is attached (which is configured in &#039;Outbound Fax Settings&#039;)
     * Format: int32
     */
    public Long coverIndex;
    /**
     * Cover page text, entered by a fax sender and printed
     * on a cover page. Maximum length is limited to 1024 symbols
     */
    public String coverPageText;
    /**
     * Required
     */
    public Attachment[] attachments;

    public CreateFaxMessageRequest faxResolution(String faxResolution) {
        this.faxResolution = faxResolution;
        return this;
    }

    public CreateFaxMessageRequest to(FaxReceiver[] to) {
        this.to = to;
        return this;
    }

    public CreateFaxMessageRequest sendTime(String sendTime) {
        this.sendTime = sendTime;
        return this;
    }

    public CreateFaxMessageRequest isoCode(String isoCode) {
        this.isoCode = isoCode;
        return this;
    }

    public CreateFaxMessageRequest coverIndex(Long coverIndex) {
        this.coverIndex = coverIndex;
        return this;
    }

    public CreateFaxMessageRequest coverPageText(String coverPageText) {
        this.coverPageText = coverPageText;
        return this;
    }

    public CreateFaxMessageRequest attachments(Attachment[] attachments) {
        this.attachments = attachments;
        return this;
    }
}
