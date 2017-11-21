package com.ringcentral.definitions;
import com.alibaba.fastjson.annotation.JSONField;
public class TransitionInfo
{
    // Supported for account confirmation. Specifies whether welcome email is sent. The default value is 'True'
    public Boolean sendWelcomeEmail;
    public TransitionInfo sendWelcomeEmail(Boolean sendWelcomeEmail) {
        this.sendWelcomeEmail = sendWelcomeEmail;
        return this;
    }
    // Supported for account activation. Specifies whether confirmation email is sent. The default value is 'True'
    public Boolean sendConfirmationEmail;
    public TransitionInfo sendConfirmationEmail(Boolean sendConfirmationEmail) {
        this.sendConfirmationEmail = sendConfirmationEmail;
        return this;
    }
    // Specifies whether devices are shipped after successful account confirmation. The default value is 'True'
    public Boolean shipDevices;
    public TransitionInfo shipDevices(Boolean shipDevices) {
        this.shipDevices = shipDevices;
        return this;
    }
    // Supported for account confirmation. Activation email hash code
    public String activationEmailHash;
    public TransitionInfo activationEmailHash(String activationEmailHash) {
        this.activationEmailHash = activationEmailHash;
        return this;
    }
}
