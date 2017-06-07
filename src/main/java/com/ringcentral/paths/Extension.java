package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.ExtensionInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Extension {
    private PathSegment pathSegment;

    public Extension(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "extension", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public ActiveCalls activeCalls() {
        return new ActiveCalls(pathSegment, null);
    }

    public AddressBookSync addressBookSync() {
        return new AddressBookSync(pathSegment, null);
    }

    public AddressBook addressBook() {
        return new AddressBook(pathSegment, null);
    }

    public AnsweringRule answeringRule(String id) {
        return new AnsweringRule(pathSegment, id);
    }

    public AnsweringRule answeringRule() {
        return new AnsweringRule(pathSegment, null);
    }

    public AuthzProfile authzProfile() {
        return new AuthzProfile(pathSegment, null);
    }

    public BlockedNumber blockedNumber(String id) {
        return new BlockedNumber(pathSegment, id);
    }

    public BlockedNumber blockedNumber() {
        return new BlockedNumber(pathSegment, null);
    }

    public BusinessHours businessHours() {
        return new BusinessHours(pathSegment, null);
    }

    public CallLog callLog(String id) {
        return new CallLog(pathSegment, id);
    }

    public CallLog callLog() {
        return new CallLog(pathSegment, null);
    }

    public CallLogSync callLogSync() {
        return new CallLogSync(pathSegment, null);
    }

    public CompanyPager companyPager() {
        return new CompanyPager(pathSegment, null);
    }

    public Conferencing conferencing() {
        return new Conferencing(pathSegment, null);
    }

    public Device device(String id) {
        return new Device(pathSegment, id);
    }

    public Device device() {
        return new Device(pathSegment, null);
    }

    public Fax fax() {
        return new Fax(pathSegment, null);
    }

    public ForwardingNumber forwardingNumber() {
        return new ForwardingNumber(pathSegment, null);
    }

    public Grant grant() {
        return new Grant(pathSegment, null);
    }

    public Greeting greeting(String id) {
        return new Greeting(pathSegment, id);
    }

    public Greeting greeting() {
        return new Greeting(pathSegment, null);
    }

    public Meeting meeting(String id) {
        return new Meeting(pathSegment, id);
    }

    public Meeting meeting() {
        return new Meeting(pathSegment, null);
    }

    public MeetingServiceInfo meetingServiceInfo() {
        return new MeetingServiceInfo(pathSegment, null);
    }

    public MessageStore messageStore(String id) {
        return new MessageStore(pathSegment, id);
    }

    public MessageStore messageStore() {
        return new MessageStore(pathSegment, null);
    }

    public MessageSync messageSync() {
        return new MessageSync(pathSegment, null);
    }

    public PhoneNumber phoneNumber(String id) {
        return new PhoneNumber(pathSegment, id);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(pathSegment, null);
    }

    public Presence presence() {
        return new Presence(pathSegment, null);
    }

    public ProfileImage profileImage(String id) {
        return new ProfileImage(pathSegment, id);
    }

    public ProfileImage profileImage() {
        return new ProfileImage(pathSegment, null);
    }

    public Ringout ringout(String id) {
        return new Ringout(pathSegment, id);
    }

    public Ringout ringout() {
        return new Ringout(pathSegment, null);
    }

    public Sms sms() {
        return new Sms(pathSegment, null);
    }

    public static class ListParameters {
        // Indicates the page number to retrieve. Only positive number values are allowed. Default value is '1'
        public Long page;
        // Indicates the page size (number of items). If not specified, the value is '100' by default.
        public Long perPage;
        // Extension current state. Multiple values are supported. If 'Unassigned' is specified, then extensions without extensionNumber are returned. If not specified, then all extensions are returned
        public String status;
        // Extension type. Multiple values are supported
        public String type;

        public ListParameters page(Long page) {
            this.page = page;
            return this;
        }

        public ListParameters perPage(Long perPage) {
            this.perPage = perPage;
            return this;
        }

        public ListParameters status(String status) {
            this.status = status;
            return this;
        }

        public ListParameters type(String type) {
            this.type = type;
            return this;
        }
    }

    public static class ListResponse {
        // List of extensions with extension information
        public ExtensionInfo[] records;
        // Information on navigation
        public NavigationInfo navigation;
        // Information on paging
        public PagingInfo paging;

        public ListResponse records(ExtensionInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }
    }
}
