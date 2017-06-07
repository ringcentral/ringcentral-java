package com.ringcentral.paths;

import com.ringcentral.PathSegment;
import com.ringcentral.definitions.CallerInfo;

public class Sms {
    private PathSegment pathSegment;

    public Sms(PathSegment parent, String id) {
        pathSegment = new PathSegment(parent, "sms", id);
    }

    public String endpoint() {
        return pathSegment.endpoint();
    }

    public static class PostParameters {
        // Sender of an SMS message. The phoneNumber property must be filled to correspond to one of the account phone numbers which is allowed to send SMS
        public CallerInfo from;
        // Receiver of an SMS message. The phoneNumber property must be filled
        public CallerInfo[] to;
        // Text of a message. Max length is 1000 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 500 symbols
        public String text;

        public PostParameters from(CallerInfo from) {
            this.from = from;
            return this;
        }

        public PostParameters to(CallerInfo[] to) {
            this.to = to;
            return this;
        }

        public PostParameters text(String text) {
            this.text = text;
            return this;
        }
    }
}
