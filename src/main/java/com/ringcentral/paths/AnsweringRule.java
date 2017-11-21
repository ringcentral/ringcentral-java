package com.ringcentral.paths;
import com.ringcentral.Path;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;
import com.ringcentral.PathSegment;
public class AnsweringRule extends Path {
    public AnsweringRule (RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "answering-rule", id);
    }
    public static class GetParameters
    {
        //
        public String page;
        public GetParameters page(String page) {
            this.page = page;
            return this;
        }
        //
        public String perPage;
        public GetParameters perPage(String perPage) {
            this.perPage = perPage;
            return this;
        }
    }
}
