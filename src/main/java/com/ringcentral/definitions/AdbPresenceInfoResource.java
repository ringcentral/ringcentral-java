package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AdbPresenceInfoResource
{
    //
    public String accountId;
    public AdbPresenceInfoResource accountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    //
    public String extensionId;
    public AdbPresenceInfoResource extensionId(String extensionId) {
        this.extensionId = extensionId;
        return this;
    }
    //
    public String extensionType;
    public AdbPresenceInfoResource extensionType(String extensionType) {
        this.extensionType = extensionType;
        return this;
    }
    //
    public String extensionStatus;
    public AdbPresenceInfoResource extensionStatus(String extensionStatus) {
        this.extensionStatus = extensionStatus;
        return this;
    }
    //
    public String dndStatus;
    public AdbPresenceInfoResource dndStatus(String dndStatus) {
        this.dndStatus = dndStatus;
        return this;
    }
    //
    public String userStatus;
    public AdbPresenceInfoResource userStatus(String userStatus) {
        this.userStatus = userStatus;
        return this;
    }
    //
    public String message;
    public AdbPresenceInfoResource message(String message) {
        this.message = message;
        return this;
    }
    //
    public String agentStatus;
    public AdbPresenceInfoResource agentStatus(String agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }
    //
    public String extensionNumber;
    public AdbPresenceInfoResource extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }
    //
    public Boolean allowSeeMyPresence;
    public AdbPresenceInfoResource allowSeeMyPresence(Boolean allowSeeMyPresence) {
        this.allowSeeMyPresence = allowSeeMyPresence;
        return this;
    }
    //
    public Boolean ringOnMonitoredCall;
    public AdbPresenceInfoResource ringOnMonitoredCall(Boolean ringOnMonitoredCall) {
        this.ringOnMonitoredCall = ringOnMonitoredCall;
        return this;
    }
    //
    public Boolean pickUpCallsOnHold;
    public AdbPresenceInfoResource pickUpCallsOnHold(Boolean pickUpCallsOnHold) {
        this.pickUpCallsOnHold = pickUpCallsOnHold;
        return this;
    }
    //
    public Boolean presenceFeatureAvailable;
    public AdbPresenceInfoResource presenceFeatureAvailable(Boolean presenceFeatureAvailable) {
        this.presenceFeatureAvailable = presenceFeatureAvailable;
        return this;
    }
    //
    public Boolean dndFeatureAvailable;
    public AdbPresenceInfoResource dndFeatureAvailable(Boolean dndFeatureAvailable) {
        this.dndFeatureAvailable = dndFeatureAvailable;
        return this;
    }
}
