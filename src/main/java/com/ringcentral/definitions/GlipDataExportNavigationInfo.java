package com.ringcentral.definitions;


public class GlipDataExportNavigationInfo {
    /**
     *
     */
    public GlipDataExportNavigationInfoUri firstPage;
    /**
     *
     */
    public GlipDataExportNavigationInfoUri nextPage;
    /**
     *
     */
    public GlipDataExportNavigationInfoUri previousPage;
    /**
     *
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
