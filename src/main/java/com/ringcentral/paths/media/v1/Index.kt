package com.ringcentral.paths.media.v1

class Index(val parent: com.ringcentral.paths.media.Index) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(): String
        {
            return "${parent.path()}/v1"
        }


      fun glip() : com.ringcentral.paths.media.v1.glip.Index
      {
        return com.ringcentral.paths.media.v1.glip.Index(this)
      }
    
}