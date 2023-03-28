package com.ringcentral.definitions;


public class ScimSchemaAttribute {
    /**
     * The name of the attribute
     * Required
     */
    public String name;
    /**
     * Required
     * Enum: string, boolean, decimal, integer, dateTime, reference, complex
     */
    public String type;
    /**
     *
     */
    public ScimSchemaAttribute[] subAttributes;
    /**
     * A Boolean value indicating the attribute&#039;s plurality
     * Required
     */
    public Boolean multiValued;
    /**
     * The description of the attribute
     */
    public String description;
    /**
     * Required
     */
    public Boolean required;
    /**
     * A collection of suggested canonical values
     */
    public String[] canonicalValues;
    /**
     *
     */
    public Boolean caseExact;
    /**
     * Indicates the circumstances under which the value of the attribute can be (re)defined
     * Required
     * Enum: readOnly, readWrite, immutable, writeOnly
     */
    public String mutability;
    /**
     * Indicates when an attribute and associated values are returned
     * Required
     * Enum: always, never, default, request
     */
    public String returned;
    /**
     * Specifies how the service provider enforces uniqueness of attribute values
     * Required
     * Enum: none, server, global
     */
    public String uniqueness;
    /**
     * Indicates the SCIM resource types that be referenced
     */
    public String[] referenceTypes;

    public ScimSchemaAttribute name(String name) {
        this.name = name;
        return this;
    }

    public ScimSchemaAttribute type(String type) {
        this.type = type;
        return this;
    }

    public ScimSchemaAttribute subAttributes(ScimSchemaAttribute[] subAttributes) {
        this.subAttributes = subAttributes;
        return this;
    }

    public ScimSchemaAttribute multiValued(Boolean multiValued) {
        this.multiValued = multiValued;
        return this;
    }

    public ScimSchemaAttribute description(String description) {
        this.description = description;
        return this;
    }

    public ScimSchemaAttribute required(Boolean required) {
        this.required = required;
        return this;
    }

    public ScimSchemaAttribute canonicalValues(String[] canonicalValues) {
        this.canonicalValues = canonicalValues;
        return this;
    }

    public ScimSchemaAttribute caseExact(Boolean caseExact) {
        this.caseExact = caseExact;
        return this;
    }

    public ScimSchemaAttribute mutability(String mutability) {
        this.mutability = mutability;
        return this;
    }

    public ScimSchemaAttribute returned(String returned) {
        this.returned = returned;
        return this;
    }

    public ScimSchemaAttribute uniqueness(String uniqueness) {
        this.uniqueness = uniqueness;
        return this;
    }

    public ScimSchemaAttribute referenceTypes(String[] referenceTypes) {
        this.referenceTypes = referenceTypes;
        return this;
    }
}
