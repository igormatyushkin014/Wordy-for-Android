package com.visuality.wordy.tools;

import com.visuality.wordy.types.SubstringLocation;

class SubstringFinder {

    private String sourceText;

    public String getSourceText() {
        return this.sourceText;
    }

    public SubstringFinder(
            String sourceText
    ) {
        super();
        this.sourceText = sourceText;
    }

    public String getSubstringBefore(SubstringLocation location) {
        int startIndex = 0;

        if (startIndex >= location.getStartIndex()) {
            return "";
        }

        int endIndex = location.getStartIndex() - 1;

        return this.sourceText.substring(
                startIndex,
                endIndex + 1
        );
    }

    public String getSubstringFrom(SubstringLocation location) {
        return this.sourceText.substring(
                location.getStartIndex(),
                location.getEndIndex() + 1
        );
    }

    public String getSubstringAfter(SubstringLocation location) {
        int startIndex = location.getEndIndex() + 1;

        if (startIndex >= this.sourceText.length()) {
            return "";
        }

        int endIndex = this.sourceText.length() - 1;

        return this.sourceText.substring(
                startIndex,
                endIndex + 1
        );
    }
}
