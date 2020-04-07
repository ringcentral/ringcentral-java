package com.ringcentral.paths.restapi.glip.chats.notes

class Index(val parent: com.ringcentral.paths.restapi.glip.chats.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/notes"
        }

      /**
       * Operation: Create Note
       * Http Post /restapi/v1.0/glip/chats/{chatId}/notes
       */
      fun post(glipNoteCreate: com.ringcentral.definitions.GlipNoteCreate) : com.ringcentral.definitions.GlipNoteInfo?
      {
        val rb: okhttp3.ResponseBody = rc.post(this.path(), glipNoteCreate)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipNoteInfo::class.java)
      
    }
    

      /**
       * Operation: Get Chat Notes
       * Http Get /restapi/v1.0/glip/chats/{chatId}/notes
       */
      @JvmOverloads fun get(queryParams: com.ringcentral.definitions.ListChatNotesParameters? = null) : com.ringcentral.definitions.GlipNotesInfo?
      {
        val rb: okhttp3.ResponseBody = rc.get(this.path(), queryParams)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipNotesInfo::class.java)
      
    }
    
}
