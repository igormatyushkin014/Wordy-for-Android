package com.visuality.wordy.types;

import com.visuality.wordy.effects.Effect;

public class TextChange {

    private Effect effect;

    public Effect getEffect() {
        return this.effect;
    }

    private TextSegment segment;

    public TextSegment getSegment() {
        return this.segment;
    }

    public TextChange(
            Effect effect,
            TextSegment segment
    ) {
        super();

        this.effect = effect;
        this.segment = segment;
    }
}
