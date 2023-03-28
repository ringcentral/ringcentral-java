package com.ringcentral.definitions;


public class ExternalIntegrationResource {
    /**
     * Example: 9813
     */
    public String id;
    /**
     * Example: 1
     */
    public String typeId;
    /**
     * Example: External
     */
    public String type;
    /**
     * Example: Integration X
     */
    public String displayName;
    /**
     * Example: Account
     */
    public String routingType;
    /**
     * Example: 1726
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

    public ExternalIntegrationResource routingType(String routingType) {
        this.routingType = routingType;
        return this;
    }

    public ExternalIntegrationResource outboundEdgeId(String outboundEdgeId) {
        this.outboundEdgeId = outboundEdgeId;
        return this;
    }
}
