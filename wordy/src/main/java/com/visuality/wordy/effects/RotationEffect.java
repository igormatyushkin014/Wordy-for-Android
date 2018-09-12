package com.visuality.wordy.effects;

import com.visuality.wordy.types.TextRotation;

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
        // TODO: Implement method.

        switch (textRotation) {
            case NORMAL:
                return new String(sourceText);
            case UPSIDE_DOWN:
                return new String(sourceText);
            case INVERTED:
                return new String(sourceText);
            default:
                return new String(sourceText);
        }
    }
}
