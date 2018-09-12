package com.visuality.wordy.effects;

public abstract class Effect {

    public Effect() {
        super();
    }

    public abstract String getFilteredText(String sourceText);
}
