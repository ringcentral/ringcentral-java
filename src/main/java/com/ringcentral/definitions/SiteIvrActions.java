package com.ringcentral.definitions;


/**
 * Keys handling settings
 */
public class SiteIvrActions {
    /**
     * Enum: Star, Hash, NoInput, 0
     */
    public String input;
    /**
     * Key handling action:
     * - Repeat - repeat menu greeting, for Star and Hash only;
     * - ReturnToRoot - return to root IVR menu, for Star and Hash only;
     * - ReturnToPrevious - return to previous IVR menu, for Star and Hash only;
     * - Connect - connect to specific extension, for NoInput and &quot;0&quot; (zero) only;
     * - Disconnect - end call, for NoInput only.
     * Enum: Repeat, ReturnToRoot, ReturnToPrevious, ReturnToTopLevelMenu, Connect, ConnectToIncomingCallRoutingSelection, ConnectToOperator, Disconnect, DoNothing
     */
    public String action;
    /**
     *
     */
    public SiteIVRActionsExtensionInfo extension;

    public SiteIvrActions input(String input) {
        this.input = input;
        return this;
    }

    public SiteIvrActions action(String action) {
        this.action = action;
        return this;
    }

    public SiteIvrActions extension(SiteIVRActionsExtensionInfo extension) {
        this.extension = extension;
        return this;
    }
}
