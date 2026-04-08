package com.ringcentral.definitions;

public class TcrBrandRecord {
    /** Identifier of a TCR brand Format: int64 */
    public Long id;

    public TcrBrandRecord id(Long id) {
        this.id = id;
        return this;
    }

    /** Name of a TCR brand */
    public String name;

    public TcrBrandRecord name(String name) {
        this.name = name;
        return this;
    }

    /** Country code */
    public String countryCode;

    public TcrBrandRecord countryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * Enum: Created, Submitted, SubmitFailed, Verified, Unverified, UpdateRequested,
     * DeleteRequested, Suspended, Expired, Draft, PreventFailed
     */
    public String status;

    public TcrBrandRecord status(String status) {
        this.status = status;
        return this;
    }

    /** Registration time Format: date-time */
    public String registrationTime;

    public TcrBrandRecord registrationTime(String registrationTime) {
        this.registrationTime = registrationTime;
        return this;
    }

    /** External ID */
    public String externalId;

    public TcrBrandRecord externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /** */
    public CompanyDetails companyDetails;

    public TcrBrandRecord companyDetails(CompanyDetails companyDetails) {
        this.companyDetails = companyDetails;
        return this;
    }

    /** */
    public ApiErrorWithParameter[] errors;

    public TcrBrandRecord errors(ApiErrorWithParameter[] errors) {
        this.errors = errors;
        return this;
    }
}
