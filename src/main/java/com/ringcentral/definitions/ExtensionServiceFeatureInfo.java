package com.ringcentral.definitions;


public class ExtensionServiceFeatureInfo {
    /**
     * Feature status; shows feature availability for an extension
     */
    public Boolean enabled;
    /**
     * Feature name
     * Enum: AccountFederation, Archiver, AutomaticCallRecordingMute, AutomaticInboundCallRecording, AutomaticOutboundCallRecording, BlockedMessageForwarding, Calendar, CallerIdControl, CallForwarding, CallPark, CallParkLocations, CallSupervision, CallSwitch, CallQualitySurvey, Conferencing, ConferencingNumber, ConfigureDelegates, DeveloperPortal, DND, DynamicConference, EmergencyAddressAutoUpdate, EmergencyCalling, EncryptionAtRest, ExternalDirectoryIntegration, Fax, FaxReceiving, FreeSoftPhoneLines, HDVoice, HipaaCompliance, Intercom, InternationalCalling, InternationalSMS, LinkedSoftphoneLines, MMS, MobileVoipEmergencyCalling, OnDemandCallRecording, Pager, PagerReceiving, Paging, PasswordAuth, PromoMessage, Reports, Presence, RCTeams, RingOut, SalesForce, SharedLines, SingleExtensionUI, SiteCodes, SMS, SMSReceiving, SoftPhoneUpdate, TelephonySessions, UserManagement, VideoConferencing, VoipCalling, VoipCallingOnMobile, Voicemail, VoicemailToText, WebPhone
     */
    public String featureName;
    /**
     * Reason for limitation of a particular service feature. Returned
     * only if the enabled parameter value is &#039;False&#039;, see Service Feature
     * Limitations and Reasons. When retrieving service features for an extension,
     * the reasons for limitations, if any, are returned in response
     */
    public String reason;

    public ExtensionServiceFeatureInfo enabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public ExtensionServiceFeatureInfo featureName(String featureName) {
        this.featureName = featureName;
        return this;
    }

    public ExtensionServiceFeatureInfo reason(String reason) {
        this.reason = reason;
        return this;
    }
}
