package com.ringcentral.paths.restapi.account.extension.notificationsettings;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.NotificationSettings;
import com.ringcentral.definitions.NotificationSettingsUpdateRequest;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/notification-settings";
    }

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns notification settings for the current extension.
     * <p>
     * Knowledge Article: [User Settings - Set Up Message Notifications](https://success.ringcentral.com/articles/RC_Knowledge_Article/9740)
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings
     * Rate Limit Group: Light
     * App Permission: ReadAccounts
     * User Permission: ReadMessagesNotificationsSettings
     */
    public NotificationSettings get() throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), NotificationSettings.class);
    }

    /**
     * Updates notification settings for the current extension.
     * Knowledge Article: [User Settings - Set Up Message Notifications](https://success.ringcentral.com/articles/RC_Knowledge_Article/9740)
     * <p>
     * HTTP Method: put
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings
     * Rate Limit Group: Medium
     * App Permission: EditExtensions
     * User Permission: EditMessagesNotificationsSettings
     */
    public NotificationSettings put(NotificationSettingsUpdateRequest notificationSettingsUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.put(this.path(), notificationSettingsUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), NotificationSettings.class);
    }
}
