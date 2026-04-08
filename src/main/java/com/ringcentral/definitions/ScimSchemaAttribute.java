package com.ringcentral.definitions;


public class ScimSchemaAttribute
{
    /**
     * The name of the attribute
     * Required
     */
    public String name;
    public ScimSchemaAttribute name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Required
     * Enum: string, boolean, decimal, integer, dateTime, reference, complex
     */
    public String type;
    public ScimSchemaAttribute type(String type)
    {
        this.type = type;
        return this;
    }

    /**
     */
    public ScimSchemaAttribute[] subAttributes;
    public ScimSchemaAttribute subAttributes(ScimSchemaAttribute[] subAttributes)
    {
        this.subAttributes = subAttributes;
        return this;
    }

    /**
     * A Boolean value indicating the attribute&#039;s plurality
     * Required
     */
    public Boolean multiValued;
    public ScimSchemaAttribute multiValued(Boolean multiValued)
    {
        this.multiValued = multiValued;
        return this;
    }

    /**
     * The description of the attribute
     */
    public String description;
    public ScimSchemaAttribute description(String description)
    {
        this.description = description;
        return this;
    }

    /**
     * Required
     */
    public Boolean required;
    public ScimSchemaAttribute required(Boolean required)
    {
        this.required = required;
        return this;
    }

    /**
     * A collection of suggested canonical values
     */
    public String[] canonicalValues;
    public ScimSchemaAttribute canonicalValues(String[] canonicalValues)
    {
        this.canonicalValues = canonicalValues;
        return this;
    }

    /**
     */
    public Boolean caseExact;
    public ScimSchemaAttribute caseExact(Boolean caseExact)
    {
        this.caseExact = caseExact;
        return this;
    }

    /**
     * Indicates the circumstances under which the value of the attribute can be (re)defined
     * Required
     * Enum: readOnly, readWrite, immutable, writeOnly
     */
    public String mutability;
    public ScimSchemaAttribute mutability(String mutability)
    {
        this.mutability = mutability;
        return this;
    }

    /**
     * Indicates when an attribute and associated values are returned
     * Required
     * Enum: always, never, default, request
     */
    public String returned;
    public ScimSchemaAttribute returned(String returned)
    {
        this.returned = returned;
        return this;
    }

    /**
     * Specifies how the service provider enforces uniqueness of attribute values
     * Required
     * Enum: none, server, global
     */
    public String uniqueness;
    public ScimSchemaAttribute uniqueness(String uniqueness)
    {
        this.uniqueness = uniqueness;
        return this;
    }

    /**
     * Indicates the SCIM resource types that be referenced
     */
    public String[] referenceTypes;
    public ScimSchemaAttribute referenceTypes(String[] referenceTypes)
    {
        this.referenceTypes = referenceTypes;
        return this;
    }
}