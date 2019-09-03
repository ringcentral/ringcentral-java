package com.ringcentral.paths.media.v1.glip.dataexport.archive

class Index(val parent: com.ringcentral.paths.media.v1.glip.dataexport.Index, val archiveId: String? = null) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && archiveId != null)
            {
                return "${parent.path()}/archive/${archiveId}"
            }

            return "${parent.path()}/archive"
        }

      /**
       * Operation: Get Glip Data Archive
       * Http Get /media/v1/glip/data-export/{taskId}/archive/{archiveId}
       */
      fun get() : ByteArray?
      {
          if (this.archiveId == null)
          {
              throw NullPointerException("archiveId");
          }

        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return rb.bytes()
        
    }
    
}
