package com.ringcentral.paths.restapi.glip

class Index(val parent: com.ringcentral.paths.restapi.Index) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(): String {
        return "${parent.path()}/glip"
    }


    @JvmOverloads
    fun chats(chatId: String? = null): com.ringcentral.paths.restapi.glip.chats.Index {
        return com.ringcentral.paths.restapi.glip.chats.Index(this, chatId)
    }


    @JvmOverloads
    fun conversations(chatId: String? = null): com.ringcentral.paths.restapi.glip.conversations.Index {
        return com.ringcentral.paths.restapi.glip.conversations.Index(this, chatId)
    }


    @JvmOverloads
    fun teams(chatId: String? = null): com.ringcentral.paths.restapi.glip.teams.Index {
        return com.ringcentral.paths.restapi.glip.teams.Index(this, chatId)
    }


    fun everyone(): com.ringcentral.paths.restapi.glip.everyone.Index {
        return com.ringcentral.paths.restapi.glip.everyone.Index(this)
    }


    fun recent(): com.ringcentral.paths.restapi.glip.recent.Index {
        return com.ringcentral.paths.restapi.glip.recent.Index(this)
    }


    fun favorites(): com.ringcentral.paths.restapi.glip.favorites.Index {
        return com.ringcentral.paths.restapi.glip.favorites.Index(this)
    }


    @JvmOverloads
    fun groups(groupId: String? = null): com.ringcentral.paths.restapi.glip.groups.Index {
        return com.ringcentral.paths.restapi.glip.groups.Index(this, groupId)
    }


    @JvmOverloads
    fun cards(cardId: String? = null): com.ringcentral.paths.restapi.glip.cards.Index {
        return com.ringcentral.paths.restapi.glip.cards.Index(this, cardId)
    }


    @JvmOverloads
    fun events(eventId: String? = null): com.ringcentral.paths.restapi.glip.events.Index {
        return com.ringcentral.paths.restapi.glip.events.Index(this, eventId)
    }


    @JvmOverloads
    fun persons(personId: String? = null): com.ringcentral.paths.restapi.glip.persons.Index {
        return com.ringcentral.paths.restapi.glip.persons.Index(this, personId)
    }


    @JvmOverloads
    fun companies(companyId: String? = null): com.ringcentral.paths.restapi.glip.companies.Index {
        return com.ringcentral.paths.restapi.glip.companies.Index(this, companyId)
    }


    @JvmOverloads
    fun webhooks(webhookId: String? = null): com.ringcentral.paths.restapi.glip.webhooks.Index {
        return com.ringcentral.paths.restapi.glip.webhooks.Index(this, webhookId)
    }


    fun preferences(): com.ringcentral.paths.restapi.glip.preferences.Index {
        return com.ringcentral.paths.restapi.glip.preferences.Index(this)
    }


    fun posts(): com.ringcentral.paths.restapi.glip.posts.Index {
        return com.ringcentral.paths.restapi.glip.posts.Index(this)
    }


    @JvmOverloads
    fun dataexport(taskId: String? = null): com.ringcentral.paths.restapi.glip.dataexport.Index {
        return com.ringcentral.paths.restapi.glip.dataexport.Index(this, taskId)
    }

}