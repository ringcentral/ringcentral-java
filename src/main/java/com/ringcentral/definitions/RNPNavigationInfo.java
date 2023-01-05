package com.ringcentral.definitions;


public class RNPNavigationInfo
{
    /**
     */
    public RNPNavigationInfoUri nextPage;
    public RNPNavigationInfo nextPage(RNPNavigationInfoUri nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public RNPNavigationInfoUri previousPage;
    public RNPNavigationInfo previousPage(RNPNavigationInfoUri previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public RNPNavigationInfoUri firstPage;
    public RNPNavigationInfo firstPage(RNPNavigationInfoUri firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public RNPNavigationInfoUri lastPage;
    public RNPNavigationInfo lastPage(RNPNavigationInfoUri lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}