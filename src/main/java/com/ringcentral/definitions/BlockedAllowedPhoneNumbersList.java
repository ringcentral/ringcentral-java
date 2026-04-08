package com.ringcentral.definitions;

/** List of blocked or allowed phone numbers */
public class BlockedAllowedPhoneNumbersList {
    /** Link to a list of blocked/allowed phone numbers resource Format: uri */
    public String uri;

    public BlockedAllowedPhoneNumbersList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** */
    public BlockedAllowedPhoneNumberInfo[] records;

    public BlockedAllowedPhoneNumbersList records(BlockedAllowedPhoneNumberInfo[] records) {
        this.records = records;
        return this;
    }

    /** */
    public PageNavigationModel navigation;

    public BlockedAllowedPhoneNumbersList navigation(PageNavigationModel navigation) {
        this.navigation = navigation;
        return this;
    }

    /** */
    public EnumeratedPagingModel paging;

    public BlockedAllowedPhoneNumbersList paging(EnumeratedPagingModel paging) {
        this.paging = paging;
        return this;
    }
}
