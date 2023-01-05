package com.ringcentral.paths.teammessaging.adaptivecards;

import com.ringcentral.*;
import com.ringcentral.definitions.*;

public class Index
{
    public RestClient rc;
public com.ringcentral.paths.teammessaging.Index parent;
public String cardId;
public Index(com.ringcentral.paths.teammessaging.Index parent, String cardId)
      {
this.parent = parent;
this.rc = parent.rc;
this.cardId = cardId;
    }
    public String path(Boolean withParameter)
        {
            if (withParameter && cardId != null)
            {
                return parent.path() + "/adaptive-cards/" + cardId;
            }
            return parent.path() + "/adaptive-cards";
        }
        public String path()
        {
          return path(true);
        }
        /**
         * Returns adaptive card(s) with given id(s).
         * HTTP Method: get
         * Endpoint: /team-messaging/{version}/adaptive-cards/{cardId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public AdaptiveCardInfo get() throws com.ringcentral.RestException, java.io.IOException
  {
    if (cardId == null)
    {
        throw new IllegalArgumentException("Parameter cardId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), AdaptiveCardInfo.class);
    }

        /**
         * Updates an adaptive card.
         * HTTP Method: put
         * Endpoint: /team-messaging/{version}/adaptive-cards/{cardId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public AdaptiveCardShortInfo put(AdaptiveCardRequest adaptiveCardRequest) throws com.ringcentral.RestException, java.io.IOException
  {
    if (cardId == null)
    {
        throw new IllegalArgumentException("Parameter cardId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.put(this.path(), adaptiveCardRequest, null);
    return com.ringcentral.Utils.gson.fromJson(rb.string(), AdaptiveCardShortInfo.class);
    }

        /**
         * Deletes an adaptive card by ID.
         * HTTP Method: delete
         * Endpoint: /team-messaging/{version}/adaptive-cards/{cardId}
         * Rate Limit Group: Medium
         * App Permission: TeamMessaging
         */
  public String delete() throws com.ringcentral.RestException, java.io.IOException
  {
    if (cardId == null)
    {
        throw new IllegalArgumentException("Parameter cardId cannot be null");
    }
    okhttp3.ResponseBody rb = this.rc.delete(this.path(), null);
    return rb.string();
    }
}