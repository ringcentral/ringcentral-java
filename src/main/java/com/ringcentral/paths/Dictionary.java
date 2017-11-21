package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class Dictionary extends Path {
    public Dictionary (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "dictionary", id);
    }
    public FaxCoverPage faxCoverPage()
    {
        return new FaxCoverPage(restClient, pathSegment, null);
    }
    public UserRole userRole(String id)
    {
        return new UserRole(restClient, pathSegment, id);
    }
    public UserRole userRole()
    {
        return new UserRole(restClient, pathSegment, null);
    }
    public Permission permission(String id)
    {
        return new Permission(restClient, pathSegment, id);
    }
    public Permission permission()
    {
        return new Permission(restClient, pathSegment, null);
    }
    public PermissionCategory permissionCategory(String id)
    {
        return new PermissionCategory(restClient, pathSegment, id);
    }
    public PermissionCategory permissionCategory()
    {
        return new PermissionCategory(restClient, pathSegment, null);
    }
    public Greeting greeting(String id)
    {
        return new Greeting(restClient, pathSegment, id);
    }
    public Greeting greeting()
    {
        return new Greeting(restClient, pathSegment, null);
    }
    public SecretQuestion secretQuestion(String id)
    {
        return new SecretQuestion(restClient, pathSegment, id);
    }
    public SecretQuestion secretQuestion()
    {
        return new SecretQuestion(restClient, pathSegment, null);
    }
    public Language language(String id)
    {
        return new Language(restClient, pathSegment, id);
    }
    public Language language()
    {
        return new Language(restClient, pathSegment, null);
    }
    public Country country(String id)
    {
        return new Country(restClient, pathSegment, id);
    }
    public Country country()
    {
        return new Country(restClient, pathSegment, null);
    }
    public Location location()
    {
        return new Location(restClient, pathSegment, null);
    }
    public State state(String id)
    {
        return new State(restClient, pathSegment, id);
    }
    public State state()
    {
        return new State(restClient, pathSegment, null);
    }
    public Timezone timezone(String id)
    {
        return new Timezone(restClient, pathSegment, id);
    }
    public Timezone timezone()
    {
        return new Timezone(restClient, pathSegment, null);
    }
    public Brand brand(String id)
    {
        return new Brand(restClient, pathSegment, id);
    }
    public ServicePlan servicePlan(String id)
    {
        return new ServicePlan(restClient, pathSegment, id);
    }
    public Device device(String id)
    {
        return new Device(restClient, pathSegment, id);
    }
    public Device device()
    {
        return new Device(restClient, pathSegment, null);
    }
    public ShippingOptions shippingOptions()
    {
        return new ShippingOptions(restClient, pathSegment, null);
    }
    public LicenseTypes licenseTypes()
    {
        return new LicenseTypes(restClient, pathSegment, null);
    }
}
