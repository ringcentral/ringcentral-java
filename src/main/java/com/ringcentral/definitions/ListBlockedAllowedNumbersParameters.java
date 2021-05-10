package com.ringcentral.definitions;


// Query parameters for operation listBlockedAllowedNumbers
public class ListBlockedAllowedNumbersParameters {
    /**
     *
     */
    public Long page;
    /**
     *
     */
    public Long perPage;
    /**
     * Enum: Blocked, Allowed
     */
    public String status;

    public ListBlockedAllowedNumbersParameters page(Long page) {
        this.page = page;
        return this;
    }

    public ListBlockedAllowedNumbersParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public ListBlockedAllowedNumbersParameters status(String status) {
        this.status = status;
        return this;
    }
}
