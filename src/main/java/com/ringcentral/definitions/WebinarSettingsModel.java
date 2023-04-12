package com.ringcentral.definitions;


/**
 * Various settings which define behavior of this Webinar's Sessions
 */
public class WebinarSettingsModel {
    /**
     * Indicates if recording is enabled (if false all other recording settings cannot be enabled)
     * Default: true
     */
    public Boolean recordingEnabled;
    /**
     * Indicates if recording should start automatically when a Webinar goes live
     * Default: true
     */
    public Boolean autoRecord;
    /**
     * Indicates if recording can be shared
     * Default: true
     */
    public Boolean recordingSharingEnabled;
    /**
     * Indicates if recording can be downloaded
     * Default: true
     */
    public Boolean recordingDownloadEnabled;
    /**
     * DEPRECATED AND REPLACED BY &#039;pastSessionDeletionEnabled&#039; setting.
     * Indicates if recording can be deleted (this setting is read-only at webinar/session level)
     */
    public Boolean recordingDeletionEnabled;
    /**
     * Indicates if deletion of past session along with its artifacts is enabled for host.
     * This setting is read-only at webinar level
     */
    public Boolean pastSessionDeletionEnabled;
    /**
     * Indicates if Panelists should be places to waiting room after joining
     */
    public Boolean panelistWaitingRoom;
    /**
     * Indicates if Panelists&#039; video should be &#039;on&#039; by default
     * Default: true
     */
    public Boolean panelistVideoEnabled;
    /**
     * Indicates if Panelists&#039; screen sharing should be &#039;on&#039; by default
     * Default: true
     */
    public Boolean panelistScreenSharingEnabled;
    /**
     * Indicates if Panelists can mute/unmute themselves by default
     * Default: true
     */
    public Boolean panelistMuteControlEnabled;
    /**
     * Indicates if Panelists have to be authenticated users
     * Default: AuthenticatedCoworker
     * Enum: Guest, AuthenticatedUser, AuthenticatedCoworker
     */
    public String panelistAuthentication;
    /**
     * Indicates if attendees have to be authenticated users
     * Default: AuthenticatedCoworker
     * Enum: Guest, AuthenticatedUser, AuthenticatedCoworker
     */
    public String attendeeAuthentication;
    /**
     * Indicates who can access webinar artifacts. Applies to recordings at present.
     * Applicable to other artifacts such as Q&amp;A, Polls in the future.
     * Default: AuthenticatedUser
     * Enum: Guest, AuthenticatedUser, AuthenticatedCoworker
     */
    public String artifactsAccessAuthentication;
    /**
     * Indicates if dial-in PSTN audio option is enabled by default
     */
    public Boolean pstnEnabled;
    /**
     * Webinar password
     */
    public String password;
    /**
     * Indicates if Q&amp;A is enabled for the webinar (if false all other Q&amp;A settings cannot be enabled)
     * Default: true
     */
    public Boolean qnaEnabled;
    /**
     * Indicates if anonymous Q&amp;A is enabled for the webinar
     * Default: true
     */
    public Boolean qnaAnonymousEnabled;
    /**
     * Indicate if the moderated Q&amp;A enabled for webinar
     * Default: true
     */
    public Boolean moderatedQnaEnabled;
    /**
     * Indicates if polls are enabled for the webinar (if false all other polls settings cannot be enabled)
     * Default: true
     */
    public Boolean pollsEnabled;
    /**
     * Indicates if anonymous poll answers are enabled for the webinar
     * Default: true
     */
    public Boolean pollsAnonymousEnabled;
    /**
     * Indicates if a registration is enabled for the webinar (if false all other registration settings are ignored)
     */
    public Boolean registrationEnabled;
    /**
     * URI to redirect users after the webinar
     * Format: uri
     * Example: https://www.acme.com/thankyou
     */
    public String postWebinarRedirectUri;
    /**
     * Indicates if livestreaming to external streaming provider is enabled
     * Default: true
     */
    public Boolean externalLivestreamEnabled;

    public WebinarSettingsModel recordingEnabled(Boolean recordingEnabled) {
        this.recordingEnabled = recordingEnabled;
        return this;
    }

    public WebinarSettingsModel autoRecord(Boolean autoRecord) {
        this.autoRecord = autoRecord;
        return this;
    }

    public WebinarSettingsModel recordingSharingEnabled(Boolean recordingSharingEnabled) {
        this.recordingSharingEnabled = recordingSharingEnabled;
        return this;
    }

    public WebinarSettingsModel recordingDownloadEnabled(Boolean recordingDownloadEnabled) {
        this.recordingDownloadEnabled = recordingDownloadEnabled;
        return this;
    }

    public WebinarSettingsModel recordingDeletionEnabled(Boolean recordingDeletionEnabled) {
        this.recordingDeletionEnabled = recordingDeletionEnabled;
        return this;
    }

    public WebinarSettingsModel pastSessionDeletionEnabled(Boolean pastSessionDeletionEnabled) {
        this.pastSessionDeletionEnabled = pastSessionDeletionEnabled;
        return this;
    }

    public WebinarSettingsModel panelistWaitingRoom(Boolean panelistWaitingRoom) {
        this.panelistWaitingRoom = panelistWaitingRoom;
        return this;
    }

    public WebinarSettingsModel panelistVideoEnabled(Boolean panelistVideoEnabled) {
        this.panelistVideoEnabled = panelistVideoEnabled;
        return this;
    }

    public WebinarSettingsModel panelistScreenSharingEnabled(Boolean panelistScreenSharingEnabled) {
        this.panelistScreenSharingEnabled = panelistScreenSharingEnabled;
        return this;
    }

    public WebinarSettingsModel panelistMuteControlEnabled(Boolean panelistMuteControlEnabled) {
        this.panelistMuteControlEnabled = panelistMuteControlEnabled;
        return this;
    }

    public WebinarSettingsModel panelistAuthentication(String panelistAuthentication) {
        this.panelistAuthentication = panelistAuthentication;
        return this;
    }

    public WebinarSettingsModel attendeeAuthentication(String attendeeAuthentication) {
        this.attendeeAuthentication = attendeeAuthentication;
        return this;
    }

    public WebinarSettingsModel artifactsAccessAuthentication(String artifactsAccessAuthentication) {
        this.artifactsAccessAuthentication = artifactsAccessAuthentication;
        return this;
    }

    public WebinarSettingsModel pstnEnabled(Boolean pstnEnabled) {
        this.pstnEnabled = pstnEnabled;
        return this;
    }

    public WebinarSettingsModel password(String password) {
        this.password = password;
        return this;
    }

    public WebinarSettingsModel qnaEnabled(Boolean qnaEnabled) {
        this.qnaEnabled = qnaEnabled;
        return this;
    }

    public WebinarSettingsModel qnaAnonymousEnabled(Boolean qnaAnonymousEnabled) {
        this.qnaAnonymousEnabled = qnaAnonymousEnabled;
        return this;
    }

    public WebinarSettingsModel moderatedQnaEnabled(Boolean moderatedQnaEnabled) {
        this.moderatedQnaEnabled = moderatedQnaEnabled;
        return this;
    }

    public WebinarSettingsModel pollsEnabled(Boolean pollsEnabled) {
        this.pollsEnabled = pollsEnabled;
        return this;
    }

    public WebinarSettingsModel pollsAnonymousEnabled(Boolean pollsAnonymousEnabled) {
        this.pollsAnonymousEnabled = pollsAnonymousEnabled;
        return this;
    }

    public WebinarSettingsModel registrationEnabled(Boolean registrationEnabled) {
        this.registrationEnabled = registrationEnabled;
        return this;
    }

    public WebinarSettingsModel postWebinarRedirectUri(String postWebinarRedirectUri) {
        this.postWebinarRedirectUri = postWebinarRedirectUri;
        return this;
    }

    public WebinarSettingsModel externalLivestreamEnabled(Boolean externalLivestreamEnabled) {
        this.externalLivestreamEnabled = externalLivestreamEnabled;
        return this;
    }
}
