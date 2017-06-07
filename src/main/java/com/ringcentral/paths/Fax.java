package com.ringcentral.paths;

import com.ringcentral.Path;
import com.ringcentral.PathSegment;
import com.ringcentral.RestClient;
import com.ringcentral.definitions.CallerInfo;

public class Fax extends Path {
    public Fax(RestClient restClient, PathSegment parent, String id) {
        this.restClient = restClient;
        pathSegment = new PathSegment(parent, "fax", id);
    }

    public static class PostParameters {
        // Recipient information. Phone number property is mandatory. Optional for resend fax request
        public CallerInfo[] to;
        // Fax resolution
        public String faxResolution;
        // The datetime to send fax at, in ISO 8601 format including timezone, for example 2016-03-10T18:07:52.534Z. If time is not specified, the fax will be send immediately
        public String sendTime;
        // Optional. Cover page index. If not specified, the default cover page which is configured in "Outbound Fax Settings" is attached. See also 'Available Cover Pages' table below
        public Long coverIndex;
        // Optional. Cover page text, entered by the fax sender and printed on the cover page. Maximum length is limited to 1024 symbols
        public String coverPageText;
        // Internal identifier of the original fax message which needs to be resent. Mandatory for resend fax request
        public String originalMessageId;

        public PostParameters to(CallerInfo[] to) {
            this.to = to;
            return this;
        }

        public PostParameters faxResolution(String faxResolution) {
            this.faxResolution = faxResolution;
            return this;
        }

        public PostParameters sendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }

        public PostParameters coverIndex(Long coverIndex) {
            this.coverIndex = coverIndex;
            return this;
        }

        public PostParameters coverPageText(String coverPageText) {
            this.coverPageText = coverPageText;
            return this;
        }

        public PostParameters originalMessageId(String originalMessageId) {
            this.originalMessageId = originalMessageId;
            return this;
        }
    }
}
