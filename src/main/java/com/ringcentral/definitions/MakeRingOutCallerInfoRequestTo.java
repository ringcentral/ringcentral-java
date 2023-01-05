package com.ringcentral.definitions;


    /**
* Phone number of the called party. This number corresponds to the 2nd leg of the RingOut call
*/
public class MakeRingOutCallerInfoRequestTo
{
    /**
     * Phone number in E.164 format
     */
    public String phoneNumber;
    public MakeRingOutCallerInfoRequestTo phoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
        return this;
    }
}