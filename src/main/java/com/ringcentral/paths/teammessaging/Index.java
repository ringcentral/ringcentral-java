package com.ringcentral.paths.teammessaging;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public String version;
public Index(RestClient rc)
      {
        this(rc, "v1");
      }
public Index(RestClient rc, String version)
      {
this.rc = rc;
this.version = version;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && version != null)
            {
                return "" + "/team-messaging/" + version;
            }
            return "" + "/team-messaging";
        }
        public String path()
        {
          return path(true);
        }


  public com.ringcentral.paths.teammessaging.tasks.Index tasks()
    {
      return this.tasks(null);
    }
  public com.ringcentral.paths.teammessaging.tasks.Index tasks(String taskId)
  {
    return new com.ringcentral.paths.teammessaging.tasks.Index(this, taskId);
  }


  public com.ringcentral.paths.teammessaging.chats.Index chats()
    {
      return this.chats(null);
    }
  public com.ringcentral.paths.teammessaging.chats.Index chats(String chatId)
  {
    return new com.ringcentral.paths.teammessaging.chats.Index(this, chatId);
  }


  public com.ringcentral.paths.teammessaging.teams.Index teams()
    {
      return this.teams(null);
    }
  public com.ringcentral.paths.teammessaging.teams.Index teams(String chatId)
  {
    return new com.ringcentral.paths.teammessaging.teams.Index(this, chatId);
  }


  public com.ringcentral.paths.teammessaging.notes.Index notes()
    {
      return this.notes(null);
    }
  public com.ringcentral.paths.teammessaging.notes.Index notes(String noteId)
  {
    return new com.ringcentral.paths.teammessaging.notes.Index(this, noteId);
  }


    public com.ringcentral.paths.teammessaging.files.Index files()
  {
    return new com.ringcentral.paths.teammessaging.files.Index(this);
  }


  public com.ringcentral.paths.teammessaging.groups.Index groups()
    {
      return this.groups(null);
    }
  public com.ringcentral.paths.teammessaging.groups.Index groups(String groupId)
  {
    return new com.ringcentral.paths.teammessaging.groups.Index(this, groupId);
  }


    public com.ringcentral.paths.teammessaging.recent.Index recent()
  {
    return new com.ringcentral.paths.teammessaging.recent.Index(this);
  }


  public com.ringcentral.paths.teammessaging.events.Index events()
    {
      return this.events(null);
    }
  public com.ringcentral.paths.teammessaging.events.Index events(String eventId)
  {
    return new com.ringcentral.paths.teammessaging.events.Index(this, eventId);
  }


  public com.ringcentral.paths.teammessaging.persons.Index persons()
    {
      return this.persons(null);
    }
  public com.ringcentral.paths.teammessaging.persons.Index persons(String personId)
  {
    return new com.ringcentral.paths.teammessaging.persons.Index(this, personId);
  }


  public com.ringcentral.paths.teammessaging.webhooks.Index webhooks()
    {
      return this.webhooks(null);
    }
  public com.ringcentral.paths.teammessaging.webhooks.Index webhooks(String webhookId)
  {
    return new com.ringcentral.paths.teammessaging.webhooks.Index(this, webhookId);
  }


    public com.ringcentral.paths.teammessaging.everyone.Index everyone()
  {
    return new com.ringcentral.paths.teammessaging.everyone.Index(this);
  }


  public com.ringcentral.paths.teammessaging.companies.Index companies()
    {
      return this.companies(null);
    }
  public com.ringcentral.paths.teammessaging.companies.Index companies(String companyId)
  {
    return new com.ringcentral.paths.teammessaging.companies.Index(this, companyId);
  }


    public com.ringcentral.paths.teammessaging.favorites.Index favorites()
  {
    return new com.ringcentral.paths.teammessaging.favorites.Index(this);
  }


  public com.ringcentral.paths.teammessaging.dataexport.Index dataExport()
    {
      return this.dataExport(null);
    }
  public com.ringcentral.paths.teammessaging.dataexport.Index dataExport(String taskId)
  {
    return new com.ringcentral.paths.teammessaging.dataexport.Index(this, taskId);
  }


    public com.ringcentral.paths.teammessaging.preferences.Index preferences()
  {
    return new com.ringcentral.paths.teammessaging.preferences.Index(this);
  }


  public com.ringcentral.paths.teammessaging.conversations.Index conversations()
    {
      return this.conversations(null);
    }
  public com.ringcentral.paths.teammessaging.conversations.Index conversations(String chatId)
  {
    return new com.ringcentral.paths.teammessaging.conversations.Index(this, chatId);
  }


  public com.ringcentral.paths.teammessaging.adaptivecards.Index adaptiveCards()
    {
      return this.adaptiveCards(null);
    }
  public com.ringcentral.paths.teammessaging.adaptivecards.Index adaptiveCards(String cardId)
  {
    return new com.ringcentral.paths.teammessaging.adaptivecards.Index(this, cardId);
  }

}