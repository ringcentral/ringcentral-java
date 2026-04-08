package com.ringcentral.definitions;

public class WordTimingsUnit {
    /** Format: float Example: 0.3 */
    public Double start;

    public WordTimingsUnit start(Double start) {
        this.start = start;
        return this;
    }

    /** Format: float Example: 5.1 */
    public Double end;

    public WordTimingsUnit end(Double end) {
        this.end = end;
        return this;
    }

    /** Example: Hello */
    public String word;

    public WordTimingsUnit word(String word) {
        this.word = word;
        return this;
    }
}
