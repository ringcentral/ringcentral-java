package com.ringcentral.definitions;


public class ContactResource
{
    /**
     * Contact extension identifier
     * Required
     * Example: 865706371004
     */
    public String id;
    public ContactResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Contact type
     * Example: User
     * Enum: User, Department, Announcement, Voicemail, SharedLinesGroup, PagingOnly, ParkLocation, IvrMenu, Limited, ApplicationExtension, Site, Bot, Room, ProxyAdmin, DelegatedLinesGroup, GroupCallPickup, External, Unknown
     */
    public String type;
    public ContactResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Contact status
     * Example: Enabled
     * Enum: Enabled, Disabled, Frozen, NotActivated, Unassigned, Unknown
     */
    public String status;
    public ContactResource status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     */
    public AccountResource account;
    public ContactResource account(AccountResource account)
    {
        this.account = account;
        return this;
    }

    /**
     * Example: External
     */
    public String department;
    public ContactResource department(String department)
    {
        this.department = department;
        return this;
    }

    /**
     * Format: email
     * Example: john.doe@mycompany.com
     */
    public String email;
    public ContactResource email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Example: 103
     */
    public String extensionNumber;
    public ContactResource extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * First name of a contact, for user extensions only
     * Example: John
     */
    public String firstName;
    public ContactResource firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of a contact, for user extensions only
     * Example: Doe
     */
    public String lastName;
    public ContactResource lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Name of a contact, for non-user extensions
     * Example: Conference room ?5
     */
    public String name;
    public ContactResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Example: Sales manager
     */
    public String jobTitle;
    public ContactResource jobTitle(String jobTitle)
    {
        this.jobTitle = jobTitle;
        return this;
    }

    /**
     */
    public PhoneNumberResource[] phoneNumbers;
    public ContactResource phoneNumbers(PhoneNumberResource[] phoneNumbers)
    {
        this.phoneNumbers = phoneNumbers;
        return this;
    }

    /**
     */
    public AccountDirectoryProfileImageResource profileImage;
    public ContactResource profileImage(AccountDirectoryProfileImageResource profileImage)
    {
        this.profileImage = profileImage;
        return this;
    }

    /**
     */
    public BusinessSiteResource site;
    public ContactResource site(BusinessSiteResource site)
    {
        this.site = site;
        return this;
    }

    /**
     */
    public Boolean hidden;
    public ContactResource hidden(Boolean hidden)
    {
        this.hidden = hidden;
        return this;
    }

    /**
     */
    public RoleResource role;
    public ContactResource role(RoleResource role)
    {
        this.role = role;
        return this;
    }

    /**
     */
    public CallQueueResource[] callQueues;
    public ContactResource callQueues(CallQueueResource[] callQueues)
    {
        this.callQueues = callQueues;
        return this;
    }

    /**
     */
    public CustomFieldResource[] customFields;
    public ContactResource customFields(CustomFieldResource[] customFields)
    {
        this.customFields = customFields;
        return this;
    }

    /**
     */
    public GroupResource[] groups;
    public ContactResource groups(GroupResource[] groups)
    {
        this.groups = groups;
        return this;
    }

    /**
     */
    public CostCenterResource costCenter;
    public ContactResource costCenter(CostCenterResource costCenter)
    {
        this.costCenter = costCenter;
        return this;
    }

    /**
     */
    public ExternalIntegrationResource integration;
    public ContactResource integration(ExternalIntegrationResource integration)
    {
        this.integration = integration;
        return this;
    }
}