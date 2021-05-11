package com.ringcentral.paths.restapi.account.extension.features;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.FeatureList;
import com.ringcentral.definitions.ReadUserFeaturesParameters;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.extension.Index parent;

    public Index(com.ringcentral.paths.restapi.account.extension.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/features";
    }

    /**
     * Returns the list of supported features and information on their availability for the current extension. Specific feature(s) might be checked by providing `featureId` query param. Multiple values supported, format: `?featureId=Feature1{@literal &}featureId=Feature2`. To get only available features in order to decrease response size, `availableOnly=true` query param might be specified.
     * In case the feature is available for the current user, `{@literal "}available{@literal "}: true` is returned in the response for the record with corresponding feature `id`. Otherwise, additional attribute `reason` is returned with the appropriate code:
     * * `ServicePlanLimitation` - the feature not included to the account service plan;
     * * `AccountLimitation` - the feature is turned off for the account;
     * * `ExtensionTypeLimitation` - the feature is not applicable for the extension type;
     * * `ExtensionLimitation` - the feature is not available for the extension, e.g., additional license required;
     * * `InsufficientPermissions` - required permission not granted to the current user (not the one, who is specified in the URL, but the one who{@literal '}s access token is used);
     * * `ConfigurationLimitation` - the feature is turned off for the extension, e.g., by the account administrator.
     * <p>
     * Also, some feature may have some additional parameters, e.g., limits, which are returned in `params` attribute as a name-value collection:
     * <p>
     * {
     * {@literal "}id{@literal "}: {@literal "}HUD{@literal "},
     * {@literal "}available{@literal "}: true,
     * {@literal "}params{@literal "}: [
     * {
     * {@literal "}name{@literal "}: {@literal "}limitMax{@literal "},
     * {@literal "}value{@literal "}: {@literal "}100{@literal "}
     * }
     * ]
     * }
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/features
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public FeatureList get(ReadUserFeaturesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), FeatureList.class);
    }

    public FeatureList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
