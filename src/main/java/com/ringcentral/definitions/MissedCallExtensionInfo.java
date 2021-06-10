package com.ringcentral.definitions;


// Specifies an extension (a calling group) which should be used for missed call transfer. Returned only if the `actionType` is set to 'ConnectToExtension'
public class MissedCallExtensionInfo {
    /**
     * Internal identifier of an extension which should be used for missed call transfer
     */
    public String id;

    public MissedCallExtensionInfo id(String id) {
        this.id = id;
        return this;
    }
}
