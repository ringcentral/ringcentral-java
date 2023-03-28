package com.ringcentral.definitions;


public class OrderBy {
    /**
     * Sorting priority index, starting from &#039;1&#039;. Optional if only one element in `orderBy` array is specified
     * Format: int32
     * Example: 1
     * Default: 1
     */
    public Long index;
    /**
     * Field name by which to sort the contacts
     * Example: department
     * Enum: firstName, lastName, extensionNumber, phoneNumber, email, jobTitle, department
     */
    public String fieldName;
    /**
     * Sorting direction
     * Example: Asc
     * Default: Asc
     * Enum: Asc, Desc
     */
    public String direction;

    public OrderBy index(Long index) {
        this.index = index;
        return this;
    }

    public OrderBy fieldName(String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public OrderBy direction(String direction) {
        this.direction = direction;
        return this;
    }
}
