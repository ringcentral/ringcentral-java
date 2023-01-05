package com.ringcentral.definitions;


    /**
* Task creator information
*/
public class CreatorInfo
{
    /**
     * Internal identifier of a user
     */
    public String id;
    public CreatorInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * First name of a user
     */
    public String firstName;
    public CreatorInfo firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name of a user
     */
    public String lastName;
    public CreatorInfo lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }
}