package com.ringcentral.paths;

import com.ringcentral.PathSegment;

public class BulkAssign {
    private PathSegment pathSegment;

    public BulkAssign(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "bulk-assign", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class PostParameters {
        // List of users to be added to the team
        public String[] addedPersonIds;
        // List of user email addresses to be added to the team (i.e. as guests)
        public String[] addedPersonEmails;
        // List of users to be removed from the team
        public String[] removedPersonIds;

        public PostParameters addedPersonIds(String[] addedPersonIds) {
            this.addedPersonIds = addedPersonIds;
            return this;
        }

        public PostParameters addedPersonEmails(String[] addedPersonEmails) {
            this.addedPersonEmails = addedPersonEmails;
            return this;
        }

        public PostParameters removedPersonIds(String[] removedPersonIds) {
            this.removedPersonIds = removedPersonIds;
            return this;
        }
    }
}
