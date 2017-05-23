package com.ringcentral.definitions;

public class DialInNumbers {
    // Phone number of the dial-in number for the meeting in e.164 format
    public String phoneNumber;
    // Phone number of the dial-in number formatted according to the extension home country
    public String formattedNumber;
    // Optional field in case the dial-in number is associated with a particular location
    public String location;
    // Country resource corresponding to the dial-in number
    public DialInNumbers_CountryInfo country;
}
