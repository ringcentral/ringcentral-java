package com.ringcentral.definitions;

public class ProfileImageInfo {
    // Link to a profile image. If an image is not uploaded for an extension, only uri is returned
    public String uri;
    // Identifier of an image
    public String etag;
    // The datetime when an image was last updated in ISO 8601 format, for example 2016-03-10T18:07:52.534Z
    public String lastModified;
    // The type of an image
    public String contentType;
    // List of URIs to profile images in different dimensions
    public ImageUri[] scales;
}
