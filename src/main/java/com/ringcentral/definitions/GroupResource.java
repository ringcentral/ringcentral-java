package com.ringcentral.definitions;


public class GroupResource
{
    /**
     * Example: 63723034
     */
    public String id;
    public GroupResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Example: Leaders
     */
    public String name;
    public GroupResource name(String name)
    {
        this.name = name;
        return this;
    }
}