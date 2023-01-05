package com.ringcentral.definitions;


    /**
* Queue opportunities data for the specified grouping
*/
public class QueueOpportunities
{
    /**
     * Unit of the result value
     * Required
     * Enum: Percent, Seconds, Instances
     */
    public String valueType;
    public QueueOpportunities valueType(String valueType)
    {
        this.valueType = valueType;
        return this;
    }

    /**
     * Value for queue opportunities
     * Required
     * Format: double
     */
    public Double values;
    public QueueOpportunities values(Double values)
    {
        this.values = values;
        return this;
    }
}