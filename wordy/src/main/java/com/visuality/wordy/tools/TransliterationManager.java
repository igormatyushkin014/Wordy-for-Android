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
            if (rule.getReplaceable().length() == 1) {
                resultText = resultText.replace(
                        new EffectManager(rule.getReplaceable())
                                .apply(new CaseEffect(TextCase.ALL_UPPER))
                                .getResult(),
                        new EffectManager(rule.getReplacement())
                                .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                                .getResult()
                );
            } else {
                resultText = resultText.replace(
                        new EffectManager(rule.getReplaceable())
                                .apply(new CaseEffect(TextCase.ALL_UPPER))
                                .getResult(),
                        new EffectManager(rule.getReplacement())
                                .apply(new CaseEffect(TextCase.ALL_UPPER))
                                .getResult()
                );

                resultText = resultText.replace(
                        new EffectManager(rule.getReplaceable())
                                .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                                .getResult(),
                        new EffectManager(rule.getReplacement())
                                .apply(new CaseEffect(TextCase.FIRST_UPPER_NEXT_LOWER))
                                .getResult()
                );

                resultText = resultText.replace(
                        new EffectManager(rule.getReplaceable())
                                .apply(new CaseEffect(TextCase.FIRST_LOWER_NEXT_UPPER))
                                .getResult(),
                        new EffectManager(rule.getReplacement())
                                .apply(new CaseEffect(TextCase.FIRST_LOWER_NEXT_UPPER))
                                .getResult()
                );
            }

            resultText = resultText.replace(
                    new EffectManager(rule.getReplaceable())
                            .apply(new CaseEffect(TextCase.ALL_LOWER))
                            .getResult(),
                    new EffectManager(rule.getReplacement())
                            .apply(new CaseEffect(TextCase.ALL_LOWER))
                            .getResult()
            );
        }

        return resultText;
    }
}
