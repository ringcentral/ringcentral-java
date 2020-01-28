package com.ringcentral.paths.restapi.glip.dataexport.datasets

class Index(val parent: com.ringcentral.paths.restapi.glip.dataexport.Index, val datasetId: String? = null) {
    var rc: com.ringcentral.RestClient = parent.rc


    fun path(withParameter: Boolean = true): String {
        if (withParameter && datasetId != null) {
            return "${parent.path()}/datasets/${datasetId}"
        }

        return "${parent.path()}/datasets"
    }

    /**
     * Operation: Get Data Export Task Dataset
     * Http Get /restapi/v1.0/glip/data-export/{taskId}/datasets/{datasetId}
     */
    fun get(): ByteArray? {
        if (this.datasetId == null) {
            throw NullPointerException("datasetId");
        }

        val rb: okhttp3.ResponseBody = rc.get(this.path())

        return rb.bytes()

    }

}
