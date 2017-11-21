package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class DeliveryModeResource
{
    //
    public String transportType;
    public DeliveryModeResource transportType(String transportType) {
        this.transportType = transportType;
        return this;
    }
    //
    public Boolean encryption;
    public DeliveryModeResource encryption(Boolean encryption) {
        this.encryption = encryption;
        return this;
    }
    //
    public String address;
    public DeliveryModeResource address(String address) {
        this.address = address;
        return this;
    }
    //
    public String subscriberKey;
    public DeliveryModeResource subscriberKey(String subscriberKey) {
        this.subscriberKey = subscriberKey;
        return this;
    }
    //
    public String publisherKey;
    public DeliveryModeResource publisherKey(String publisherKey) {
        this.publisherKey = publisherKey;
        return this;
    }
    //
    public String encryptionAlgorithm;
    public DeliveryModeResource encryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }
    //
    public String encryptionKey;
    public DeliveryModeResource encryptionKey(String encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }
    //
    public String authKey;
    public DeliveryModeResource authKey(String authKey) {
        this.authKey = authKey;
        return this;
    }
    //
    public String cipherKey;
    public DeliveryModeResource cipherKey(String cipherKey) {
        this.cipherKey = cipherKey;
        return this;
    }
    //
    public String registrationId;
    public DeliveryModeResource registrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }
    //
    public String certificateName;
    public DeliveryModeResource certificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
}
