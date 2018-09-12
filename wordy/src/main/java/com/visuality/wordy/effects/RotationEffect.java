package com.visuality.wordy.effects;

import com.visuality.wordy.data.RotationStore;
import com.visuality.wordy.types.TextRotation;
import com.visuality.wordy.types.TextRotationRule;

public class RotationEffect extends Effect {

    private TextRotation textRotation;

    public RotationEffect(
            TextRotation textRotation
    ) {
        super();
        this.textRotation = textRotation;
    }

    @Override
    public String getFilteredText(String sourceText) {
        final StringBuilder filteredTextBuilder = new StringBuilder();
        final int textLength = sourceText.length();

        RotationStore rotationStore = new RotationStore();
        int ruleCount = rotationStore.getRuleCount();

        for (int letterIndex = 0; letterIndex < textLength; letterIndex++) {
            final String sourceLetter = sourceText.substring(
                    letterIndex,
                    letterIndex + 1
            );
            boolean isUppercase = Character.isUpperCase(
                    sourceLetter.toCharArray()[0]
            );
            String filteredLetter = new String(sourceLetter);

            for (int ruleIndex = 0; ruleIndex < ruleCount; ruleIndex++) {
                TextRotationRule rule = rotationStore.getRuleByIndex(
                        ruleIndex
                );

                boolean isNormal = sourceLetter.toLowerCase().equals(
                        rule.getNormal().toLowerCase()
                );
                boolean isRotated = sourceLetter.toLowerCase().equals(
                        rule.getRotated().toLowerCase()
                );

                switch (this.textRotation) {
                    case NORMAL:
                        if (isRotated) {
                            filteredLetter = rule.getNormal();
                        }
                        break;
                    case UPSIDE_DOWN:
                        if (isNormal) {
                            filteredLetter = rule.getRotated();
                        }
                        break;
                    case INVERTED:
                        if (isNormal) {
                            filteredLetter = rule.getRotated();
                        } else if (isRotated) {
                            filteredLetter = rule.getNormal();
                        }
                        break;
                }

                boolean foundAppropriateRule = isNormal || isRotated;

                if (foundAppropriateRule) {
                    break;
                }
            }

            filteredLetter = isUppercase
                    ? filteredLetter.toUpperCase()
                    : filteredLetter.toLowerCase();

            filteredTextBuilder.append(
                    filteredLetter
            );
        }

        return filteredTextBuilder.toString();
    }
}
