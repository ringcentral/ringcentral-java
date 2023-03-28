package com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.tasks;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.AutomaticLocationUpdatesTaskInfo;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.restapi.account.emergencyaddressautoupdate.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/tasks/" + taskId;
        }
        return parent.path() + "/tasks";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns results of the task created within the frame of Automatic
     * Location Updates feature. Currently four task types are supported: &#039;Wireless
     * Points Bulk Create&#039;, &#039;Wireless Points Bulk Update&#039;, &#039;Switches Bulk Create&#039;,
     * &#039;Switches Bulk Update&#039;.
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/emergency-address-auto-update/tasks/{taskId}
     * Rate Limit Group: Light
     * App Permission: EditAccounts
     * User Permission: ConfigureEmergencyMaps
     */
    public AutomaticLocationUpdatesTaskInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (taskId == null) {
            throw new IllegalArgumentException("Parameter taskId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), AutomaticLocationUpdatesTaskInfo.class);
    }
}
