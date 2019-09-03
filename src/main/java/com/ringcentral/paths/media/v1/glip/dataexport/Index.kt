package com.ringcentral.paths.media.v1.glip.dataexport

class Index(val parent: com.ringcentral.paths.media.v1.glip.Index, val taskId: String? = null) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && taskId != null)
            {
                return "${parent.path()}/data-export/${taskId}"
            }

            return "${parent.path()}/data-export"
        }


      @JvmOverloads fun archive(archiveId: String? = null) : com.ringcentral.paths.media.v1.glip.dataexport.archive.Index
      {
        return com.ringcentral.paths.media.v1.glip.dataexport.archive.Index(this, archiveId)
      }
    
}