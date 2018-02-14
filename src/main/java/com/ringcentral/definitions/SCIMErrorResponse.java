package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SCIMErrorResponse
{
    // detail error message
    public String detail;
    public SCIMErrorResponse detail(String detail) {
        this.detail = detail;
        return this;
    }
    //
    public String[] schemas;
    public SCIMErrorResponse schemas(String[] schemas) {
        this.schemas = schemas;
        return this;
    }
    // bad request type when status code is 400
    public String scimType;
    public SCIMErrorResponse scimType(String scimType) {
        this.scimType = scimType;
        return this;
    }
    // same as HTTP status code, e.g. 400, 401, etc.
    public String status;
    public SCIMErrorResponse status(String status) {
        this.status = status;
        return this;
    }
}
