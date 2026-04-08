package com.ringcentral.definitions;

public class RcwBaseContactModel {
    /** First (given) name Example: John */
    public String firstName;

    public RcwBaseContactModel firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /** Last (family) name Example: Doe */
    public String lastName;

    public RcwBaseContactModel lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
}
