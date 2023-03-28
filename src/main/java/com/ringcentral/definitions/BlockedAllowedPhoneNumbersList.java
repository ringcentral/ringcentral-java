package com.ringcentral.definitions;


/**
 * List of blocked or allowed phone numbers
 */
public class BlockedAllowedPhoneNumbersList {
    /**
     * Link to a list of blocked/allowed phone numbers resource
     * Format: uri
     */
    public String uri;
    /**
     *
     */
    public BlockedAllowedPhoneNumberInfo[] records;
    /**
     *
     */
    public PageNavigationModel navigation;
    /**
     *
     */
    public EnumeratedPagingModel paging;

    public BlockedAllowedPhoneNumbersList uri(String uri) {
        this.uri = uri;
        return this;
    }

    public BlockedAllowedPhoneNumbersList records(BlockedAllowedPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    public BlockedAllowedPhoneNumbersList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    public BlockedAllowedPhoneNumbersList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
