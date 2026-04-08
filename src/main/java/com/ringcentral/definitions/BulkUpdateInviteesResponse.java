package com.ringcentral.definitions;

public class BulkUpdateInviteesResponse {
    /** */
    public InviteeResource[] addedInvitees;

    public BulkUpdateInviteesResponse addedInvitees(InviteeResource[] addedInvitees) {
        this.addedInvitees = addedInvitees;
        return this;
    }

    /** */
    public InviteeResource[] updatedInvitees;

    public BulkUpdateInviteesResponse updatedInvitees(InviteeResource[] updatedInvitees) {
        this.updatedInvitees = updatedInvitees;
        return this;
    }

    /** */
    public RcwResourceIdModel[] deletedInvitees;

    public BulkUpdateInviteesResponse deletedInvitees(RcwResourceIdModel[] deletedInvitees) {
        this.deletedInvitees = deletedInvitees;
        return this;
    }
}
