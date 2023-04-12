package com.ringcentral.paths.teammessaging.v1;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.teammessaging.Index parent;

    public Index(com.ringcentral.paths.teammessaging.Index parent) {
        this.parent = parent;
        this.rc = parent.rc;
    }

    public String path() {
        return parent.path() + "/v1";
    }


    public com.ringcentral.paths.teammessaging.v1.tasks.Index tasks() {
        return this.tasks(null);
    }

    public com.ringcentral.paths.teammessaging.v1.tasks.Index tasks(String taskId) {
        return new com.ringcentral.paths.teammessaging.v1.tasks.Index(this, taskId);
    }


    public com.ringcentral.paths.teammessaging.v1.chats.Index chats() {
        return this.chats(null);
    }

    public com.ringcentral.paths.teammessaging.v1.chats.Index chats(String chatId) {
        return new com.ringcentral.paths.teammessaging.v1.chats.Index(this, chatId);
    }


    public com.ringcentral.paths.teammessaging.v1.teams.Index teams() {
        return this.teams(null);
    }

    public com.ringcentral.paths.teammessaging.v1.teams.Index teams(String chatId) {
        return new com.ringcentral.paths.teammessaging.v1.teams.Index(this, chatId);
    }


    public com.ringcentral.paths.teammessaging.v1.notes.Index notes() {
        return this.notes(null);
    }

    public com.ringcentral.paths.teammessaging.v1.notes.Index notes(String noteId) {
        return new com.ringcentral.paths.teammessaging.v1.notes.Index(this, noteId);
    }


    public com.ringcentral.paths.teammessaging.v1.files.Index files() {
        return new com.ringcentral.paths.teammessaging.v1.files.Index(this);
    }


    public com.ringcentral.paths.teammessaging.v1.groups.Index groups() {
        return this.groups(null);
    }

    public com.ringcentral.paths.teammessaging.v1.groups.Index groups(String groupId) {
        return new com.ringcentral.paths.teammessaging.v1.groups.Index(this, groupId);
    }


    public com.ringcentral.paths.teammessaging.v1.recent.Index recent() {
        return new com.ringcentral.paths.teammessaging.v1.recent.Index(this);
    }


    public com.ringcentral.paths.teammessaging.v1.events.Index events() {
        return this.events(null);
    }

    public com.ringcentral.paths.teammessaging.v1.events.Index events(String eventId) {
        return new com.ringcentral.paths.teammessaging.v1.events.Index(this, eventId);
    }


    public com.ringcentral.paths.teammessaging.v1.persons.Index persons() {
        return this.persons(null);
    }

    public com.ringcentral.paths.teammessaging.v1.persons.Index persons(String personId) {
        return new com.ringcentral.paths.teammessaging.v1.persons.Index(this, personId);
    }


    public com.ringcentral.paths.teammessaging.v1.webhooks.Index webhooks() {
        return this.webhooks(null);
    }

    public com.ringcentral.paths.teammessaging.v1.webhooks.Index webhooks(String webhookId) {
        return new com.ringcentral.paths.teammessaging.v1.webhooks.Index(this, webhookId);
    }


    public com.ringcentral.paths.teammessaging.v1.everyone.Index everyone() {
        return new com.ringcentral.paths.teammessaging.v1.everyone.Index(this);
    }


    public com.ringcentral.paths.teammessaging.v1.companies.Index companies() {
        return this.companies(null);
    }

    public com.ringcentral.paths.teammessaging.v1.companies.Index companies(String companyId) {
        return new com.ringcentral.paths.teammessaging.v1.companies.Index(this, companyId);
    }


    public com.ringcentral.paths.teammessaging.v1.favorites.Index favorites() {
        return new com.ringcentral.paths.teammessaging.v1.favorites.Index(this);
    }


    public com.ringcentral.paths.teammessaging.v1.dataexport.Index dataExport() {
        return this.dataExport(null);
    }

    public com.ringcentral.paths.teammessaging.v1.dataexport.Index dataExport(String taskId) {
        return new com.ringcentral.paths.teammessaging.v1.dataexport.Index(this, taskId);
    }


    public com.ringcentral.paths.teammessaging.v1.conversations.Index conversations() {
        return this.conversations(null);
    }

    public com.ringcentral.paths.teammessaging.v1.conversations.Index conversations(String chatId) {
        return new com.ringcentral.paths.teammessaging.v1.conversations.Index(this, chatId);
    }


    public com.ringcentral.paths.teammessaging.v1.adaptivecards.Index adaptiveCards() {
        return this.adaptiveCards(null);
    }

    public com.ringcentral.paths.teammessaging.v1.adaptivecards.Index adaptiveCards(String cardId) {
        return new com.ringcentral.paths.teammessaging.v1.adaptivecards.Index(this, cardId);
    }

}
