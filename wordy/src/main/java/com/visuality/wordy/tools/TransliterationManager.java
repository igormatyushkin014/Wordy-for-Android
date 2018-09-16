package com.visuality.wordy.tools;

import com.visuality.wordy.data.transliteration.TransliterationRule;
import com.visuality.wordy.data.transliteration.TransliterationStore;
import com.visuality.wordy.effects.CaseEffect;
import com.visuality.wordy.types.Language;
import com.visuality.wordy.types.TextCase;

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
        TransliterationRule[] rules = new TransliterationStore().getRules(
                this.sourceLanguage,
                this.targetLanguage
        );

        String resultText = new String(sourceText);

        for (TransliterationRule rule : rules) {
            resultText = resultText.replace(
                    new EffectManager(rule.getReplaceable())
                            .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                            .getResult(),
                    new EffectManager(rule.getReplacement())
                            .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                            .getResult()
            );

            resultText = resultText.replace(
                    rule.getReplaceable().toUpperCase(),
                    new EffectManager(rule.getReplacement())
                            .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                            .getResult()
            );

            resultText = resultText.replace(
                    rule.getReplaceable().toUpperCase(),
                    rule.getReplacement().toUpperCase()
            );

            resultText = resultText.replace(
                    rule.getReplaceable(),
                    rule.getReplacement()
            );
        }

        return resultText;
    }
}
