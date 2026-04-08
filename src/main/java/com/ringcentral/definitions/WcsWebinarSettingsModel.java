package com.ringcentral.definitions;

/** Various settings which define behavior of this Webinar's Sessions */
public class WcsWebinarSettingsModel {
    /**
     * Indicates if recording is enabled (if false all other recording settings cannot be enabled)
     * Default: true
     */
    public Boolean recordingEnabled;

    public WcsWebinarSettingsModel recordingEnabled(Boolean recordingEnabled) {
        this.recordingEnabled = recordingEnabled;
        return this;
    }

    /** Indicates if recording should start automatically when a Webinar goes live */
    public Boolean autoRecord;

    public WcsWebinarSettingsModel autoRecord(Boolean autoRecord) {
        this.autoRecord = autoRecord;
        return this;
    }

    /**
     * Indicates if recording can be shared (this setting is read-only at webinar level) Default:
     * true
     */
    public Boolean recordingSharingEnabled;

    public WcsWebinarSettingsModel recordingSharingEnabled(Boolean recordingSharingEnabled) {
        this.recordingSharingEnabled = recordingSharingEnabled;
        return this;
    }

    /**
     * Indicates if recording can be downloaded (this setting is read-only at webinar level)
     * Default: true
     */
    public Boolean recordingDownloadEnabled;

    public WcsWebinarSettingsModel recordingDownloadEnabled(Boolean recordingDownloadEnabled) {
        this.recordingDownloadEnabled = recordingDownloadEnabled;
        return this;
    }

    /**
     * DEPRECATED AND REPLACED BY &#039;pastSessionDeletionEnabled&#039; setting. Indicates if
     * recording can be deleted (this setting is read-only at webinar level)
     */
    public Boolean recordingDeletionEnabled;

    public WcsWebinarSettingsModel recordingDeletionEnabled(Boolean recordingDeletionEnabled) {
        this.recordingDeletionEnabled = recordingDeletionEnabled;
        return this;
    }

    /**
     * Indicates if deletion of past session along with its artifacts is enabled for Host. This
     * setting is read-only at webinar level
     */
    public Boolean pastSessionDeletionEnabled;

    public WcsWebinarSettingsModel pastSessionDeletionEnabled(Boolean pastSessionDeletionEnabled) {
        this.pastSessionDeletionEnabled = pastSessionDeletionEnabled;
        return this;
    }

    /** Indicates if Panelists should be places to waiting room after joining */
    public Boolean panelistWaitingRoom;

    public WcsWebinarSettingsModel panelistWaitingRoom(Boolean panelistWaitingRoom) {
        this.panelistWaitingRoom = panelistWaitingRoom;
        return this;
    }

    /** Indicates if Panelists&#039; video should be &#039;on&#039; by default Default: true */
    public Boolean panelistVideoEnabled;

    public WcsWebinarSettingsModel panelistVideoEnabled(Boolean panelistVideoEnabled) {
        this.panelistVideoEnabled = panelistVideoEnabled;
        return this;
    }

    /**
     * Indicates if Panelists&#039; screen sharing should be &#039;on&#039; by default Default: true
     */
    public Boolean panelistScreenSharingEnabled;

    public WcsWebinarSettingsModel panelistScreenSharingEnabled(
            Boolean panelistScreenSharingEnabled) {
        this.panelistScreenSharingEnabled = panelistScreenSharingEnabled;
        return this;
    }

    /** Indicates if Panelists can mute/unmute themselves by default Default: true */
    public Boolean panelistMuteControlEnabled;

    public WcsWebinarSettingsModel panelistMuteControlEnabled(Boolean panelistMuteControlEnabled) {
        this.panelistMuteControlEnabled = panelistMuteControlEnabled;
        return this;
    }

    /**
     * Indicates if Panelists have to be authenticated users Default: Guest Enum: Guest,
     * AuthenticatedUser, AuthenticatedCoworker
     */
    public String panelistAuthentication;

    public WcsWebinarSettingsModel panelistAuthentication(String panelistAuthentication) {
        this.panelistAuthentication = panelistAuthentication;
        return this;
    }

    /**
     * Indicates if attendees have to be authenticated users Default: Guest Enum: Guest,
     * AuthenticatedUser, AuthenticatedCoworker
     */
    public String attendeeAuthentication;

    public WcsWebinarSettingsModel attendeeAuthentication(String attendeeAuthentication) {
        this.attendeeAuthentication = attendeeAuthentication;
        return this;
    }

    /**
     * Indicates who can access webinar artifacts. Applies to recordings at present. Applicable to
     * other artifacts such as Q&amp;A, Polls in the future. Default: AuthenticatedUser Enum: Guest,
     * AuthenticatedUser, AuthenticatedCoworker
     */
    public String artifactsAccessAuthentication;

    public WcsWebinarSettingsModel artifactsAccessAuthentication(
            String artifactsAccessAuthentication) {
        this.artifactsAccessAuthentication = artifactsAccessAuthentication;
        return this;
    }

    /** Indicates if dial-in PSTN audio option is enabled for Panelists */
    public Boolean pstnEnabled;

    public WcsWebinarSettingsModel pstnEnabled(Boolean pstnEnabled) {
        this.pstnEnabled = pstnEnabled;
        return this;
    }

    /**
     * Webinar password. If company-level &quot;passwordEnabled&quot; is true and
     * &quot;password&quot; is null / omitted, the backend generates the password
     */
    public String password;

    public WcsWebinarSettingsModel password(String password) {
        this.password = password;
        return this;
    }

    /**
     * Indicates if Q&amp;A is enabled for the webinar (if false all other Q&amp;A settings cannot
     * be enabled) Default: true
     */
    public Boolean qnaEnabled;

    public WcsWebinarSettingsModel qnaEnabled(Boolean qnaEnabled) {
        this.qnaEnabled = qnaEnabled;
        return this;
    }

    /** Indicates if anonymous Q&amp;A is enabled for the webinar Default: true */
    public Boolean qnaAnonymousEnabled;

    public WcsWebinarSettingsModel qnaAnonymousEnabled(Boolean qnaAnonymousEnabled) {
        this.qnaAnonymousEnabled = qnaAnonymousEnabled;
        return this;
    }

    /**
     * Indicates if polls are enabled for the webinar (if false all other polls settings cannot be
     * enabled) Default: true
     */
    public Boolean pollsEnabled;

    public WcsWebinarSettingsModel pollsEnabled(Boolean pollsEnabled) {
        this.pollsEnabled = pollsEnabled;
        return this;
    }

    /** Indicates if anonymous poll answers are enabled for the webinar Default: true */
    public Boolean pollsAnonymousEnabled;

    public WcsWebinarSettingsModel pollsAnonymousEnabled(Boolean pollsAnonymousEnabled) {
        this.pollsAnonymousEnabled = pollsAnonymousEnabled;
        return this;
    }

    /**
     * Indicates if a registration is enabled for the webinar (if false all other registration
     * settings are ignored)
     */
    public Boolean registrationEnabled;

    public WcsWebinarSettingsModel registrationEnabled(Boolean registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
        return this;
    }

    /**
     * URI to redirect users after the webinar Format: uri Example: https://www.acme.com/thankyou
     */
    public String postWebinarRedirectUri;

    public WcsWebinarSettingsModel postWebinarRedirectUri(String postWebinarRedirectUri) {
        this.postWebinarRedirectUri = postWebinarRedirectUri;
        return this;
    }

    /** Indicates if livestreaming to external streaming provider is enabled Default: true */
    public Boolean externalLivestreamEnabled;

    public WcsWebinarSettingsModel externalLivestreamEnabled(Boolean externalLivestreamEnabled) {
        this.externalLivestreamEnabled = externalLivestreamEnabled;
        return this;
    }

    /** Indicate if the moderated Q&amp;A enabled for webinar */
    public Boolean moderatedQnaEnabled;

    public WcsWebinarSettingsModel moderatedQnaEnabled(Boolean moderatedQnaEnabled) {
        this.moderatedQnaEnabled = moderatedQnaEnabled;
        return this;
    }
}
