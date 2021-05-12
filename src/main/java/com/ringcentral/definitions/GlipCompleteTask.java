package com.ringcentral.definitions;


public class GlipCompleteTask {
    /**
     * Completeness status. &#039;Mandatory&#039; if `completenessCondition` is set to `Simple`, otherwise &#039;Optional&#039;
     * Enum: Incomplete, Complete
     */
    public String status;
    /**
     *
     */
    public AssigneeInfo[] assignees;
    /**
     * Current completeness percentage of a task with the &#039;Percentage&#039; completeness condition. &#039;Mandatory&#039; if `completenessCondition` is set to `Percentage`, otherwise &#039;Optional&#039;
     * Maximum: 100
     */
    public Long completenessPercentage;

    public GlipCompleteTask status(String status) {
        this.status = status;
        return this;
    }

    public GlipCompleteTask assignees(AssigneeInfo[] assignees) {
        this.assignees = assignees;
        return this;
    }

    public GlipCompleteTask completenessPercentage(Long completenessPercentage) {
        this.completenessPercentage = completenessPercentage;
        return this;
    }
}
