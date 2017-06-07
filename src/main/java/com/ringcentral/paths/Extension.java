package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.ExtensionInfo;
import com.ringcentral.definitions.NavigationInfo;
import com.ringcentral.definitions.PagingInfo;

public class Extension extends Path {
    public Extension(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "extension", id);
    }

    public ActiveCalls activeCalls() {
        return new ActiveCalls(restClient, pathSegment, null);
    }

    public AddressBookSync addressBookSync() {
        return new AddressBookSync(restClient, pathSegment, null);
    }

    public AddressBook addressBook() {
        return new AddressBook(restClient, pathSegment, null);
    }

    public AnsweringRule answeringRule(String id) {
        return new AnsweringRule(restClient, pathSegment, id);
    }

    public AnsweringRule answeringRule() {
        return new AnsweringRule(restClient, pathSegment, null);
    }

    public AuthzProfile authzProfile() {
        return new AuthzProfile(restClient, pathSegment, null);
    }

    public BlockedNumber blockedNumber(String id) {
        return new BlockedNumber(restClient, pathSegment, id);
    }

    public BlockedNumber blockedNumber() {
        return new BlockedNumber(restClient, pathSegment, null);
    }

    public BusinessHours businessHours() {
        return new BusinessHours(restClient, pathSegment, null);
    }

    public CallLog callLog(String id) {
        return new CallLog(restClient, pathSegment, id);
    }

    public CallLog callLog() {
        return new CallLog(restClient, pathSegment, null);
    }

    public CallLogSync callLogSync() {
        return new CallLogSync(restClient, pathSegment, null);
    }

    public CompanyPager companyPager() {
        return new CompanyPager(restClient, pathSegment, null);
    }

    public Conferencing conferencing() {
        return new Conferencing(restClient, pathSegment, null);
    }

    public Device device(String id) {
        return new Device(restClient, pathSegment, id);
    }

    public Device device() {
        return new Device(restClient, pathSegment, null);
    }

    public Fax fax() {
        return new Fax(restClient, pathSegment, null);
    }

    public ForwardingNumber forwardingNumber() {
        return new ForwardingNumber(restClient, pathSegment, null);
    }

    public Grant grant() {
        return new Grant(restClient, pathSegment, null);
    }

    public Greeting greeting(String id) {
        return new Greeting(restClient, pathSegment, id);
    }

    public Greeting greeting() {
        return new Greeting(restClient, pathSegment, null);
    }

    public Meeting meeting(String id) {
        return new Meeting(restClient, pathSegment, id);
    }

    public Meeting meeting() {
        return new Meeting(restClient, pathSegment, null);
    }

    public MeetingServiceInfo meetingServiceInfo() {
        return new MeetingServiceInfo(restClient, pathSegment, null);
    }

    public MessageStore messageStore(String id) {
        return new MessageStore(restClient, pathSegment, id);
    }

    public MessageStore messageStore() {
        return new MessageStore(restClient, pathSegment, null);
    }

    public MessageSync messageSync() {
        return new MessageSync(restClient, pathSegment, null);
    }

    public PhoneNumber phoneNumber(String id) {
        return new PhoneNumber(restClient, pathSegment, id);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(restClient, pathSegment, null);
    }

    public Presence presence() {
        return new Presence(restClient, pathSegment, null);
    }

    public ProfileImage profileImage(String id) {
        return new ProfileImage(restClient, pathSegment, id);
    }

    public ProfileImage profileImage() {
        return new ProfileImage(restClient, pathSegment, null);
    }

    public Ringout ringout(String id) {
        return new Ringout(restClient, pathSegment, id);
    }

    public Ringout ringout() {
        return new Ringout(restClient, pathSegment, null);
    }

    public Sms sms() {
        return new Sms(restClient, pathSegment, null);
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
