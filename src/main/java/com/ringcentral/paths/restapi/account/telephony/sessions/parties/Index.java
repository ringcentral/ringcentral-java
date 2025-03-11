package com.ringcentral.paths.restapi.account.telephony.sessions.parties;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.account.telephony.sessions.Index parent;
    public String partyId;

    public Index(com.ringcentral.paths.restapi.account.telephony.sessions.Index parent, String partyId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.partyId = partyId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && partyId != null) {
            return parent.path() + "/parties/" + partyId;
        }
        return parent.path() + "/parties";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns a call party status by ID.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty get() throws com.ringcentral.RestException, java.io.IOException {
        if (partyId == null) {
            throw new IllegalArgumentException("Parameter partyId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }

    /**
     * Deletes a party from a call session by ID. A party can be deleted only if supervised or parked. It is possible to delete only one conference participant per request.
     * HTTP Method: delete
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public String delete() throws com.ringcentral.RestException, java.io.IOException {
        if (partyId == null) {
            throw new IllegalArgumentException("Parameter partyId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
        return rb.string();
    }

    /**
     * Modifies a call party by ID. There is a known limitation for Mute scenario - mute via REST API doesn&#039;t work with mute placed via RingCentral apps or HardPhone. It means that if you muted participant via Call Control API and RingCentral Desktop app you need to unmute both endpoints to bring the media back.
     * HTTP Method: patch
     * Endpoint: /restapi/{apiVersion}/account/{accountId}/telephony/sessions/{telephonySessionId}/parties/{partyId}
     * Rate Limit Group: Light
     * App Permission: CallControl
     */
    public CallParty patch(PartyUpdateRequest partyUpdateRequest) throws com.ringcentral.RestException, java.io.IOException {
        if (partyId == null) {
            throw new IllegalArgumentException("Parameter partyId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.patch(this.path(), partyUpdateRequest, null);
        return com.ringcentral.Utils.gson.fromJson(rb.string(), CallParty.class);
    }

    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.park.Index park() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.park.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip.Index flip() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.flip.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold.Index hold() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.hold.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.reply.Index reply() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.reply.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold.Index unhold() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.unhold.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.bridge.Index bridge() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.bridge.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.ignore.Index ignore() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.ignore.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject.Index reject() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.reject.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.answer.Index answer() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.answer.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.pickup.Index pickup() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.pickup.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward.Index forward() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.forward.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer.Index transfer() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.transfer.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.bringin.Index bringIn() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.bringin.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.supervise.Index supervise() {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.supervise.Index(this);
    }


    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings.Index recordings() {
        return this.recordings(null);
    }

    public com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings.Index recordings(String recordingId) {
        return new com.ringcentral.paths.restapi.account.telephony.sessions.parties.recordings.Index(this, recordingId);
    }

}
