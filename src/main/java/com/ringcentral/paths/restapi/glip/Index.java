package com.ringcentral.paths.restapi.glip;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.restapi.Index parent;
public Index(com.ringcentral.paths.restapi.Index parent)
      {
this.parent = parent;
this.rc = parent.rc;
    }
    public String path()
        {
            return parent.path() + "/glip";
        }


  public com.ringcentral.paths.restapi.glip.chats.Index chats()
    {
      return this.chats(null);
    }
  public com.ringcentral.paths.restapi.glip.chats.Index chats(String chatId)
  {
    return new com.ringcentral.paths.restapi.glip.chats.Index(this, chatId);
  }


  public com.ringcentral.paths.restapi.glip.teams.Index teams()
    {
      return this.teams(null);
    }
  public com.ringcentral.paths.restapi.glip.teams.Index teams(String chatId)
  {
    return new com.ringcentral.paths.restapi.glip.teams.Index(this, chatId);
  }


  public com.ringcentral.paths.restapi.glip.notes.Index notes()
    {
      return this.notes(null);
    }
  public com.ringcentral.paths.restapi.glip.notes.Index notes(String noteId)
  {
    return new com.ringcentral.paths.restapi.glip.notes.Index(this, noteId);
  }


  public com.ringcentral.paths.restapi.glip.tasks.Index tasks()
    {
      return this.tasks(null);
    }
  public com.ringcentral.paths.restapi.glip.tasks.Index tasks(String taskId)
  {
    return new com.ringcentral.paths.restapi.glip.tasks.Index(this, taskId);
  }


    public com.ringcentral.paths.restapi.glip.groups.Index groups()
  {
    return new com.ringcentral.paths.restapi.glip.groups.Index(this);
  }


    public com.ringcentral.paths.restapi.glip.recent.Index recent()
  {
    return new com.ringcentral.paths.restapi.glip.recent.Index(this);
  }


  public com.ringcentral.paths.restapi.glip.events.Index events()
    {
      return this.events(null);
    }
  public com.ringcentral.paths.restapi.glip.events.Index events(String eventId)
  {
    return new com.ringcentral.paths.restapi.glip.events.Index(this, eventId);
  }


  public com.ringcentral.paths.restapi.glip.persons.Index persons()
    {
      return this.persons(null);
    }
  public com.ringcentral.paths.restapi.glip.persons.Index persons(String personId)
  {
    return new com.ringcentral.paths.restapi.glip.persons.Index(this, personId);
  }


  public com.ringcentral.paths.restapi.glip.webhooks.Index webhooks()
    {
      return this.webhooks(null);
    }
  public com.ringcentral.paths.restapi.glip.webhooks.Index webhooks(String webhookId)
  {
    return new com.ringcentral.paths.restapi.glip.webhooks.Index(this, webhookId);
  }


    public com.ringcentral.paths.restapi.glip.everyone.Index everyone()
  {
    return new com.ringcentral.paths.restapi.glip.everyone.Index(this);
  }


  public com.ringcentral.paths.restapi.glip.companies.Index companies()
    {
      return this.companies(null);
    }
  public com.ringcentral.paths.restapi.glip.companies.Index companies(String companyId)
  {
    return new com.ringcentral.paths.restapi.glip.companies.Index(this, companyId);
  }


    public com.ringcentral.paths.restapi.glip.favorites.Index favorites()
  {
    return new com.ringcentral.paths.restapi.glip.favorites.Index(this);
  }


  public com.ringcentral.paths.restapi.glip.dataexport.Index dataExport()
    {
      return this.dataExport(null);
    }
  public com.ringcentral.paths.restapi.glip.dataexport.Index dataExport(String taskId)
  {
    return new com.ringcentral.paths.restapi.glip.dataexport.Index(this, taskId);
  }


    public com.ringcentral.paths.restapi.glip.preferences.Index preferences()
  {
    return new com.ringcentral.paths.restapi.glip.preferences.Index(this);
  }


  public com.ringcentral.paths.restapi.glip.conversations.Index conversations()
    {
      return this.conversations(null);
    }
  public com.ringcentral.paths.restapi.glip.conversations.Index conversations(String chatId)
  {
    return new com.ringcentral.paths.restapi.glip.conversations.Index(this, chatId);
  }

}