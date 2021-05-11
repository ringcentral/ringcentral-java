package com.ringcentral.paths.restapi.account.extension.notificationsettings;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.account.extension.Index parent;
public Index(com.ringcentral.paths.restapi.account.extension.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/notification-settings";
        }
        /**
         * Returns notification settings for the current extension.
 *  {@literal <}p{@literal >}Knowledge Article: {@literal <}a href={@literal "}https://success.ringcentral.com/articles/RC_Knowledge_Article/9740{@literal "}{@literal >}User Settings - Set up Message Notifications{@literal <}/a{@literal >}{@literal <}/p{@literal >}
         * HTTP Method: get
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings
         * Rate Limit Group: Light
         * App Permission: ReadAccounts
         * User Permission: ReadMessagesNotificationsSettings
         */
  public NotificationSettings get() throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), NotificationSettings.class);
    }

        /**
         * Updates notification settings for the current extension.
 * {@literal <}p{@literal >}Knowledge Article: {@literal <}a href={@literal "}https://success.ringcentral.com/articles/RC_Knowledge_Article/9740{@literal "}{@literal >}User Settings - Set up Message Notifications{@literal <}/a{@literal >}{@literal <}/p{@literal >}
         * HTTP Method: put
         * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/notification-settings
         * Rate Limit Group: Medium
         * App Permission: EditExtensions
         * User Permission: EditMessagesNotificationsSettings
         */
  public NotificationSettings put(NotificationSettingsUpdateRequest notificationSettingsUpdateRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    okhttp3.ResponseBody rb = this.rc.put(this.path(), notificationSettingsUpdateRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), NotificationSettings.class);
    }
}