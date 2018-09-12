package com.visuality.wordy.effects;

public class CaseEffect extends Effect {

    private CaseChange caseChange;

    public CaseEffect(CaseChange caseChange) {
        super();
        this.caseChange = caseChange;
    }

    @Override
    public String getFilteredText(String sourceText) {
        switch (this.caseChange) {
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

    public enum CaseChange {
        ALL_UPPER,
        ALL_LOWER,
        FIRST_UPPER_NEXT_LOWER,
        FIRST_LOWER_NEXT_UPPER
    }
}
