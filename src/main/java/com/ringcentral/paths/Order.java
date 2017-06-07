package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.DeviceInfo;

public class Order {
    private PathSegment pathSegment;

    public Order(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "order", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class PostParameters {
        // List of devices to order
        public DeviceInfo[] devices;

        public PostParameters devices(DeviceInfo[] devices) {
            this.devices = devices;
            return this;
        }
    }

    public static class PostResponse {
        // List of the ordered devices
        public DeviceInfo[] devices;

        public PostResponse devices(DeviceInfo[] devices) {
            this.devices = devices;
            return this;
        }
    }

    public static class GetResponse {
        // Identifier of a device
        public String id;
        // Canonical URI of an order resource
        public String uri;
        // List of the ordered devices
        public DeviceInfo[] devices;

        public GetResponse id(String id) {
            this.id = id;
            return this;
        }

        public GetResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public GetResponse devices(DeviceInfo[] devices) {
            this.devices = devices;
            return this;
        }
    }
}
