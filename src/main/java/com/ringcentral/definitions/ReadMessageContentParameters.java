package com.ringcentral.definitions;


    /**
* Query parameters for operation readMessageContent
*/
public class ReadMessageContentParameters
{
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved locally
     * Enum: Inline, Attachment
     */
    public String contentDisposition;
    public ReadMessageContentParameters contentDisposition(String contentDisposition)
    {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * The default filename of the file to be downloaded
     */
    public String contentDispositionFilename;
    public ReadMessageContentParameters contentDispositionFilename(String contentDispositionFilename)
    {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}