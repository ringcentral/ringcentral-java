package com.ringcentral.definitions;


    /**
* Note creator information
*/
public class TMCreatorInfo
{
    /**
     * Internal identifier of a user who created a note/task
     */
    public String id;
    public TMCreatorInfo id(String id)
    {
        this.id = id;
        return this;
    }
}