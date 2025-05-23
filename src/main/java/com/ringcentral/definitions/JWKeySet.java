package com.ringcentral.definitions;


public class JWKeySet {
    /**
     * Required
     */
    public JWKey[] keys;

    public JWKeySet keys(JWKey[] keys) {
        this.keys = keys;
        return this;
    }
}
