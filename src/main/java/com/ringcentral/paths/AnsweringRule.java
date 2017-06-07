package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.*;

public class AnsweringRule extends Path {
    public AnsweringRule(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "answering-rule", id);
    }

    public static class PostParameters {
        // Specifies if the rule is active or inactive. The default value is 'True'
        public Boolean enabled;
        // Type of an answering rule, the supported value is 'Custom'
        public String type;
        // Name of an answering rule specified by user. Max number of symbols is 30
        public String name;
        // Answering rule will be applied when calls are received from the specified caller(s)
        public CallersInfo[] callers;
        // Answering rule will be applied when calling the specified number(s)
        public CalledNumberInfo[] calledNumbers;
        // Schedule when an answering rule should be applied
        public AnsweringRule_ScheduleInfo schedule;
        // Specifies how incoming calls should be forwarded. The default value is 'ForwardCalls'
        public String callHandlingAction;
        // Forwarding parameters. If the 'callHandlingAction' parameter value is set to 'ForwardCalls' - should be specified . The settings determine the forwarding numbers to which the call should be forwarded. If not specified in request, then the business-hours forwarding rules are set by default
        public ForwardingInfo forwarding;
        // Unconditional forwarding parameters. If the 'callHandlingAction' parameter value is set to 'UnconditionalForwarding' - should be specified
        public UnconditionalForwardingInfo unconditionalForwarding;
        // Specifies whether to take a voicemail and who should do it
        public VoicemailInfo voiceMail;

        public PostParameters enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public PostParameters type(String type) {
            this.type = type;
            return this;
        }

        public PostParameters name(String name) {
            this.name = name;
            return this;
        }

        public PostParameters callers(CallersInfo[] callers) {
            this.callers = callers;
            return this;
        }

        public PostParameters calledNumbers(CalledNumberInfo[] calledNumbers) {
            this.calledNumbers = calledNumbers;
            return this;
        }

        public PostParameters schedule(AnsweringRule_ScheduleInfo schedule) {
            this.schedule = schedule;
            return this;
        }

        public PostParameters callHandlingAction(String callHandlingAction) {
            this.callHandlingAction = callHandlingAction;
            return this;
        }

        public PostParameters forwarding(ForwardingInfo forwarding) {
            this.forwarding = forwarding;
            return this;
        }

        public PostParameters unconditionalForwarding(UnconditionalForwardingInfo unconditionalForwarding) {
            this.unconditionalForwarding = unconditionalForwarding;
            return this;
        }

        public PostParameters voiceMail(VoicemailInfo voiceMail) {
            this.voiceMail = voiceMail;
            return this;
        }
    }

    public static class ListResponse {
        // Canonical URI of an answering rule resource
        public String uri;
        // List of answering rules
        public AnsweringRuleInfo[] records;
        // Information on paging
        public PagingInfo paging;
        // Information on navigation
        public NavigationInfo navigation;

        public ListResponse uri(String uri) {
            this.uri = uri;
            return this;
        }

        public ListResponse records(AnsweringRuleInfo[] records) {
            this.records = records;
            return this;
        }

        public ListResponse paging(PagingInfo paging) {
            this.paging = paging;
            return this;
        }

        public ListResponse navigation(NavigationInfo navigation) {
            this.navigation = navigation;
            return this;
        }
    }

    public static class PutParameters {
        // Specifies if the answering rule is active or not
        public Boolean enabled;
        // Custom name of an answering rule. The maximum number of characters is 64
        public String name;
        // Forwarding parameters. Returned if 'ForwardCalls' is specified in 'callHandlingAction'. These settings determine the forwarding numbers to which the call will be forwarded
        public ForwardingInfo forwarding;
        // Predefined greetings applied for an answering rule
        public GreetingInfo[] greetings;

        public PutParameters enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public PutParameters name(String name) {
            this.name = name;
            return this;
        }

        public PutParameters forwarding(ForwardingInfo forwarding) {
            this.forwarding = forwarding;
            return this;
        }

        public PutParameters greetings(GreetingInfo[] greetings) {
            this.greetings = greetings;
            return this;
        }
    }
}
