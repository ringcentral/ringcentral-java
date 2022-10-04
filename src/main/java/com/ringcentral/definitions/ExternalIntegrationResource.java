package com.ringcentral.definitions;


public class ExternalIntegrationResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String typeId;
    /**
     *
     */
    public String type;
    /**
     *
     */
    public String displayName;
    /**
     *
     */
    public String outboundEdgeId;

    public ExternalIntegrationResource id(String id) {
        this.id = id;
        return this;
    }

    public ExternalIntegrationResource typeId(String typeId) {
        this.typeId = typeId;
        return this;
    }

    public ExternalIntegrationResource type(String type) {
        this.type = type;
        return this;
    }

    public ExternalIntegrationResource displayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    public ExternalIntegrationResource outboundEdgeId(String outboundEdgeId) {
        this.outboundEdgeId = outboundEdgeId;
        return this;
    }
}
