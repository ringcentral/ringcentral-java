package com.ringcentral.definitions;


public class Contact
{
    /**
     * First name
     */
    public String firstName;
    public Contact firstName(String firstName)
    {
        this.firstName = firstName;
        return this;
    }

    /**
     * Last name
     */
    public String lastName;
    public Contact lastName(String lastName)
    {
        this.lastName = lastName;
        return this;
    }

    /**
     * Email address
     * Format: email
     */
    public String email;
    public Contact email(String email)
    {
        this.email = email;
        return this;
    }

    /**
     * Phone number
     */
    public String phoneNumber;
    public Contact phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}