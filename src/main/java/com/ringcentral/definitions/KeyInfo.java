package com.ringcentral.definitions;


    /**
* Additional info about the key
*/
public class KeyInfo
{
    /**
     * Extension&#039;s number
     */
    public String extensionNumber;
    public KeyInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }

    /**
     * Extension&#039;s name
     */
    public String name;
    public KeyInfo name(String name)
    {
        this.name = name;
        return this;
    }
}