package com.ringcentral.definitions;


public class UserAnsweringRuleListNavigation {
    /**
     *
     */
    public UserAnsweringRuleListNavigationPage firstPage;
    /**
     *
     */
    public UserAnsweringRuleListNavigationPage nextPage;
    /**
     *
     */
    public UserAnsweringRuleListNavigationPage previousPage;
    /**
     *
     */
    public UserAnsweringRuleListNavigationPage lastPage;

    public UserAnsweringRuleListNavigation firstPage(UserAnsweringRuleListNavigationPage firstPage) {
        this.firstPage = firstPage;
        return this;
    }

    public UserAnsweringRuleListNavigation nextPage(UserAnsweringRuleListNavigationPage nextPage) {
        this.nextPage = nextPage;
        return this;
    }

    public UserAnsweringRuleListNavigation previousPage(UserAnsweringRuleListNavigationPage previousPage) {
        this.previousPage = previousPage;
        return this;
    }

    public UserAnsweringRuleListNavigation lastPage(UserAnsweringRuleListNavigationPage lastPage) {
        this.lastPage = lastPage;
        return this;
    }

}
