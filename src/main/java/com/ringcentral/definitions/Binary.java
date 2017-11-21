package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Binary
{
    // Required Binary Data
    public String data;
    public Binary data(String data) {
        this.data = data;
        return this;
    }
}
