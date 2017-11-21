package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class PatternWithGroups
{
    //
    public String regex;
    public PatternWithGroups regex(String regex) {
        this.regex = regex;
        return this;
    }
    //
    public Long[] groupIndexes;
    public PatternWithGroups groupIndexes(Long[] groupIndexes) {
        this.groupIndexes = groupIndexes;
        return this;
    }
}
