package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class Currency
{
    //
    public String id;
    public Currency id(String id) {
        this.id = id;
        return this;
    }
    //
    public String code;
    public Currency code(String code) {
        this.code = code;
        return this;
    }
    //
    public String name;
    public Currency name(String name) {
        this.name = name;
        return this;
    }
    //
    public String symbol;
    public Currency symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }
    //
    public String minorSymbol;
    public Currency minorSymbol(String minorSymbol) {
        this.minorSymbol = minorSymbol;
        return this;
    }
}
