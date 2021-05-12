package com.ringcentral.definitions;


public class CallerIdByFeatureInfo {
    /**
     * If &#039;PhoneNumber&#039; value is specified, then a certain phone number is shown as a caller ID when using this telephony feature. If &#039;Blocked&#039; value is specified, then a caller ID is hidden. The value &#039;CurrentLocation&#039; can be specified for &#039;RingOut&#039; feature only. The default is &#039;PhoneNumber&#039; = [&#039;PhoneNumber&#039;, &#039;Blocked&#039;, &#039;CurrentLocation&#039;]
     */
    public String type;
    /**
     *
     */
    public CallerIdPhoneInfo phoneInfo;

    public CallerIdByFeatureInfo type(String type) {
        this.type = type;
        return this;
    }

    public CallerIdByFeatureInfo phoneInfo(CallerIdPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
