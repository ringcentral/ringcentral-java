package com.ringcentral.paths.restapi.account.extension.features;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.FeatureList;
import com.ringcentral.definitions.ReadExtensionFeaturesParameters;

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

    public String path(Boolean withParameter) {
        return path();
    }

    /**
     * Returns a list of supported features and the information on their
     * availability for the current extension. Particular feature(s) can
     * be checked by providing `featureId` query parameter. Multiple values
     * are supported in the format: `?featureId=Feature1&amp;featureId=Feature2`.
     * To get only available features in order to decrease response size,
     * `availableOnly=true` query param can be specified. If a feature
     * is available for the current user, `&quot;available&quot;: true` is returned in
     * response for the record with the corresponding feature ID. Otherwise,
     * the additional attribute `reason` is returned with the appropriate code:
     * - `ServicePlanLimitation` -  a feature is not included in account service plan;
     * - `AccountLimitation` - a feature is turned off for account;
     * - `ExtensionTypeLimitation` - a feature is not applicable for extension type;
     * - `ExtensionLimitation` - a feature is not available for extension, e.g., additional license required;
     * - `InsufficientPermissions` - required permission is not granted to the current user (not the one, who is specified in the URL, but the one who is calling this API);
     * - `ConfigurationLimitation` - a feature is turned off for extension, e.g., by account administrator.
     * - `PermissionLimitation` - a feature is unavailable due to a specific permission this extension has.
     * <p>
     * Also, some features may have additional parameters, e.g. limits, which are returned in `params` attribute as a name-value collection:
     * <p>
     * {
     * &quot;id&quot;: &quot;HUD&quot;,
     * &quot;available&quot;: true,
     * &quot;params&quot;: [
     * {
     * &quot;name&quot;: &quot;limitMax&quot;,
     * &quot;value&quot;: &quot;100&quot;
     * }
     * ]
     * }
     * <p>
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/extension/{extensionId}/features
     * Rate Limit Group: Medium
     * App Permission: ReadAccounts
     * User Permission: ReadExtensions
     */
    public FeatureList get(ReadExtensionFeaturesParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), FeatureList.class);
    }

    public FeatureList get() throws com.ringcentral.RestException, java.io.IOException {
        return this.get(null);
    }
}
