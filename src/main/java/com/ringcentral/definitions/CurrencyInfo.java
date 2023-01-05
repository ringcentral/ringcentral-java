package com.ringcentral.definitions;


    /**
* Currency information
*/
public class CurrencyInfo
{
    /**
     * Internal identifier of a currency
     * Format: int64
     */
    public Long id;
    public CurrencyInfo id(Long id)
    {
        this.id = id;
        return this;
    }

    /**
     * Official code of a currency
     */
    public String code;
    public CurrencyInfo code(String code)
    {
        this.code = code;
        return this;
    }

    /**
     * Official name of a currency
     */
    public String name;
    public CurrencyInfo name(String name)
    {
        this.name = name;
        return this;
    }

    /**
     * Graphic symbol of a currency
     */
    public String symbol;
    public CurrencyInfo symbol(String symbol)
    {
        this.symbol = symbol;
        return this;
    }

    /**
     * Minor graphic symbol of a currency
     */
    public String minorSymbol;
    public CurrencyInfo minorSymbol(String minorSymbol)
    {
        this.minorSymbol = minorSymbol;
        return this;
    }
}