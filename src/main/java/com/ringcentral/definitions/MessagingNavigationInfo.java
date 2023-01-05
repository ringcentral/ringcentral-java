package com.ringcentral.definitions;


    /**
* Information on navigation
*/
public class MessagingNavigationInfo
{
    /**
     */
    public MessagingNavigationInfoURI firstPage;
    public MessagingNavigationInfo firstPage(MessagingNavigationInfoURI firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public MessagingNavigationInfoURI nextPage;
    public MessagingNavigationInfo nextPage(MessagingNavigationInfoURI nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public MessagingNavigationInfoURI previousPage;
    public MessagingNavigationInfo previousPage(MessagingNavigationInfoURI previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public MessagingNavigationInfoURI lastPage;
    public MessagingNavigationInfo lastPage(MessagingNavigationInfoURI lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}