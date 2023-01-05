package com.ringcentral.definitions;


    /**
* An action that will be invoked when the card is tapped or selected. `Action.ShowCard` is not supported
*/
public class AdaptiveCardSelectAction
{
    /**
     * Required
     * Enum: Action.Submit, Action.OpenUrl, Action.ToggleVisibility
     */
    public String type;
    public AdaptiveCardSelectAction type(String type)
    {
        this.type = type;
        return this;
    }
}