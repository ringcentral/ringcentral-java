package com.ringcentral.definitions;


    /**
* Please note that legacy 'Department' extension type corresponds to
* 'Call Queue' extensions in modern RingCentral product terminology
* 
*/
public class DepartmentInfo
{
    /**
     * Internal identifier of a department extension
     * Format: uri
     */
    public String id;
    public DepartmentInfo id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Canonical URI of an extension resource
     * Format: uri
     */
    public String uri;
    public DepartmentInfo uri(String uri)
    {
        this.uri = uri;
        return this;
    }

    /**
     * Number of a department extension
     */
    public String extensionNumber;
    public DepartmentInfo extensionNumber(String extensionNumber)
    {
        this.extensionNumber = extensionNumber;
        return this;
    }
}