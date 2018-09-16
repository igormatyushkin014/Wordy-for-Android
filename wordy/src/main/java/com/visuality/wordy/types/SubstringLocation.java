package com.visuality.wordy.types;

public class SubstringLocation {

    private int startIndex;

    public int getStartIndex() {
        return this.startIndex;
    }

    private int endIndex;

    public int getEndIndex() {
        return this.endIndex;
    }

    public SubstringLocation(
            int startIndex,
            int endIndex
    ) {
        super();

        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }
}
