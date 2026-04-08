package com.ringcentral.definitions;

/** Info about consent configuration for the TCR campaign. */
public class ConsentSettings {
    /** Opt-in necessity for outbound communications. */
    public Boolean optInRequired;

    public ConsentSettings optInRequired(Boolean optInRequired) {
        this.optInRequired = optInRequired;
        return this;
    }

    /** */
    public ConsentSettingsCoverage coverage;

    public ConsentSettings coverage(ConsentSettingsCoverage coverage) {
        this.coverage = coverage;
        return this;
    }

    /** */
    public AutomaticConsentCollecting automaticConsentCollecting;

    public ConsentSettings automaticConsentCollecting(
            AutomaticConsentCollecting automaticConsentCollecting) {
        this.automaticConsentCollecting = automaticConsentCollecting;
        return this;
    }
}
