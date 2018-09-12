package com.visuality.wordy.effects;

import com.visuality.wordy.types.TextCase;

public class CaseEffect extends Effect {

    private TextCase textCase;

    public CaseEffect(TextCase textCase) {
        super();
        this.textCase = textCase;
    }

    @Override
    public String getFilteredText(String sourceText) {
        switch (this.textCase) {
            case ALL_UPPER:
                return sourceText.toUpperCase();
            case ALL_LOWER:
                return sourceText.toLowerCase();
            case FIRST_UPPER_NEXT_LOWER:
                if (sourceText.isEmpty()) {
                    return "";
                } else {
                    String firstLetter = sourceText.substring(0, 1);
                    String otherText = sourceText.substring(1);

                    return String.format(
                            "%s%s",
                            firstLetter.toUpperCase(),
                            otherText.toLowerCase()
                    );
                }
            case FIRST_LOWER_NEXT_UPPER:
                if (sourceText.isEmpty()) {
                    return "";
                } else {
                    String firstLetter = sourceText.substring(0, 1);
                    String otherText = sourceText.substring(1);

                    return String.format(
                            "%s%s",
                            firstLetter.toLowerCase(),
                            otherText.toUpperCase()
                    );
                }
        }

        return sourceText;
    }
}
