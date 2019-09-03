package com.ringcentral.paths.media.v1.glip

class Index(val parent: com.ringcentral.paths.media.v1.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/glip"
        }


      @JvmOverloads fun dataexport(taskId: String? = null) : com.ringcentral.paths.media.v1.glip.dataexport.Index
      {
        return com.ringcentral.paths.media.v1.glip.dataexport.Index(this, taskId)
      }
    
}