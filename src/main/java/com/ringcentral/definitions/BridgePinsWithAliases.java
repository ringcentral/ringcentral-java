package com.ringcentral.definitions;


public class BridgePinsWithAliases {
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
    /**
     * List of bridge aliases. An alias is a unique personal meeting name that can be specified for the default bridge.
     * It can be used to join to a meeting in the same way as the short identifier.
     * Example: joseph1990,qa_team_2_lead
     */
    public String[] aliases;

    public BridgePinsWithAliases pstn(BridgePstnPins pstn) {
        this.pstn = pstn;
        return this;
    }

    public BridgePinsWithAliases web(String web) {
        this.web = web;
        return this;
    }

    public BridgePinsWithAliases aliases(String[] aliases) {
        this.aliases = aliases;
        return this;
    }
}
