package com.visuality.wordy.tools;

import com.visuality.wordy.types.TextSegment;

public class SegmentFinder {

    private String sourceText;

    public String getSourceText() {
        return this.sourceText;
    }

    public SegmentFinder(
            String sourceText
    ) {
        super();
        this.sourceText = sourceText;
    }

    public String getSubstringBeforeSegment(TextSegment segment) {
        int startIndex = 0;

        if (startIndex >= segment.getStartIndex()) {
            return "";
        }

        int endIndex = segment.getStartIndex() - 1;

        return this.sourceText.substring(
                startIndex,
                endIndex + 1
        );
    }

    public String getSubstringFromSegment(TextSegment segment) {
        return this.sourceText.substring(
                segment.getStartIndex(),
                segment.getEndIndex() + 1
        );
    }

    public String getSubstringAfterSegment(TextSegment segment) {
        int startIndex = segment.getEndIndex() + 1;

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
