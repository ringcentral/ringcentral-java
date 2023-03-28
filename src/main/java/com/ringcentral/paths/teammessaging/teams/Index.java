package com.ringcentral.paths.teammessaging.teams;

import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;
    public String chatId;

    public Index(com.ringcentral.paths.teammessaging.Index parent, String chatId) {
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
     * Endpoint: /team-messaging/{version}/teams
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMTeamList list(ListGlipTeamsNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.get(this.path(false), queryParams);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTeamList.class);
    }

    public TMTeamList list() throws com.ringcentral.RestException, java.io.IOException {
        return this.list(null);
    }

    /**
     * Creates a team, and adds a list of people to the team.
     * HTTP Method: post
     * Endpoint: /team-messaging/{version}/teams
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMTeamInfo post(TMCreateTeamRequest tMCreateTeamRequest) throws com.ringcentral.RestException, java.io.IOException {
        okhttp3.ResponseBody rb = this.rc.post(this.path(false), tMCreateTeamRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTeamInfo.class);
    }

    /**
     * Returns information about the specified team.
     * HTTP Method: get
     * Endpoint: /team-messaging/{version}/teams/{chatId}
     * Rate Limit Group: Light
     * App Permission: TeamMessaging
     */
    public TMTeamInfo get() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTeamInfo.class);
    }

    /**
     * Deletes the specified team.
     * HTTP Method: delete
     * Endpoint: /team-messaging/{version}/teams/{chatId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Updates the name and description of the specified team.
     * HTTP Method: patch
     * Endpoint: /team-messaging/{version}/teams/{chatId}
     * Rate Limit Group: Medium
     * App Permission: TeamMessaging
     */
    public TMTeamInfo patch(TMUpdateTeamRequest tMUpdateTeamRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (chatId == null) {
            throw new IllegalArgumentException("Parameter chatId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), tMUpdateTeamRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), TMTeamInfo.class);
    }

    public com.ringcentral.paths.teammessaging.teams.add.Index add() {
        return new com.ringcentral.paths.teammessaging.teams.add.Index(this);
    }


    public com.ringcentral.paths.teammessaging.teams.join.Index join() {
        return new com.ringcentral.paths.teammessaging.teams.join.Index(this);
    }


    public com.ringcentral.paths.teammessaging.teams.leave.Index leave() {
        return new com.ringcentral.paths.teammessaging.teams.leave.Index(this);
    }


    public com.ringcentral.paths.teammessaging.teams.remove.Index remove() {
        return new com.ringcentral.paths.teammessaging.teams.remove.Index(this);
    }


    public com.ringcentral.paths.teammessaging.teams.archive.Index archive() {
        return new com.ringcentral.paths.teammessaging.teams.archive.Index(this);
    }


    public com.ringcentral.paths.teammessaging.teams.unarchive.Index unarchive() {
        return new com.ringcentral.paths.teammessaging.teams.unarchive.Index(this);
    }

}
