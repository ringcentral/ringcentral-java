package com.ringcentral.definitions;


    /**
* Please note that legacy 'Department' extension type corresponds to
* 'Call Queue' extensions in modern RingCentral product terminology
* 
*/
public class DepartmentBulkAssignResource
{
    /**
     */
    public BulkAssignItem[] items;
    public DepartmentBulkAssignResource items(BulkAssignItem[] items)
    {
        this.items = items;
        return this;
    }
}