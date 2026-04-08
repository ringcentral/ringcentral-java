package com.ringcentral.definitions;


public class GlipDataExportNavigationInfoUri
{
    /**
     * Canonical URI for the corresponding page of the list
     * Format: uri
     */
    public String uri;
    public GlipDataExportNavigationInfoUri uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}