package com.ringcentral.definitions;


public class SessionLivestreamListModel {
    /**
     * The list of livestreams configured for the session
     */
    public SessionLivestreamMinimalModel[] livestreams;

    public SessionLivestreamListModel livestreams(SessionLivestreamMinimalModel[] livestreams) {
        this.livestreams = livestreams;
        return this;
    }
}
