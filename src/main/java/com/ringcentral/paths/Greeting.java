package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.CustomGreetingInfo_AnsweringRuleInfo;

public class Greeting {
    private PathSegment pathSegment;

    public Greeting(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "greeting", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class PostParameters {
        // Type of a greeting, specifying the case when the greeting is played. See also Greeting Types
        public String type;
        // Information on an answering rule that the greeting is applied to
        public CustomGreetingInfo_AnsweringRuleInfo answeringRule;

        public PostParameters type(String type) {
            this.type = type;
            return this;
        }

        public PostParameters answeringRule(CustomGreetingInfo_AnsweringRuleInfo answeringRule) {
            this.answeringRule = answeringRule;
            return this;
        }
    }
}
