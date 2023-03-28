package com.ringcentral.definitions;


public class AdaptiveCardInfoRequestItem {
    /**
     * Enum: TextBlock, ColumnSet, Column, FactSet
     */
    public String type;
    /**
     *
     */
    public String text;
    /**
     *
     */
    public String weight;
    /**
     *
     */
    public String size;
    /**
     *
     */
    public AdaptiveCardColumnInfo[] columns;

    public AdaptiveCardInfoRequestItem type(String type) {
        this.type = type;
        return this;
    }

    public AdaptiveCardInfoRequestItem text(String text) {
        this.text = text;
        return this;
    }

    public AdaptiveCardInfoRequestItem weight(String weight) {
        this.weight = weight;
        return this;
    }

    public AdaptiveCardInfoRequestItem size(String size) {
        this.size = size;
        return this;
    }

    public AdaptiveCardInfoRequestItem columns(AdaptiveCardColumnInfo[] columns) {
        this.columns = columns;
        return this;
    }
}
