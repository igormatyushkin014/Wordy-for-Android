package com.visuality.wordy.tools;

import com.visuality.wordy.effects.Effect;

import java.util.ArrayList;

public class TextBuilder {

    private String sourceText;

    private ArrayList<Effect> effects;

    public TextBuilder(
            String sourceText
    ) {
        super();

        this.sourceText = sourceText;
        this.effects = new ArrayList<>();
    }

    public TextBuilder add(Effect effect) {
        this.effects.add(
                effect
        );
        return this;
    }

    public String build() {
        String resultText = new String(this.sourceText);

        for (Effect effect : this.effects) {
            resultText = effect.getFilteredText(
                    resultText
            );
        }

        return resultText;
    }
}
