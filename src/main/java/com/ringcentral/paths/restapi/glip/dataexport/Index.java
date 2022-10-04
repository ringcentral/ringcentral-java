package com.ringcentral.paths.restapi.glip.dataexport;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.Index parent;
    public String taskId;

    public Index(com.ringcentral.paths.restapi.glip.Index parent, String taskId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.taskId = taskId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && taskId != null) {
            return parent.path() + "/data-export/" + taskId;
        }
        return parent.path() + "/data-export";
    }

    public String path() {
        return path(true);
    }


    public com.ringcentral.paths.restapi.glip.dataexport.datasets.Index datasets() {
        return this.datasets(null);
    }

    public com.ringcentral.paths.restapi.glip.dataexport.datasets.Index datasets(String datasetId) {
        return new com.ringcentral.paths.restapi.glip.dataexport.datasets.Index(this, datasetId);
    }

}
