package com.ringcentral.definitions;


// Returns the lists of blocked and allowed phone numbers
public class CallerBlockingSettings {
    /**
     * Call blocking options: either specific or all calls and faxes
     * Enum: Specific, All
     */
    public String mode;
    /**
     * Determines how to handle calls with no caller ID in 'Specific' mode
     * Enum: BlockCallsAndFaxes, BlockFaxes, Allow
     */
    public String noCallerId;
    /**
     * Blocking settings for pay phones
     * Enum: Block, Allow
     */
    public String payPhones;
    /**
     * List of greetings played for blocked callers
     */
    public BlockedCallerGreetingInfo[] greetings;

    public CallerBlockingSettings mode(String mode) {
        this.mode = mode;
        return this;
    }

    public CallerBlockingSettings noCallerId(String noCallerId) {
        this.noCallerId = noCallerId;
        return this;
    }

    public CallerBlockingSettings payPhones(String payPhones) {
        this.payPhones = payPhones;
        return this;
    }

    public CallerBlockingSettings greetings(BlockedCallerGreetingInfo[] greetings) {
        this.greetings = greetings;
        return this;
    }

}
