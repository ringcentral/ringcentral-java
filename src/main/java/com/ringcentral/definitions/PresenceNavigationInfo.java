package com.ringcentral.definitions;


    /**
* Information on navigation
*/
public class PresenceNavigationInfo
{
    /**
     */
    public PresenceNavigationInfoURI firstPage;
    public PresenceNavigationInfo firstPage(PresenceNavigationInfoURI firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public PresenceNavigationInfoURI nextPage;
    public PresenceNavigationInfo nextPage(PresenceNavigationInfoURI nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public PresenceNavigationInfoURI previousPage;
    public PresenceNavigationInfo previousPage(PresenceNavigationInfoURI previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public PresenceNavigationInfoURI lastPage;
    public PresenceNavigationInfo lastPage(PresenceNavigationInfoURI lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}