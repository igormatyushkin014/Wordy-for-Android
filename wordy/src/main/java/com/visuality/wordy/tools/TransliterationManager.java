package com.visuality.wordy.tools;

import com.visuality.wordy.types.Language;

public class TransliterationManager {

    private Language sourceLanguage;

    public Language getSourceLanguage() {
        return this.sourceLanguage;
    }

    private Language targetLanguage;

    public Language getTargetLanguage() {
        return this.targetLanguage;
    }

    public TransliterationManager(
            Language sourceLanguage,
            Language targetLanguage
    ) {
        super();

        this.sourceLanguage = sourceLanguage;
        this.targetLanguage = targetLanguage;
    }

    public String getText(String sourceText) {
        return "";
    }
}
