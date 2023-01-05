package com.ringcentral.definitions;


public class TelephonyUserMeetingSettings
{
    /**
     * ThirdParty audio option
     */
    public Boolean thirdPartyAudio;
    public TelephonyUserMeetingSettings thirdPartyAudio(Boolean thirdPartyAudio)
    {
        this.thirdPartyAudio = thirdPartyAudio;
        return this;
    }

    /**
     * Users can join the meeting using the existing 3rd party audio configuration
     */
    public Boolean audioConferenceInfo;
    public TelephonyUserMeetingSettings audioConferenceInfo(Boolean audioConferenceInfo)
    {
        this.audioConferenceInfo = audioConferenceInfo;
        return this;
    }

    /**
     */
    public GlobalDialInCountryResponse[] globalDialCountries;
    public TelephonyUserMeetingSettings globalDialCountries(GlobalDialInCountryResponse[] globalDialCountries)
    {
        this.globalDialCountries = globalDialCountries;
        return this;
    }
}