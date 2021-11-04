package com.ringcentral.definitions;


public class AdaptiveCardSelectAction {
    /**
     * Required
     * Enum: Action.Submit, Action.OpenUrl, Action.ToggleVisibility
     */
    public String type;

    public AdaptiveCardSelectAction type(String type) {
        this.type = type;
        return this;
    }
}
