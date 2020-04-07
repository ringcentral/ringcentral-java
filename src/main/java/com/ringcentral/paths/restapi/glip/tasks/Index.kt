package com.ringcentral.paths.restapi.glip.tasks

class Index(val parent: com.ringcentral.paths.restapi.glip.Index, val taskId: String? = null) {
      var rc: com.ringcentral.RestClient = parent.rc
    

        fun path(withParameter: Boolean = true): String
        {
            if (withParameter && taskId != null)
            {
                return "${parent.path()}/tasks/${taskId}"
            }

            return "${parent.path()}/tasks"
        }

      /**
       * Operation: Get Task
       * Http Get /restapi/v1.0/glip/tasks/{taskId}
       */
      fun get() : com.ringcentral.definitions.GlipTaskInfo?
      {
          if (this.taskId == null)
          {
              throw NullPointerException("taskId");
          }

        val rb: okhttp3.ResponseBody = rc.get(this.path())
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipTaskInfo::class.java)
      
    }
    

      /**
       * Operation: Patch Task
       * Http Patch /restapi/v1.0/glip/tasks/{taskId}
       */
      fun patch(glipUpdateTask: com.ringcentral.definitions.GlipUpdateTask) : com.ringcentral.definitions.GlipTaskList?
      {
          if (this.taskId == null)
          {
              throw NullPointerException("taskId");
          }

        val rb: okhttp3.ResponseBody = rc.patch(this.path(), glipUpdateTask)
        
        return com.ringcentral.Utils.gson.fromJson(rb.string(), com.ringcentral.definitions.GlipTaskList::class.java)
      
    }
    

      /**
       * Operation: Delete Task
       * Http Delete /restapi/v1.0/glip/tasks/{taskId}
       */
      fun delete() : String?
      {
          if (this.taskId == null)
          {
              throw NullPointerException("taskId");
          }

        val rb: okhttp3.ResponseBody = rc.delete(this.path())
        
        return rb.string()
        
    }
    


      fun complete() : com.ringcentral.paths.restapi.glip.tasks.complete.Index
      {
        return com.ringcentral.paths.restapi.glip.tasks.complete.Index(this)
      }
    
}