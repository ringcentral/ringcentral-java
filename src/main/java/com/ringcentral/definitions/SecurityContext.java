package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class SecurityContext
{
    //
    public Principal userPrincipal;
    public SecurityContext userPrincipal(Principal userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }
    //
    public Boolean secure;
    public SecurityContext secure(Boolean secure) {
        this.secure = secure;
        return this;
    }
    //
    public String authenticationScheme;
    public SecurityContext authenticationScheme(String authenticationScheme) {
        this.authenticationScheme = authenticationScheme;
        return this;
    }
}
