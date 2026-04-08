package com.ringcentral.definitions;

public class CallerIdData {
    /**
     * If &#039;PhoneNumber&#039; value is specified, then a certain phone number is shown as a
     * caller ID when using this telephony feature. If &#039;Blocked&#039; value is specified, then
     * a caller ID is hidden. The value &#039;CurrentLocation&#039; can be specified for
     * &#039;RingOut&#039; feature only Default: PhoneNumber Enum: PhoneNumber, Blocked,
     * CurrentLocation
     */
    public String type;

    public CallerIdData type(String type) {
        this.type = type;
        return this;
    }

    /** */
    public CallerIdPhoneInfo phoneInfo;

    public CallerIdData phoneInfo(CallerIdPhoneInfo phoneInfo) {
        this.phoneInfo = phoneInfo;
        return this;
    }
}
