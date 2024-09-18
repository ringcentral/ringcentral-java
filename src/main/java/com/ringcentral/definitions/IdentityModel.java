package com.ringcentral.definitions;


public class IdentityModel {
    /**
     * Identity identifier.
     * Required
     * Example: 506d9e817aa58d1259000f12
     */
    public String id;
    /**
     * Identity&#039;s avatar URI
     * Format: uri
     * Example: https://example.com/assets/avatar/default-79fd530c58c2a6b83a11fcc0e842ed7023ceb69292cfeb857bc2af2c624b90fd.png
     */
    public String avatarUri;
    /**
     * Company.
     * Example: Test Company
     */
    public String company;
    /**
     * Creation time of the resource.
     * Required
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String creationTime;
    /**
     * Display name of identity
     * Example: John Doe
     */
    public String displayName;
    /**
     * Email address.
     * Format: email
     * Example: user@example.com
     */
    public String emailAddress;
    /**
     *
     */
    public IdentityExtraValues extraValues;
    /**
     * FirstName.
     * Example: John
     */
    public String firstName;
    /**
     * Gender.
     * Example: Woman
     * Enum: Man, Woman
     */
    public String gender;
    /**
     * Phone number.
     * Example: +33634231224
     */
    public String homePhone;
    /**
     * Identity group identifier which references the identity group that contains
     * all information (phone, notes, etc). Multiple identities may belong to
     * a single group. If the parameter value is null, it means that identity
     * does not belong to a group or have extra information
     * Example: 54085e5b7aa58d8b5d00006c
     */
    public String identityGroupId;
    /**
     * Either Agent or Customer
     * Enum: Agent, Customer
     */
    public String identityType;
    /**
     * LastName.
     * Example: Doe
     */
    public String lastName;
    /**
     * Phone number.
     * Example: +33634231224
     */
    public String mobilePhone;
    /**
     * Screen name of identity
     * Example: John D.
     */
    public String screenName;
    /**
     * Type of identity
     * Required
     * Enum: AppleMessagesForBusiness, Email, EngageMessaging, Facebook, GoogleMyBusiness, Instagram, Linkedin, Twitter, Viber, WhatsApp, Youtube
     */
    public String type;
    /**
     * The time when the last modification was completed.
     * Required
     * Format: date-time
     * Example: 2023-02-04T12:43:07Z
     */
    public String lastModifiedTime;
    /**
     * List of the associated user identifiers who can use the identity
     */
    public String[] userIds;
    /**
     * UUID of identity
     * Example: 9680ab94-3b78-495c-bb2c-a969954d8260
     */
    public String uuid;
    /**
     * Device info of the identity. Applicable to RingCX Digital Messaging channels only
     * Example: iPhone (iPhone); iOS 15.0.2
     */
    public String mobileDeviceInfo;
    /**
     * Facebook biography of the identity. Applicable to Facebook and Messenger channels only
     * Example: Painter living in Paris
     */
    public String fbBio;
    /**
     * Facebook category of the identity. Applicable to Facebook and Messenger channels only
     * Example: Computers/Internet
     */
    public String fbCategory;
    /**
     * Facebook locale of the identity. Applicable to Facebook and Messenger channels only
     * Example: fr_FR
     */
    public String fbLocale;
    /**
     * Instagram followers count of the identity. Applicable to Instagram and InstagramMessaging channels only
     * Format: int32
     * Example: 10
     */
    public Long igFollowersCount;
    /**
     * Twitter description of the identity. Applicable to Twitter channels only
     * Example: Software Engineer
     */
    public String twDescription;
    /**
     * Twitter followers count of the identity. Applicable to Twitter channels only
     * Format: int32
     * Example: 10
     */
    public Long twFollowersCount;
    /**
     * Count of Twitter accounts followed by the identity. Applicable to Twitter channels only
     * Format: int32
     * Example: 500
     */
    public Long twFollowingCount;
    /**
     * Count of tweets of the identity. Applicable to Twitter channels only
     * Format: int32
     * Example: 42
     */
    public Long twStatusesCount;
    /**
     * Twitter location of the identity. Applicable to Twitter channels only
     * Example: Paris
     */
    public String twLocation;
    /**
     * Viber API version of the identity. Applicable to Viber channels only
     * Example: 10
     */
    public String apiVersion;
    /**
     * Viber country of the identity. Applicable to Viber channels only
     * Example: FR
     */
    public String country;
    /**
     * Viber device type of the identity. Applicable to Viber channels only
     * Example: SM-G970U1
     */
    public String deviceType;
    /**
     * Viber language of the identity. Applicable to Viber channels only
     * Example: fr-FR
     */
    public String language;
    /**
     * Viber mobile country code of the identity. Applicable to Viber channels only
     * Example: 1
     */
    public String mcc;
    /**
     * Viber mobile network code of the identity. Applicable to Viber channels only
     * Example: 220
     */
    public String mnc;
    /**
     * Viber primary device OS of the identity. Applicable to Viber channels only
     * Example: Android 11
     */
    public String primaryDeviceOs;
    /**
     * Viber application version of the identity. Applicable to Viber channels only
     * Example: 19.5.0
     */
    public String viberVersion;

    public IdentityModel id(String id) {
        this.id = id;
        return this;
    }

    public IdentityModel avatarUri(String avatarUri) {
        this.avatarUri = avatarUri;
        return this;
    }

    public IdentityModel company(String company) {
        this.company = company;
        return this;
    }

    public IdentityModel creationTime(String creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    public IdentityModel displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public IdentityModel emailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
        return this;
    }

    public IdentityModel extraValues(IdentityExtraValues extraValues) {
        this.extraValues = extraValues;
        return this;
    }

    public IdentityModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public IdentityModel gender(String gender) {
        this.gender = gender;
        return this;
    }

    public IdentityModel homePhone(String homePhone) {
        this.homePhone = homePhone;
        return this;
    }

    public IdentityModel identityGroupId(String identityGroupId) {
        this.identityGroupId = identityGroupId;
        return this;
    }

    public IdentityModel identityType(String identityType) {
        this.identityType = identityType;
        return this;
    }

    public IdentityModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public IdentityModel mobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    public IdentityModel screenName(String screenName) {
        this.screenName = screenName;
        return this;
    }

    public IdentityModel type(String type) {
        this.type = type;
        return this;
    }

    public IdentityModel lastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }

    public IdentityModel userIds(String[] userIds) {
        this.userIds = userIds;
        return this;
    }

    public IdentityModel uuid(String uuid) {
        this.uuid = uuid;
        return this;
    }

    public IdentityModel mobileDeviceInfo(String mobileDeviceInfo) {
        this.mobileDeviceInfo = mobileDeviceInfo;
        return this;
    }

    public IdentityModel fbBio(String fbBio) {
        this.fbBio = fbBio;
        return this;
    }

    public IdentityModel fbCategory(String fbCategory) {
        this.fbCategory = fbCategory;
        return this;
    }

    public IdentityModel fbLocale(String fbLocale) {
        this.fbLocale = fbLocale;
        return this;
    }

    public IdentityModel igFollowersCount(Long igFollowersCount) {
        this.igFollowersCount = igFollowersCount;
        return this;
    }

    public IdentityModel twDescription(String twDescription) {
        this.twDescription = twDescription;
        return this;
    }

    public IdentityModel twFollowersCount(Long twFollowersCount) {
        this.twFollowersCount = twFollowersCount;
        return this;
    }

    public IdentityModel twFollowingCount(Long twFollowingCount) {
        this.twFollowingCount = twFollowingCount;
        return this;
    }

    public IdentityModel twStatusesCount(Long twStatusesCount) {
        this.twStatusesCount = twStatusesCount;
        return this;
    }

    public IdentityModel twLocation(String twLocation) {
        this.twLocation = twLocation;
        return this;
    }

    public IdentityModel apiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    public IdentityModel country(String country) {
        this.country = country;
        return this;
    }

    public IdentityModel deviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }

    public IdentityModel language(String language) {
        this.language = language;
        return this;
    }

    public IdentityModel mcc(String mcc) {
        this.mcc = mcc;
        return this;
    }

    public IdentityModel mnc(String mnc) {
        this.mnc = mnc;
        return this;
    }

    public IdentityModel primaryDeviceOs(String primaryDeviceOs) {
        this.primaryDeviceOs = primaryDeviceOs;
        return this;
    }

    public IdentityModel viberVersion(String viberVersion) {
        this.viberVersion = viberVersion;
        return this;
    }
}
