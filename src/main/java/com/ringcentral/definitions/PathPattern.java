package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PathPattern
{
    //
    public String regex;
    public PathPattern regex(String regex) {
        this.regex = regex;
        return this;
    }
    //
    public Long[] groupIndexes;
    public PathPattern groupIndexes(Long[] groupIndexes) {
        this.groupIndexes = groupIndexes;
        return this;
    }
    //
    public UriTemplate template;
    public PathPattern template(UriTemplate template) {
        this.template = template;
        return this;
    }
}
