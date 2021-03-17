package com.ringcentral.paths.restapi.glip.notes

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val noteId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && noteId != null) {
            return "${parent.path()}/notes/${noteId}"
        }

        return "${parent.path()}/notes"
    }

    /**
     * Operation: Get Note
     * Http Get /restapi/v1.0/glip/notes/{noteId}
     */
    fun get(): com.ringcentral.definitions.GetGlipNoteInfo? {
        if (this.noteId == null) {
            throw NullPointerException("noteId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GetGlipNoteInfo::class.java)

    }


    /**
     * Operation: Delete Note
     * Http Delete /restapi/v1.0/glip/notes/{noteId}
     */
    fun delete(): String? {
        if (this.noteId == null) {
            throw NullPointerException("noteId");
        }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())

        return rb.string()

    }


    /**
     * Operation: Update Note
     * Http Patch /restapi/v1.0/glip/notes/{noteId}
     */
    fun patch(glipNoteCreate: com.ringcentral.definitions.GlipNoteCreate): com.ringcentral.definitions.GlipNoteInfo? {
        if (this.noteId == null) {
            throw NullPointerException("noteId");
        }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), glipNoteCreate)

        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipNoteInfo::class.java)

    }


    fun lock(): com.ringcentral.paths.restapi.glip.notes.lock.Index {
        return com.ringcentral.paths.restapi.glip.notes.lock.Index(this)
    }


    fun unlock(): com.ringcentral.paths.restapi.glip.notes.unlock.Index {
        return com.ringcentral.paths.restapi.glip.notes.unlock.Index(this)
    }


    fun publish(): com.ringcentral.paths.restapi.glip.notes.publish.Index {
        return com.ringcentral.paths.restapi.glip.notes.publish.Index(this)
    }

}
