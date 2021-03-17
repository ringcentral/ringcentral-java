package com.ringcentral.definitions;


public class GlipMessageAttachmentFieldsInfo
{
    /**
         * Title of an individual field
         */
        public String title;
  public GlipMessageAttachmentFieldsInfo title(String title)
  {
    this.title = title;
    return this;
  }
  

        /**
         * Value of an individual field (supports Markdown)
         */
        public String value;
  public GlipMessageAttachmentFieldsInfo value(String value)
  {
    this.value = value;
    return this;
  }
  

        /**
         * Style of width span applied to a field
         * Default: Short
         * Enum: Short, Long
         */
        public String style;
  public GlipMessageAttachmentFieldsInfo style(String style)
  {
    this.style = style;
    return this;
  }
  
}
