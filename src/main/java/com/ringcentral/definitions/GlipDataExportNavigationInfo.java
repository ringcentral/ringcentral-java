package com.ringcentral.definitions;


public class GlipDataExportNavigationInfo {
    /**
     * Canonical URI for the first page of the list
     */
    public GlipDataExportNavigationInfoUri firstPage;
    /**
     * Canonical URI for the next page of the list
     */
    public GlipDataExportNavigationInfoUri nextPage;
    /**
     * Canonical URI for the previous page of the list
     */
    public GlipDataExportNavigationInfoUri previousPage;
    /**
     * Canonical URI for the last page of the list
     */
    public GlipDataExportNavigationInfoUri lastPage;

    public GlipDataExportNavigationInfo firstPage(GlipDataExportNavigationInfoUri firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public GlipDataExportNavigationInfo nextPage(GlipDataExportNavigationInfoUri nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public GlipDataExportNavigationInfo previousPage(GlipDataExportNavigationInfoUri previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public GlipDataExportNavigationInfo lastPage(GlipDataExportNavigationInfoUri lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
