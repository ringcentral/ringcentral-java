package com.ringcentral.definitions;


public class AuthProfileResource
{
    /**
     * Format: uri
     */
    public String uri;
    public AuthProfileResource uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     */
    public ActivePermissionResource[] permissions;
    public AuthProfileResource permissions(ActivePermissionResource[] permissions)
    {
        this.permissions = permissions;
        return this;
    }
}