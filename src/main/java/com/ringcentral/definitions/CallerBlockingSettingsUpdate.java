package com.ringcentral.definitions;


    /**
* Returns the lists of blocked and allowed phone numbers
*/
public class CallerBlockingSettingsUpdate
{
    /**
     * Call blocking options: either specific or all calls and faxes
     * Enum: Specific, All
     */
    public String mode;
    public CallerBlockingSettingsUpdate mode(String mode)
    {
        this.mode = mode;
        return this;
    }

    /**
     * Determines how to handle calls with no caller ID in &#039;Specific&#039; mode
     * Enum: BlockCallsAndFaxes, BlockFaxes, Allow
     */
    public String noCallerId;
    public CallerBlockingSettingsUpdate noCallerId(String noCallerId)
    {
        this.noCallerId = noCallerId;
        return this;
    }

    /**
     * Blocking settings for pay phones
     * Enum: Block, Allow
     */
    public String payPhones;
    public CallerBlockingSettingsUpdate payPhones(String payPhones)
    {
        this.payPhones = payPhones;
        return this;
    }

    /**
     * List of greetings played for blocked callers
     */
    public BlockedCallerGreetingInfo[] greetings;
    public CallerBlockingSettingsUpdate greetings(BlockedCallerGreetingInfo[] greetings)
    {
        this.greetings = greetings;
        return this;
    }
}