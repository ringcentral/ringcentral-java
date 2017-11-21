package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class ClientProvisioningWebUriInfo
{
    // Link to web page with the application description. Returned if the application needs to be updated, together with the appVersionUpgrade hint
    public String appDownload;
    public ClientProvisioningWebUriInfo appDownload(String appDownload) {
        this.appDownload = appDownload;
        return this;
    }
    // Link to the application distributive package. Returned if the application needs to be updated, together with the appVersionUpgrade hint
    public String appDownloadFile;
    public ClientProvisioningWebUriInfo appDownloadFile(String appDownloadFile) {
        this.appDownloadFile = appDownloadFile;
        return this;
    }
    // Link to express setup page (mobile application)
    public String expressSetupMobile;
    public ClientProvisioningWebUriInfo expressSetupMobile(String expressSetupMobile) {
        this.expressSetupMobile = expressSetupMobile;
        return this;
    }
    // Link to the RC Meetings application distributive package
    public String meetingsAppDownload;
    public ClientProvisioningWebUriInfo meetingsAppDownload(String meetingsAppDownload) {
        this.meetingsAppDownload = meetingsAppDownload;
        return this;
    }
    // Link to billing page (mobile application)
    public String mobileWebBilling;
    public ClientProvisioningWebUriInfo mobileWebBilling(String mobileWebBilling) {
        this.mobileWebBilling = mobileWebBilling;
        return this;
    }
    // Link to call handling page (mobile application)
    public String mobileWebCallHandling;
    public ClientProvisioningWebUriInfo mobileWebCallHandling(String mobileWebCallHandling) {
        this.mobileWebCallHandling = mobileWebCallHandling;
        return this;
    }
    // Link to international calling page (mobile application)
    public String mobileWebInternationalCalling;
    public ClientProvisioningWebUriInfo mobileWebInternationalCalling(String mobileWebInternationalCalling) {
        this.mobileWebInternationalCalling = mobileWebInternationalCalling;
        return this;
    }
    // Link to notifications page (mobile application)
    public String mobileWebNotifications;
    public ClientProvisioningWebUriInfo mobileWebNotifications(String mobileWebNotifications) {
        this.mobileWebNotifications = mobileWebNotifications;
        return this;
    }
    // Link to phone system settings page (mobile application)
    public String mobileWebPhoneSystem;
    public ClientProvisioningWebUriInfo mobileWebPhoneSystem(String mobileWebPhoneSystem) {
        this.mobileWebPhoneSystem = mobileWebPhoneSystem;
        return this;
    }
    // Link to reports page (mobile application)
    public String mobileWebReporting;
    public ClientProvisioningWebUriInfo mobileWebReporting(String mobileWebReporting) {
        this.mobileWebReporting = mobileWebReporting;
        return this;
    }
    // Link to reset password page (mobile application)
    public String mobileWebResetPassword;
    public ClientProvisioningWebUriInfo mobileWebResetPassword(String mobileWebResetPassword) {
        this.mobileWebResetPassword = mobileWebResetPassword;
        return this;
    }
    // Link to  Tell A Friend  page (mobile application)
    public String mobileWebTellAFriend;
    public ClientProvisioningWebUriInfo mobileWebTellAFriend(String mobileWebTellAFriend) {
        this.mobileWebTellAFriend = mobileWebTellAFriend;
        return this;
    }
    // Link to upgrade trial account (mobile application)
    public String mobileWebTrialUpgrade;
    public ClientProvisioningWebUriInfo mobileWebTrialUpgrade(String mobileWebTrialUpgrade) {
        this.mobileWebTrialUpgrade = mobileWebTrialUpgrade;
        return this;
    }
    // Link to user settings page (mobile application)
    public String mobileWebUserSettings;
    public ClientProvisioningWebUriInfo mobileWebUserSettings(String mobileWebUserSettings) {
        this.mobileWebUserSettings = mobileWebUserSettings;
        return this;
    }
    // Link to billing page (web application)
    public String serviceWebBilling;
    public ClientProvisioningWebUriInfo serviceWebBilling(String serviceWebBilling) {
        this.serviceWebBilling = serviceWebBilling;
        return this;
    }
    // Link to home page (web application)
    public String serviceWebHome;
    public ClientProvisioningWebUriInfo serviceWebHome(String serviceWebHome) {
        this.serviceWebHome = serviceWebHome;
        return this;
    }
    // Link to phone system settings page (web application)
    public String serviceWebPhoneSystem;
    public ClientProvisioningWebUriInfo serviceWebPhoneSystem(String serviceWebPhoneSystem) {
        this.serviceWebPhoneSystem = serviceWebPhoneSystem;
        return this;
    }
    // Link to reset password page (web application)
    public String serviceWebResetPassword;
    public ClientProvisioningWebUriInfo serviceWebResetPassword(String serviceWebResetPassword) {
        this.serviceWebResetPassword = serviceWebResetPassword;
        return this;
    }
    // Link to  Tell A Friend  page (web application)
    public String serviceWebTellAFriend;
    public ClientProvisioningWebUriInfo serviceWebTellAFriend(String serviceWebTellAFriend) {
        this.serviceWebTellAFriend = serviceWebTellAFriend;
        return this;
    }
    // Link to user settings page (web application)
    public String serviceWebUserSettings;
    public ClientProvisioningWebUriInfo serviceWebUserSettings(String serviceWebUserSettings) {
        this.serviceWebUserSettings = serviceWebUserSettings;
        return this;
    }
    // Link to sign up page (web application)
    public String signUp;
    public ClientProvisioningWebUriInfo signUp(String signUp) {
        this.signUp = signUp;
        return this;
    }
    // Link to support page (web application)
    public String support;
    public ClientProvisioningWebUriInfo support(String support) {
        this.support = support;
        return this;
    }
}
