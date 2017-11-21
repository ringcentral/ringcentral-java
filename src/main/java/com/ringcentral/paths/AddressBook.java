package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class AddressBook extends Path {
    public AddressBook (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "address-book", id);
    }
    public Contact contact(String id)
    {
        return new Contact(restClient, pathSegment, id);
    }
    public Contact contact()
    {
        return new Contact(restClient, pathSegment, null);
    }
}
