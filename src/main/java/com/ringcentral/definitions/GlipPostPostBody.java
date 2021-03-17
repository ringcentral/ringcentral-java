package com.ringcentral.definitions;


    // Post data. At least one attribute should be provided (text or attachments)
public class GlipPostPostBody
{
    /**
         * Text of a post. Maximum length is 10000 symbols. Mentions can be added in .md format `! [:Type] (id)`
         */
        public String text;
  public GlipPostPostBody text(String text)
  {
    this.text = text;
    return this;
  }
  

        /**
         * Identifier(s) of attachments. Maximum number of attachments is 25
         */
        public GlipAttachmentInfoRequest[] attachments;
  public GlipPostPostBody attachments(GlipAttachmentInfoRequest[] attachments)
  {
    this.attachments = attachments;
    return this;
  }
  
}
