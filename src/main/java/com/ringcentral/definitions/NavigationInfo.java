package com.ringcentral.definitions;


public class NavigationInfo
{
    /**
     */
    public NavigationUri firstPage;
    public NavigationInfo firstPage(NavigationUri firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public NavigationUri nextPage;
    public NavigationInfo nextPage(NavigationUri nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public NavigationUri previousPage;
    public NavigationInfo previousPage(NavigationUri previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public NavigationUri lastPage;
    public NavigationInfo lastPage(NavigationUri lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}