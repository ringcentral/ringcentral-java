package com.ringcentral.paths.restapi.glip.teams;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String chatId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String chatId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.chatId = chatId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && chatId != null) {
            return parent.path() + "/teams/" + chatId;
        }
        return parent.path() + "/teams";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the list of teams where the user is a member (both archived and active) combined with a list of public teams that can be joined by the current user. All records in response are sorted by creation time of a chat in ascending order. A team is a chat between 2 and more (unlimited number) participants assigned with specific name.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/teams
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipTeamsList list(ListGlipTeamsParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTeamsList.class);
    }

    public GlipTeamsList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a team, and adds a list of people to the team.  A team is a chat between 2 and more (unlimited number) participants assigned with specific name.
     * HTTP Method: post
     * Endpoint: /restapi/{apiVersion}/glip/teams
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipTeamInfo post(GlipPostTeamBody glipPostTeamBody) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), glipPostTeamBody, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTeamInfo.class);
    }

    /**
     * Returns information about the specified team. A team is a chat between 2 and more participants assigned with specific name.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipTeamInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTeamInfo.class);
    }

    /**
     * Deletes the specified team. A team is a chat between 2 and more (unlimited number) participants assigned with specific name.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates the name and description of the specified team. A team is a chat between 2 and more (unlimited number) participants assigned with specific name.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/glip/teams/{chatId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     * User Permission: UnifiedAppDesktop
     */
    public GlipTeamInfo patch(GlipPatchTeamBody glipPatchTeamBody) throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), glipPatchTeamBody, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), GlipTeamInfo.class);
    }

    public com.ringcentral.paths.restapi.glip.teams.add.Index add() {
        return new com.ringcentral.paths.restapi.glip.teams.add.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.teams.join.Index join() {
        return new com.ringcentral.paths.restapi.glip.teams.join.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.teams.leave.Index leave() {
        return new com.ringcentral.paths.restapi.glip.teams.leave.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.teams.remove.Index remove() {
        return new com.ringcentral.paths.restapi.glip.teams.remove.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.teams.archive.Index archive() {
        return new com.ringcentral.paths.restapi.glip.teams.archive.Index(this);
    }


    public com.ringcentral.paths.restapi.glip.teams.unarchive.Index unarchive() {
        return new com.ringcentral.paths.restapi.glip.teams.unarchive.Index(this);
    }

}
