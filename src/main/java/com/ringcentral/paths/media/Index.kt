package com.ringcentral.paths.media

class Index(val rc: com.ringcentral.RestClient) {
      
    

        fun path(): String
        {
            return "/media"
        }


      fun v1() : com.ringcentral.paths.media.v1.Index
      {
        return com.ringcentral.paths.media.v1.Index(this)
      }
    
}