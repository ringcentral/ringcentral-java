package com.ringcentral.definitions;


public class CurrencyResource
{
    /**
     */
    public String id;
    public CurrencyResource id(String id)
    {
        this.id = id;
        return this;
    }

    /**
     */
    public String code;
    public CurrencyResource code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     */
    public String name;
    public CurrencyResource name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     */
    public String symbol;
    public CurrencyResource symbol(String symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     */
    public String minorSymbol;
    public CurrencyResource minorSymbol(String minorSymbol)
    {
        this.minorSymbol = minorSymbol;
        return this;
    }
}