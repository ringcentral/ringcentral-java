package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class Account {
    private PathSegment pathSegment;

    public Account(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "account", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public ActiveCalls activeCalls() {
        return new ActiveCalls(pathSegment, null);
    }

    public BusinessAddress businessAddress() {
        return new BusinessAddress(pathSegment, null);
    }

    public CallLog callLog(String id) {
        return new CallLog(pathSegment, id);
    }

    public CallLog callLog() {
        return new CallLog(pathSegment, null);
    }

    public Department department(String id) {
        return new Department(pathSegment, id);
    }

    public Device device(String id) {
        return new Device(pathSegment, id);
    }

    public Device device() {
        return new Device(pathSegment, null);
    }

    public DialingPlan dialingPlan() {
        return new DialingPlan(pathSegment, null);
    }

    public Extension extension(String id) {
        return new Extension(pathSegment, id);
    }

    public Extension extension() {
        return new Extension(pathSegment, "~");
    }

    public Order order(String id) {
        return new Order(pathSegment, id);
    }

    public Order order() {
        return new Order(pathSegment, null);
    }

    public PhoneNumber phoneNumber(String id) {
        return new PhoneNumber(pathSegment, id);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(pathSegment, null);
    }

    public Recording recording(String id) {
        return new Recording(pathSegment, id);
    }

    public ServiceInfo serviceInfo() {
        return new ServiceInfo(pathSegment, null);
    }
}
