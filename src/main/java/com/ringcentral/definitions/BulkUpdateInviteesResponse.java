package com.ringcentral.definitions;


public class BulkUpdateInviteesResponse {
    /**
     *
     */
    public InviteeResource[] addedInvitees;
    /**
     *
     */
    public InviteeResource[] updatedInvitees;
    /**
     *
     */
    public RcwResourceIdModel[] deletedInvitees;

    public BulkUpdateInviteesResponse addedInvitees(InviteeResource[] addedInvitees) {
        this.addedInvitees = addedInvitees;
        return this;
    }

    public BulkUpdateInviteesResponse updatedInvitees(InviteeResource[] updatedInvitees) {
        this.updatedInvitees = updatedInvitees;
        return this;
    }

    public BulkUpdateInviteesResponse deletedInvitees(RcwResourceIdModel[] deletedInvitees) {
        this.deletedInvitees = deletedInvitees;
        return this;
    }
}
