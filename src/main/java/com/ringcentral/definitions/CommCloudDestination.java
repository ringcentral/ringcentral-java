package com.ringcentral.definitions;

public class CommCloudDestination {
    /** Required Example: 1111111 */
    public String integrationId;

    public CommCloudDestination integrationId(String integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    /** Example: 88888 */
    public String extensionNumber;

    public CommCloudDestination extensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /** Example: +16509994313 */
    public String phoneNumber;

    public CommCloudDestination phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
