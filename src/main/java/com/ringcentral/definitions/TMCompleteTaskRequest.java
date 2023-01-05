package com.ringcentral.definitions;


public class TMCompleteTaskRequest
{
    /**
     * Completeness status
     * Enum: Incomplete, Complete
     */
    public String status;
    public TMCompleteTaskRequest status(String status)
    {
        this.status = status;
        return this;
    }

    /**
     */
    public TMCompleteTaskRequestAssignees[] assignees;
    public TMCompleteTaskRequest assignees(TMCompleteTaskRequestAssignees[] assignees)
    {
        this.assignees = assignees;
        return this;
    }

    /**
     * Maximum: 100
     * Format: int32
     */
    public Long completenessPercentage;
    public TMCompleteTaskRequest completenessPercentage(Long completenessPercentage)
    {
        this.completenessPercentage = completenessPercentage;
        return this;
    }
}