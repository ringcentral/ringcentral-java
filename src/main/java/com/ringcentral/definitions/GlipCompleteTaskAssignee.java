package com.ringcentral.definitions;


public class GlipCompleteTaskAssignee {
    /**
     * Internal identifier of an assignee (RC extension ID or Glip user ID). 'Mandatory' if `completenessCondition` is set to `AllAssignees`, otherwise 'Optional'
     */
    public String id;

    public GlipCompleteTaskAssignee id(String id) {
        this.id = id;
        return this;
    }

}
