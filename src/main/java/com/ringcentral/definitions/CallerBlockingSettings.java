package com.ringcentral.definitions;


    /**
* Returns the lists of blocked and allowed phone numbers
*/
public class CallerBlockingSettings
{
    /**
     * Call blocking options: either specific or all calls and faxes
     * Enum: Specific, All
     */
    public String mode;
    public CallerBlockingSettings mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     * Determines how to handle calls with no caller ID in `Specific` mode
     * Enum: BlockCallsAndFaxes, BlockFaxes, Allow
     */
    public String noCallerId;
    public CallerBlockingSettings noCallerId(String noCallerId)
    {
        this.noCallerId = noCallerId;
        return this;
    }

    /**
     * Blocking settings for pay phones
     * Enum: Block, Allow
     */
    public String payPhones;
    public CallerBlockingSettings payPhones(String payPhones)
    {
        this.payPhones = payPhones;
        return this;
    }

    /**
     * List of greetings played for blocked callers
     */
    public BlockedCallerGreetingInfo[] greetings;
    public CallerBlockingSettings greetings(BlockedCallerGreetingInfo[] greetings)
    {
        this.greetings = greetings;
        return this;
    }
}