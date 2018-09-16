package com.visuality.wordy.types;

import com.visuality.wordy.effects.Effect;

public class TextChange {

    private Effect effect;

    public Effect getEffect() {
        return this.effect;
    }

    private SubstringLocation location;

    public SubstringLocation getLocation() {
        return this.location;
    }

    public TextChange(
            Effect effect,
            SubstringLocation location
    ) {
        super();

        this.effect = effect;
        this.location = location;
    }
}
