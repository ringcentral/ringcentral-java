package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;

public class Account extends Path {
    public Account(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "account", id);
    }

    public ActiveCalls activeCalls() {
        return new ActiveCalls(restClient, pathSegment, null);
    }

    public BusinessAddress businessAddress() {
        return new BusinessAddress(restClient, pathSegment, null);
    }

    public CallLog callLog(String id) {
        return new CallLog(restClient, pathSegment, id);
    }

    public CallLog callLog() {
        return new CallLog(restClient, pathSegment, null);
    }

    public Department department(String id) {
        return new Department(restClient, pathSegment, id);
    }

    public Device device(String id) {
        return new Device(restClient, pathSegment, id);
    }

    public Device device() {
        return new Device(restClient, pathSegment, null);
    }

    public DialingPlan dialingPlan() {
        return new DialingPlan(restClient, pathSegment, null);
    }

    public Extension extension(String id) {
        return new Extension(restClient, pathSegment, id);
    }

    public Extension extension() {
        return new Extension(restClient, pathSegment, "~");
    }

    public Order order(String id) {
        return new Order(restClient, pathSegment, id);
    }

    public Order order() {
        return new Order(restClient, pathSegment, null);
    }

    public PhoneNumber phoneNumber(String id) {
        return new PhoneNumber(restClient, pathSegment, id);
    }

    public PhoneNumber phoneNumber() {
        return new PhoneNumber(restClient, pathSegment, null);
    }

    public Recording recording(String id) {
        return new Recording(restClient, pathSegment, id);
    }

    public ServiceInfo serviceInfo() {
        return new ServiceInfo(restClient, pathSegment, null);
    }
}
