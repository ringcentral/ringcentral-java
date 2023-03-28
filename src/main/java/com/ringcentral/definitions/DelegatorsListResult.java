package com.ringcentral.definitions;


public class DelegatorsListResult {
    /**
     *
     */
    public Delegate[] items;

    public DelegatorsListResult items(Delegate[] items) {
        this.items = items;
        return this;
    }
}
