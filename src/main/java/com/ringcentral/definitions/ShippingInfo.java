package com.ringcentral.definitions;


    /**
* Shipping information, according to which devices (in case of HardPhone)
* or e911 stickers (in case of SoftPhone and OtherPhone) will be delivered
* to the customer
* 
*/
public class ShippingInfo
{
    /**
     * Order item shipping status. It is set to `Initial` when the order is submitted.
    * Then it is changed to `Accepted` when a distributor starts processing the order.
    * Finally, it is changed to `Shipped` which means that the distributor has shipped the device.
     * Example: Shipped
     * Enum: Initial, Accepted, Shipped, Won't ship
     */
    public String status;
    public ShippingInfo status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     * Shipping carrier name. Appears only if the device status is &#039;Shipped&#039;
     */
    public String carrier;
    public ShippingInfo carrier(String carrier)
    {
        this.carrier = carrier;
        return this;
    }

    /**
     * Carrier-specific tracking number. Appears only if the device status is &#039;Shipped&#039;
     */
    public String trackingNumber;
    public ShippingInfo trackingNumber(String trackingNumber)
    {
        this.trackingNumber = trackingNumber;
        return this;
    }

    /**
     */
    public ShippingMethodInfo method;
    public ShippingInfo method(ShippingMethodInfo method)
    {
        this.method = method;
        return this;
    }

    /**
     */
    public ShippingAddressInfo address;
    public ShippingInfo address(ShippingAddressInfo address)
    {
        this.address = address;
        return this;
    }
}