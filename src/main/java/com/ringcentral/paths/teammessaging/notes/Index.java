package com.ringcentral.paths.teammessaging.notes;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.Index parent;
public String noteId;
public Index(com.ringcentral.paths.teammessaging.Index parent, String noteId)
      {
this.parent = parent;
this.rc = parent.rc;
this.noteId = noteId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && noteId != null)
            {
                return parent.path() + "/notes/" + noteId;
            }
            return parent.path() + "/notes";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns the specified note(s). It is possible to fetch up to 50 notes per request.
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/notes/{noteId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMNoteWithBodyInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (noteId == null)
    {
        throw new IllegalArgumentException("Parameter noteId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteWithBodyInfo.class);
    }

        /**
         * Deletes the specified note.
         * HTTP Method: delete
         * Endpoint: /team-messaging/{version}/notes/{noteId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (noteId == null)
    {
        throw new IllegalArgumentException("Parameter noteId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }

        /**
         * Edits a note. Notes can be edited by any user if posted to a chat. the user belongs to.
         * HTTP Method: patch
         * Endpoint: /team-messaging/{version}/notes/{noteId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public TMNoteInfo patch(TMCreateNoteRequest tMCreateNoteRequest, PatchNoteNewParameters queryParams) throws com.ringcentral.RestException, java.io.IOException
  {
    if (noteId == null)
    {
        throw new IllegalArgumentException("Parameter noteId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.patch(this.path(), tMCreateNoteRequest, queryParams);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), TMNoteInfo.class);
    }
    public TMNoteInfo patch(TMCreateNoteRequest tMCreateNoteRequest) throws com.ringcentral.RestException, java.io.IOException
    {
      return this.patch(tMCreateNoteRequest, null);
    }

    public com.ringcentral.paths.teammessaging.notes.lock.Index lock()
  {
    return new com.ringcentral.paths.teammessaging.notes.lock.Index(this);
  }


    public com.ringcentral.paths.teammessaging.notes.unlock.Index unlock()
  {
    return new com.ringcentral.paths.teammessaging.notes.unlock.Index(this);
  }


    public com.ringcentral.paths.teammessaging.notes.publish.Index publish()
  {
    return new com.ringcentral.paths.teammessaging.notes.publish.Index(this);
  }

}