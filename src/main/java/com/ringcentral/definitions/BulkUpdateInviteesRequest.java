package com.ringcentral.definitions;


public class BulkUpdateInviteesRequest {
    /**
     *
     */
    public AddInviteeRequest[] addedInvitees;
    /**
     *
     */
    public BulkUpdateInviteesRequestUpdatedInvitees[] updatedInvitees;
    /**
     *
     */
    public RcwResourceIdModel[] deletedInvitees;

    public BulkUpdateInviteesRequest addedInvitees(AddInviteeRequest[] addedInvitees) {
        this.addedInvitees = addedInvitees;
        return this;
    }

    public BulkUpdateInviteesRequest updatedInvitees(BulkUpdateInviteesRequestUpdatedInvitees[] updatedInvitees) {
        this.updatedInvitees = updatedInvitees;
        return this;
    }

    public BulkUpdateInviteesRequest deletedInvitees(RcwResourceIdModel[] deletedInvitees) {
        this.deletedInvitees = deletedInvitees;
        return this;
    }
}
