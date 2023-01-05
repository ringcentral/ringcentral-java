package com.ringcentral.definitions;


public class UserAnsweringRuleListNavigation
{
    /**
     */
    public UserAnsweringRuleListNavigationPage firstPage;
    public UserAnsweringRuleListNavigation firstPage(UserAnsweringRuleListNavigationPage firstPage)
    {
        this.firstPage = firstPage;
        return this;
    }

    /**
     */
    public UserAnsweringRuleListNavigationPage nextPage;
    public UserAnsweringRuleListNavigation nextPage(UserAnsweringRuleListNavigationPage nextPage)
    {
        this.nextPage = nextPage;
        return this;
    }

    /**
     */
    public UserAnsweringRuleListNavigationPage previousPage;
    public UserAnsweringRuleListNavigation previousPage(UserAnsweringRuleListNavigationPage previousPage)
    {
        this.previousPage = previousPage;
        return this;
    }

    /**
     */
    public UserAnsweringRuleListNavigationPage lastPage;
    public UserAnsweringRuleListNavigation lastPage(UserAnsweringRuleListNavigationPage lastPage)
    {
        this.lastPage = lastPage;
        return this;
    }
}