package com.ringcentral.definitions;


    /**
* Specifies filtering based on extension ids
*/
public class ExtensionFilters
{
    /**
     * List of extension ids to match against incoming calls, joined via OR condition. Only applicable for `groupByMembers` options and Users, IVRs, SharedLines and Queues in `groupBy`
     */
    public String[] fromIds;
    public ExtensionFilters fromIds(String[] fromIds)
    {
        this.fromIds = fromIds;
        return this;
    }

    /**
     * List of extension ids to match against outgoing calls, joined via OR condition. Limited to the extension id that first accepted the call. Only applicable for `groupByMembers` options and Users, IVRs and SharedLines in `groupBy`
     */
    public String[] toIds;
    public ExtensionFilters toIds(String[] toIds)
    {
        this.toIds = toIds;
        return this;
    }
}