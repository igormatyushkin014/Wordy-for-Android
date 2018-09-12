package com.visuality.wordy.types;

public class TextSegment {

    private int startIndex;

    public int getStartIndex() {
        return this.startIndex;
    }

    private int endIndex;

    public int getEndIndex() {
        return this.endIndex;
    }

    public TextSegment(
            int startIndex,
            int endIndex
    ) {
        super();

        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}
