package com.ringcentral.paths;

import com.ringcentral.RequestParameters;
import com.ringcentral.definitions.CallerInfo;

public class CompanyPager {
    public static class PostParameters implements RequestParameters {
        // Sender of a pager message. The extensionNumber property must be filled
        public CallerInfo from;
        // Internal identifier of a message this message replies to
        public Long replyOn;
        // Text of a pager message. Max length is 1024 symbols (2-byte UTF-16 encoded). If a character is encoded in 4 bytes in UTF-16 it is treated as 2 characters, thus restricting the maximum message length to 512 symbols
        public String text;
        // Optional if replyOn parameter is specified. Receiver of a pager message. The extensionNumber property must be filled
        public CallerInfo[] to;

        public PostParameters from(CallerInfo from) {
            this.from = from;
            return this;
        }

        public PostParameters replyOn(Long replyOn) {
            this.replyOn = replyOn;
            return this;
        }

        public PostParameters text(String text) {
            this.text = text;
            return this;
        }

        public PostParameters to(CallerInfo[] to) {
            this.to = to;
            return this;
        }
    }
}
