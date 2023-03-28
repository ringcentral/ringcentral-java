package com.ringcentral.definitions;


/**
 * Site Fax/SMS recipient (operator) reference. Multi-level IVR should
 * be enabled
 */
public class SiteOperatorReference {
    /**
     * Internal identifier of an operator extension
     */
    public String id;

    public SiteOperatorReference id(String id) {
        this.id = id;
        return this;
    }
}
