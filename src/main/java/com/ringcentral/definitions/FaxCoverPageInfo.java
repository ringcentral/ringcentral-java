package com.ringcentral.definitions;


public class FaxCoverPageInfo {
    /**
     * Internal identifier of a fax cover page. The possible value range is 0-13 (for language setting en-US) and 0, 15-28 (for all other languages)
     */
    public Long id;
    /**
     * Name of a fax cover page pattern
     */
    public String name;

    public FaxCoverPageInfo id(Long id) {
        this.id = id;
        return this;
    }

    public FaxCoverPageInfo name(String name) {
        this.name = name;
        return this;
    }

}
