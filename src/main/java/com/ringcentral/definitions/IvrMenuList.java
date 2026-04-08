package com.ringcentral.definitions;

public class IvrMenuList {
    /** Link to an IVR Menu list Format: uri */
    public String uri;

    public IvrMenuList uri(String uri) {
        this.uri = uri;
        return this;
    }

    /** List of ivr menus */
    public IvrMenuListInfo[] records;

    public IvrMenuList records(IvrMenuListInfo[] records) {
        this.records = records;
        return this;
    }
}
