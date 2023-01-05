package com.ringcentral.definitions;


public class AdaptiveCardInfoRequestItem
{
    /**
     * Enum: TextBlock, ColumnSet, Column, FactSet
     */
    public String type;
    public AdaptiveCardInfoRequestItem type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public String text;
    public AdaptiveCardInfoRequestItem text(String text)
    {
        this.text = text;
        return this;
    }

    /**
     */
    public String weight;
    public AdaptiveCardInfoRequestItem weight(String weight)
    {
        this.weight = weight;
        return this;
    }

    /**
     */
    public String size;
    public AdaptiveCardInfoRequestItem size(String size)
    {
        this.size = size;
        return this;
    }

    /**
     */
    public AdaptiveCardColumnInfo[] columns;
    public AdaptiveCardInfoRequestItem columns(AdaptiveCardColumnInfo[] columns)
    {
        this.columns = columns;
        return this;
    }
}