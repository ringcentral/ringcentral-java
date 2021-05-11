package com.ringcentral.paths.restapi.glip.dataexport.datasets;

import com.ringcentral.RestClient;

public class Index {
    public RestClient rc;
    public com.ringcentral.paths.restapi.glip.dataexport.Index parent;
    public String datasetId;

    public Index(com.ringcentral.paths.restapi.glip.dataexport.Index parent, String datasetId) {
        this.parent = parent;
        this.rc = parent.rc;
        this.datasetId = datasetId;
    }

    public String path(Boolean withParameter) {
        if (withParameter && datasetId != null) {
            return parent.path() + "/datasets/" + datasetId;
        }
        return parent.path() + "/datasets";
    }

    public String path() {
        return path(true);
    }

    /**
     * Returns the specified dataset by ID. Each dataset is a ZIP archive the size of which is limited to 1 Gb.
     * HTTP Method: get
     * Endpoint: /restapi/{apiVersion}/glip/data-export/{taskId}/datasets/{datasetId}
     * Rate Limit Group: Heavy
     * App Permission: Glip
     */
    public byte[] get() throws com.ringcentral.RestException, java.io.IOException {
        if (datasetId == null) {
            throw new IllegalArgumentException("Parameter datasetId cannot be null");
        }
        okhttp3.ResponseBody rb = this.rc.get(this.path(), null);
        return rb.bytes();
    }
}
