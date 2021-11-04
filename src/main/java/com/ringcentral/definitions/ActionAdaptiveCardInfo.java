package com.ringcentral.definitions;


public class ActionAdaptiveCardInfo {
    /**
     * Enum: AdaptiveCard
     */
    public String type;
    /**
     *
     */
    public ActionCardBody[] body;

    public ActionAdaptiveCardInfo type(String type) {
        this.type = type;
        return this;
    }

    public ActionAdaptiveCardInfo body(ActionCardBody[] body) {
        this.body = body;
        return this;
    }
}
