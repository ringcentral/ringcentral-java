package com.ringcentral.definitions;


public class ExternalIntegrationResource
{
    /**
     * Example: 9813
     */
    public String id;
    public ExternalIntegrationResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     * Example: 1
     */
    public String typeId;
    public ExternalIntegrationResource typeId(String typeId)
    {
        this.typeId = typeId;
        return this;
    }

    /**
     * Example: External
     */
    public String type;
    public ExternalIntegrationResource type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     * Example: Integration X
     */
    public String displayName;
    public ExternalIntegrationResource displayName(String displayName)
    {
        this.displayName = displayName;
        return this;
    }

    /**
     * Example: 1726
     */
    public String outboundEdgeId;
    public ExternalIntegrationResource outboundEdgeId(String outboundEdgeId)
    {
        this.outboundEdgeId = outboundEdgeId;
        return this;
    }
}