package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Extension extends Path {
    public Extension (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "extension", id);
    }
    public CallLog callLog(String id)
    {
        return new CallLog(restClient, pathSegment, id);
    }
    public CallLog callLog()
    {
        return new CallLog(restClient, pathSegment, null);
    }
    public CallLogSync callLogSync()
    {
        return new CallLogSync(restClient, pathSegment, null);
    }
    public ActiveCalls activeCalls()
    {
        return new ActiveCalls(restClient, pathSegment, null);
    }
    public PhoneNumber phoneNumber(String id)
    {
        return new PhoneNumber(restClient, pathSegment, id);
    }
    public PhoneNumber phoneNumber()
    {
        return new PhoneNumber(restClient, pathSegment, null);
    }
    public Sms sms()
    {
        return new Sms(restClient, pathSegment, null);
    }
    public CompanyPager companyPager()
    {
        return new CompanyPager(restClient, pathSegment, null);
    }
    public Fax fax()
    {
        return new Fax(restClient, pathSegment, null);
    }
    public MessageStore messageStore(String id)
    {
        return new MessageStore(restClient, pathSegment, id);
    }
    public MessageStore messageStore()
    {
        return new MessageStore(restClient, pathSegment, null);
    }
    public MessageSync messageSync()
    {
        return new MessageSync(restClient, pathSegment, null);
    }
    public RingOut ringOut(String id)
    {
        return new RingOut(restClient, pathSegment, id);
    }
    public RingOut ringOut()
    {
        return new RingOut(restClient, pathSegment, null);
    }
    public DirectRingOut directRingOut()
    {
        return new DirectRingOut(restClient, pathSegment, null);
    }
    public AddressBook addressBook()
    {
        return new AddressBook(restClient, pathSegment, null);
    }
    public AddressBookSync addressBookSync()
    {
        return new AddressBookSync(restClient, pathSegment, null);
    }
    public Favorite favorite()
    {
        return new Favorite(restClient, pathSegment, null);
    }
    public Presence presence()
    {
        return new Presence(restClient, pathSegment, null);
    }
    public Meeting meeting(String id)
    {
        return new Meeting(restClient, pathSegment, id);
    }
    public Meeting meeting()
    {
        return new Meeting(restClient, pathSegment, null);
    }
    public MeetingServiceInfo meetingServiceInfo()
    {
        return new MeetingServiceInfo(restClient, pathSegment, null);
    }
    public AuthzProfile authzProfile()
    {
        return new AuthzProfile(restClient, pathSegment, null);
    }
    public ForwardingNumber forwardingNumber(String id)
    {
        return new ForwardingNumber(restClient, pathSegment, id);
    }
    public ForwardingNumber forwardingNumber()
    {
        return new ForwardingNumber(restClient, pathSegment, null);
    }
    public BlockedNumber blockedNumber(String id)
    {
        return new BlockedNumber(restClient, pathSegment, id);
    }
    public BlockedNumber blockedNumber()
    {
        return new BlockedNumber(restClient, pathSegment, null);
    }
    public BusinessHours businessHours()
    {
        return new BusinessHours(restClient, pathSegment, null);
    }
    public AnsweringRule answeringRule(String id)
    {
        return new AnsweringRule(restClient, pathSegment, id);
    }
    public AnsweringRule answeringRule()
    {
        return new AnsweringRule(restClient, pathSegment, null);
    }
    public Greeting greeting(String id)
    {
        return new Greeting(restClient, pathSegment, id);
    }
    public Greeting greeting()
    {
        return new Greeting(restClient, pathSegment, null);
    }
    public CallerId callerId()
    {
        return new CallerId(restClient, pathSegment, null);
    }
    public Credentials credentials()
    {
        return new Credentials(restClient, pathSegment, null);
    }
    public Grant grant()
    {
        return new Grant(restClient, pathSegment, null);
    }
    public NotificationSettings notificationSettings()
    {
        return new NotificationSettings(restClient, pathSegment, null);
    }
    public ProfileImage profileImage(String id)
    {
        return new ProfileImage(restClient, pathSegment, id);
    }
    public ProfileImage profileImage()
    {
        return new ProfileImage(restClient, pathSegment, null);
    }
    public Conferencing conferencing()
    {
        return new Conferencing(restClient, pathSegment, null);
    }
    public FreeNumbers freeNumbers()
    {
        return new FreeNumbers(restClient, pathSegment, null);
    }
    public Device device(String id)
    {
        return new Device(restClient, pathSegment, id);
    }
    public Device device()
    {
        return new Device(restClient, pathSegment, null);
    }
    public Reporting reporting()
    {
        return new Reporting(restClient, pathSegment, null);
    }
    public static class ListParameters
    {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;
        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }
        // Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without extensionNumber are returned. If not specified, then all extensions are returned
        public String[] status;
        public ListParameters status(String[] status) {
            this.status = status;
            return this;
        }
        // Extension type. Multiple values are supported
        public String[] type;
        public ListParameters type(String[] type) {
            this.type = type;
            return this;
        }
    }
}
