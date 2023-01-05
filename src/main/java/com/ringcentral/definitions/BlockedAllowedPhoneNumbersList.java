package com.ringcentral.definitions;


    /**
* List of blocked or allowed phone numbers
*/
public class BlockedAllowedPhoneNumbersList
{
    /**
     * Link to a list of blocked/allowed phone numbers resource
     */
    public String uri;
    public BlockedAllowedPhoneNumbersList uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public BlockedAllowedPhoneNumberInfo[] records;
    public BlockedAllowedPhoneNumbersList records(BlockedAllowedPhoneNumberInfo[] records)
    {
        this.records = records;
        return this;
    }

    /**
     */
    public NavigationInfo navigation;
    public BlockedAllowedPhoneNumbersList navigation(NavigationInfo navigation)
    {
        this.navigation = navigation;
        return this;
    }

    /**
     */
    public EnumeratedPaging paging;
    public BlockedAllowedPhoneNumbersList paging(EnumeratedPaging paging)
    {
        this.paging = paging;
        return this;
    }
}