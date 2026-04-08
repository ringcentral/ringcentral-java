package com.ringcentral.definitions;

public class ClientErrorsResponseErrors {
    /** Logical error code. */
    public String errorCode;

    public ClientErrorsResponseErrors errorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /** Detailed user-friendly description of error. */
    public String message;

    public ClientErrorsResponseErrors message(String message) {
        this.message = message;
        return this;
    }

    /** Format: int32 */
    public Long parameterMaxItemCount;

    public ClientErrorsResponseErrors parameterMaxItemCount(Long parameterMaxItemCount) {
        this.parameterMaxItemCount = parameterMaxItemCount;
        return this;
    }

    /** Name of the parameter with an invalid value. */
    public String parameterName;

    public ClientErrorsResponseErrors parameterName(String parameterName) {
        this.parameterName = parameterName;
        return this;
    }

    /** Format: int32 */
    public Long parameterValueLength;

    public ClientErrorsResponseErrors parameterValueLength(Long parameterValueLength) {
        this.parameterValueLength = parameterValueLength;
        return this;
    }

    /** */
    public String parameterRange;

    public ClientErrorsResponseErrors parameterRange(String parameterRange) {
        this.parameterRange = parameterRange;
        return this;
    }
}
