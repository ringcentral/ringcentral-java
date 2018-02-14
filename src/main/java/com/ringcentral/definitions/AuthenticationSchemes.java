package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class AuthenticationSchemes
{
    //
    public AuthenticationScheme[] authenticationSchemes;
    public AuthenticationSchemes authenticationSchemes(AuthenticationScheme[] authenticationSchemes) {
        this.authenticationSchemes = authenticationSchemes;
        return this;
    }
}
