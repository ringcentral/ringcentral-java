package com.ringcentral.definitions;


    /**
* Phone number of the caller. This number corresponds to the 1st leg of the RingOut call. This number can be one of the user's configured forwarding numbers or an arbitrary number
*/
public class MakeRingOutCallerInfoRequestFrom
{
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    public MakeRingOutCallerInfoRequestFrom phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }

    /**
     * Internal identifier of a forwarding number; returned in response as an &#039;id&#039; field value. Can be specified instead of the phoneNumber attribute
     */
    public String forwardingNumberId;
    public MakeRingOutCallerInfoRequestFrom forwardingNumberId(String forwardingNumberId)
    {
        this.forwardingNumberId = forwardingNumberId;
        return this;
    }
}