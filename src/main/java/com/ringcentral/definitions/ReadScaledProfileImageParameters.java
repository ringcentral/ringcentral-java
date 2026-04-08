package com.ringcentral.definitions;


    /**
* Query parameters for operation readScaledProfileImage
*/
public class ReadScaledProfileImageParameters
{
    /**
     * Whether the content is expected to be displayed in the browser, or downloaded and saved locally
     * Enum: Inline, Attachment
     */
    public String contentDisposition;
    public ReadScaledProfileImageParameters contentDisposition(String contentDisposition)
    {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * The default filename of the file to be downloaded
     */
    public String contentDispositionFilename;
    public ReadScaledProfileImageParameters contentDispositionFilename(String contentDispositionFilename)
    {
        this.contentDispositionFilename = contentDispositionFilename;
        return this;
    }
}