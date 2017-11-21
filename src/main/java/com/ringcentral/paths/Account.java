package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Account extends Path {
    public Account (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "account", id);
    }
    public Extension extension(String id)
    {
        return new Extension(restClient, pathSegment, id);
    }
    public Extension extension()
    {
        return new Extension(restClient, pathSegment, "~");
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
    public Recording recording(String id)
    {
        return new Recording(restClient, pathSegment, id);
    }
    public Directory directory()
    {
        return new Directory(restClient, pathSegment, null);
    }
    public Bot bot()
    {
        return new Bot(restClient, pathSegment, null);
    }
    public Presence presence()
    {
        return new Presence(restClient, pathSegment, null);
    }
    public UserRole userRole(String id)
    {
        return new UserRole(restClient, pathSegment, id);
    }
    public UserRole userRole()
    {
        return new UserRole(restClient, pathSegment, null);
    }
    public BusinessHours businessHours()
    {
        return new BusinessHours(restClient, pathSegment, null);
    }
    public Greeting greeting(String id)
    {
        return new Greeting(restClient, pathSegment, id);
    }
    public Greeting greeting()
    {
        return new Greeting(restClient, pathSegment, null);
    }
    public AnsweringRule answeringRule(String id)
    {
        return new AnsweringRule(restClient, pathSegment, id);
    }
    public AnsweringRule answeringRule()
    {
        return new AnsweringRule(restClient, pathSegment, null);
    }
    public IvrMenus ivrMenus(String id)
    {
        return new IvrMenus(restClient, pathSegment, id);
    }
    public IvrMenus ivrMenus()
    {
        return new IvrMenus(restClient, pathSegment, null);
    }
    public IvrPrompts ivrPrompts(String id)
    {
        return new IvrPrompts(restClient, pathSegment, id);
    }
    public IvrPrompts ivrPrompts()
    {
        return new IvrPrompts(restClient, pathSegment, null);
    }
    public BusinessAddress businessAddress()
    {
        return new BusinessAddress(restClient, pathSegment, null);
    }
    public ServiceInfo serviceInfo()
    {
        return new ServiceInfo(restClient, pathSegment, null);
    }
    public DialingPlan dialingPlan()
    {
        return new DialingPlan(restClient, pathSegment, null);
    }
    public PhoneNumber phoneNumber(String id)
    {
        return new PhoneNumber(restClient, pathSegment, id);
    }
    public PhoneNumber phoneNumber()
    {
        return new PhoneNumber(restClient, pathSegment, null);
    }
    public Device device(String id)
    {
        return new Device(restClient, pathSegment, id);
    }
    public Device device()
    {
        return new Device(restClient, pathSegment, null);
    }
    public Order order(String id)
    {
        return new Order(restClient, pathSegment, id);
    }
    public Order order()
    {
        return new Order(restClient, pathSegment, null);
    }
    public Licenses licenses(String id)
    {
        return new Licenses(restClient, pathSegment, id);
    }
    public Licenses licenses()
    {
        return new Licenses(restClient, pathSegment, null);
    }
    public Department department(String id)
    {
        return new Department(restClient, pathSegment, id);
    }
    public Department department()
    {
        return new Department(restClient, pathSegment, null);
    }
    public PagingOnlyGroups pagingOnlyGroups(String id)
    {
        return new PagingOnlyGroups(restClient, pathSegment, id);
    }
    public ParkLocations parkLocations(String id)
    {
        return new ParkLocations(restClient, pathSegment, id);
    }
}
