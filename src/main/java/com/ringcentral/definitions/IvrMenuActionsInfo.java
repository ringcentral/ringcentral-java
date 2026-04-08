package com.ringcentral.definitions;

public class IvrMenuActionsInfo {
    /** Key pressed by the user Enum: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, Hash, Star, NoInput */
    public String input;

    public IvrMenuActionsInfo input(String input) {
        this.input = input;
        return this;
    }

    /**
     * Action to be taken on key press Enum: Connect, Voicemail, DialByName, Transfer, Repeat,
     * ReturnToRoot, ReturnToPrevious, Disconnect, ReturnToTopLevelMenu, DoNothing,
     * ConnectToOperator, TransferToContactCenterNumber, ConnectToIncomingCallRoutingSelection
     */
    public String action;

    public IvrMenuActionsInfo action(String action) {
        this.action = action;
        return this;
    }

    /** */
    public IvrMenuExtensionInfo extension;

    public IvrMenuActionsInfo extension(IvrMenuExtensionInfo extension) {
        this.extension = extension;
        return this;
    }

    /** For &#039;Transfer&#039; action only. PSTN number in E.164 format */
    public String phoneNumber;

    public IvrMenuActionsInfo phoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
