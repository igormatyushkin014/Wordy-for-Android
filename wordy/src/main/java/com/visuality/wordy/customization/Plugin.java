package com.visuality.wordy.customization;

public abstract class Plugin {

    private String sourceText;

    public String getSourceText() {
        return this.sourceText;
    }

    public Plugin(
            String sourceText
    ) {
        super();

        this.sourceText = sourceText;
    }

    public abstract String getResult();
}
