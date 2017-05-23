package com.ringcentral.paths;

import com.ringcentral.definitions.DeviceInfo;

public class Order {
    static
    public class PostParameters {
        // List of devices to order
        public DeviceInfo[] devices;

        public PostParameters devices(DeviceInfo[] devices) {
            this.devices = devices;
            return this;
        }
    }

    static
    public class PostResponse {
        // List of the ordered devices
        public DeviceInfo[] devices;

        public PostResponse devices(DeviceInfo[] devices) {
            this.devices = devices;
            return this;
        }
    }

    static
    public class GetResponse {
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
