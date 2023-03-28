package com.ringcentral.definitions;


public class BridgePins {
    /**
     *
     */
    public BridgePstnPins pstn;
    /**
     * Bridge short identifier (Web PIN). The digital unique code which is used to join to a meeting. If it is not specified
     * while creation, then a code will be generated. If it is a default bridge, then this code is
     * Personal Meeting Identifier (PMI).
     * <p>
     * NOTE: Changing this PIN via update method is deprecated. So to change Web PIN use the method:
     * _*[PATCH] /rcvideo/v2/bridges/{bridgeId}/pin/web*_
     * Example: 018209241352
     */
    public String web;

    public BridgePins pstn(BridgePstnPins pstn) {
        this.pstn = pstn;
        return this;
    }

    public BridgePins web(String web) {
        this.web = web;
        return this;
    }
}
