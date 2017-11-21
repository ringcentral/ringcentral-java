package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class IvrPrompts extends Path {
    public IvrPrompts (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "ivr-prompts", id);
    }
    public Content content(String id)
    {
        return new Content(restClient, pathSegment, id);
    }
    public Content content()
    {
        return new Content(restClient, pathSegment, null);
    }
}
