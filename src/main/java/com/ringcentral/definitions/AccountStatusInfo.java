package com.ringcentral.definitions;


    /**
* Status information (reason, comment, lifetime). Returned for 'Disabled'
* status only
* 
*/
public class AccountStatusInfo
{
    /**
     * A free-form user comment, describing the status change reason
     */
    public String comment;
    public AccountStatusInfo comment(String comment)
    {
        this.comment = comment;
        return this;
    }

    /**
     * Type of suspension
     * Enum: SuspendedVoluntarily, SuspendedInvoluntarily, UserResumed
     */
    public String reason;
    public AccountStatusInfo reason(String reason)
    {
        this.reason = reason;
        return this;
    }

    /**
     * Date until which an account will get deleted. The default
    * value is 30 days since the current date
     */
    public String till;
    public AccountStatusInfo till(String till)
    {
        this.till = till;
        return this;
    }
}