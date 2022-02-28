package com.ringcentral.definitions;


public class UserAnsweringRuleListNavigationPage
{
    /**
     * Example: https://platform.ringcentral.com/restapi/v1.0/account/240913004/extension/240972004/answering-rule?page=1&amp;perPage=100
     */
    public String uri;
    public UserAnsweringRuleListNavigationPage uri(String uri)
    {
        this.uri = uri;
        return this;
    }
}