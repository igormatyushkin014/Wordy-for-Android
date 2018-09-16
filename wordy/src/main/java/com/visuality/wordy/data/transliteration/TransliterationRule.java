package com.visuality.wordy.data.transliteration;

public class TransliterationRule {

    private String replaceable;

    public String getReplaceable() {
        return this.replaceable;
    }

    private String replacement;

    public String getReplacement() {
        return this.replacement;
    }

    public TransliterationRule(
            String replaceable,
            String replacement
    ) {
        super();

        this.replaceable = replaceable;
        this.replacement = replacement;
    }
}
