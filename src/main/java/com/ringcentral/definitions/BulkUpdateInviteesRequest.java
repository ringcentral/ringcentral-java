package com.ringcentral.definitions;


public class BulkUpdateInviteesRequest
{
    /**
     */
    public AddInviteeRequest[] addedInvitees;
    public BulkUpdateInviteesRequest addedInvitees(AddInviteeRequest[] addedInvitees)
    {
        this.addedInvitees = addedInvitees;
        return this;
    }

    /**
     */
    public BulkUpdateInviteesRequestUpdatedInvitees[] updatedInvitees;
    public BulkUpdateInviteesRequest updatedInvitees(BulkUpdateInviteesRequestUpdatedInvitees[] updatedInvitees)
    {
        this.updatedInvitees = updatedInvitees;
        return this;
    }

    /**
     */
    public RcwResourceIdModel[] deletedInvitees;
    public BulkUpdateInviteesRequest deletedInvitees(RcwResourceIdModel[] deletedInvitees)
    {
        this.deletedInvitees = deletedInvitees;
        return this;
    }
}