package com.ringcentral.definitions;


public class CurrencyResource {
    /**
     *
     */
    public String id;
    /**
     *
     */
    public String code;
    /**
     *
     */
    public String name;
    /**
     *
     */
    public String symbol;
    /**
     *
     */
    public String minorSymbol;

    public CurrencyResource id(String id) {
        this.id = id;
        return this;
    }

    public CurrencyResource code(String code) {
        this.code = code;
        return this;
    }

    public CurrencyResource name(String name) {
        this.name = name;
        return this;
    }

    public CurrencyResource symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public CurrencyResource minorSymbol(String minorSymbol) {
        this.minorSymbol = minorSymbol;
        return this;
    }
}
