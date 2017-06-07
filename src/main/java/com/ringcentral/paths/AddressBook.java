package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class AddressBook {
    private PathSegment pathSegment;

    public AddressBook(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "address-book", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public Contact contact(String id) {
        return new Contact(pathSegment, id);
    }

    public Contact contact() {
        return new Contact(pathSegment, null);
    }

    public Group group() {
        return new Group(pathSegment, null);
    }
}
