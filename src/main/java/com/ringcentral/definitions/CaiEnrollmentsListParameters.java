package com.ringcentral.definitions;


/**
 * Query parameters for operation caiEnrollmentsList
 */
public class CaiEnrollmentsListParameters {
    /**
     * Indicates if partially enrolled speakers should be returned
     */
    public Boolean partial;
    /**
     * Number of enrollments to be returned per page
     * Format: int32
     */
    public Long perPage;
    /**
     * Page number to be returned
     * Format: int32
     */
    public Long page;

    public CaiEnrollmentsListParameters partial(Boolean partial) {
        this.partial = partial;
        return this;
    }

    public CaiEnrollmentsListParameters perPage(Long perPage) {
        this.perPage = perPage;
        return this;
    }

    public CaiEnrollmentsListParameters page(Long page) {
        this.page = page;
        return this;
    }
}
