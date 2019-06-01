package com.ringcentral.definitions;


// List of blocked or allowed phone numbers
public class BlockedAllowedPhoneNumbersList {
    /**
     * Link to a list of blocked/allowed phone numbers resource
     */
    public String uri;
    /**
     *
     */
    public BlockedAllowedPhoneNumberInfo[] records;
    /**
     * Information on navigation
     */
    public CallHandlingNavigationInfo navigation;
    /**
     * Information on paging
     */
    public CallHandlingPagingInfo paging;

    public BlockedAllowedPhoneNumbersList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BlockedAllowedPhoneNumbersList records(BlockedAllowedPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public BlockedAllowedPhoneNumbersList navigation(CallHandlingNavigationInfo navigation) {
        this.navigation = navigation;
        return this;
    }

    public BlockedAllowedPhoneNumbersList paging(CallHandlingPagingInfo paging) {
        this.paging = paging;
        return this;
    }

}
