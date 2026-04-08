package com.ringcentral.definitions;


    /**
* Duration bounds for the segment
*/
public class CallSegmentLengthFilter
{
    /**
     * Minimum duration of segment in seconds
     * Format: int64
     */
    public Long minSeconds;
    public CallSegmentLengthFilter minSeconds(Long minSeconds)
    {
        this.minSeconds = minSeconds;
        return this;
    }

    /**
     * Maximum duration of segment in seconds
     * Format: int64
     */
    public Long maxSeconds;
    public CallSegmentLengthFilter maxSeconds(Long maxSeconds)
    {
        this.maxSeconds = maxSeconds;
        return this;
    }
}