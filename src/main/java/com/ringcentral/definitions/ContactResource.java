package com.ringcentral.definitions;


public class ContactResource {
    /**
     * Contact extension identifier
     * Required
     * Example: 865706371004
     */
    public String id;
    /**
     * Contact type
     * Example: User
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, IvrMenu, Limited, ApplicationExtension, Site, Bot, Room, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup, External, Unknown
     */
    public String type;
    /**
     * Contact status
     * Example: Enabled
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned, Unknown
     */
    public String status;
    /**
     *
     */
    public AccountResource account;
    /**
     * Example: External
     */
    public String department;
    /**
     * Format: email
     * Example: john.doe@mycompany.com
     */
    public String email;
    /**
     * Example: 103
     */
    public String extensionNumber;
    /**
     * First name of a contact, for user extensions only
     * Example: John
     */
    public String firstName;
    /**
     * Last name of a contact, for user extensions only
     * Example: Doe
     */
    public String lastName;
    /**
     * Name of a contact, for non-user extensions
     * Example: Conference room ?5
     */
    public String name;
    /**
     * Example: Sales manager
     */
    public String jobTitle;
    /**
     *
     */
    public PhoneNumberResource[] phoneNumbers;
    /**
     *
     */
    public AccountDirectoryProfileImageResource profileImage;
    /**
     *
     */
    public BusinessSiteResource site;
    /**
     *
     */
    public Boolean hidden;
    /**
     *
     */
    public RoleResource role;
    /**
     *
     */
    public CallQueueResource[] callQueues;
    /**
     *
     */
    public CustomFieldResource[] customFields;
    /**
     *
     */
    public GroupResource[] groups;
    /**
     *
     */
    public CostCenterResource costCenter;
    /**
     *
     */
    public ExternalIntegrationResource integration;

    public ContactResource id(String id) {
        this.id = id;
        return this;
    }

    public ContactResource type(String type) {
        this.type = type;
        return this;
    }

    public ContactResource status(String status) {
        this.status = status;
        return this;
    }

    public ContactResource account(AccountResource account) {
        this.account = account;
        return this;
    }

    public ContactResource department(String department) {
        this.department = department;
        return this;
    }

    public ContactResource email(String email) {
        this.email = email;
        return this;
    }

    public ContactResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    public ContactResource firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public ContactResource lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public ContactResource name(String name) {
        this.name = name;
        return this;
    }

    public ContactResource jobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
        return this;
    }

    public ContactResource phoneNumbers(PhoneNumberResource[] phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    public ContactResource profileImage(AccountDirectoryProfileImageResource profileImage) {
        this.profileImage = profileImage;
        return this;
    }

    public ContactResource site(BusinessSiteResource site) {
        this.site = site;
        return this;
    }

    public ContactResource hidden(Boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public ContactResource role(RoleResource role) {
        this.role = role;
        return this;
    }

    public ContactResource callQueues(CallQueueResource[] callQueues) {
        this.callQueues = callQueues;
        return this;
    }

    public ContactResource customFields(CustomFieldResource[] customFields) {
        this.customFields = customFields;
        return this;
    }

    public ContactResource groups(GroupResource[] groups) {
        this.groups = groups;
        return this;
    }

    public ContactResource costCenter(CostCenterResource costCenter) {
        this.costCenter = costCenter;
        return this;
    }

    public ContactResource integration(ExternalIntegrationResource integration) {
        this.integration = integration;
        return this;
    }
}
