package com.visuality.wordy.data.transliteration;

import com.visuality.wordy.types.Language;

public class TransliterationStore {

    private static final TransliterationRule[] ENGLISH_TO_RUSSIAN_RULES = new TransliterationRule[] {
            new TransliterationRule.Builder()
                    .setReplaceable("a")
                    .setReplacement("а")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("b")
                    .setReplacement("б")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("c")
                    .setReplacement("к")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("d")
                    .setReplacement("д")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("e")
                    .setReplacement("э")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("f")
                    .setReplacement("ф")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("g")
                    .setReplacement("г")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("h")
                    .setReplacement("х")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("i")
                    .setReplacement("и")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("j")
                    .setReplacement("дж")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("k")
                    .setReplacement("к")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("l")
                    .setReplacement("л")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("m")
                    .setReplacement("м")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("n")
                    .setReplacement("н")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("o")
                    .setReplacement("о")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("p")
                    .setReplacement("п")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("r")
                    .setReplacement("р")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("s")
                    .setReplacement("с")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("t")
                    .setReplacement("т")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("u")
                    .setReplacement("у")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("v")
                    .setReplacement("в")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("w")
                    .setReplacement("в")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("x")
                    .setReplacement("кс")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("y")
                    .setReplacement("ы")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("z")
                    .setReplacement("з")
                    .build()
    };

    public TransliterationStore() {
        super();
    }

    public TransliterationRule[] getRules(
            Language sourceLanguage,
            Language targetLanguage
    ) {
        switch (sourceLanguage) {
            case ENGLISH:
                switch (targetLanguage) {
                    case ENGLISH:
                        return new TransliterationRule[] {};
                    case RUSSIAN:
                        return ENGLISH_TO_RUSSIAN_RULES;
                }
            case RUSSIAN:
                switch (targetLanguage) {
                    case ENGLISH:
                        // TODO: Implement English to Russian transliteration
                        return new TransliterationRule[] {};
                    case RUSSIAN:
                        return new TransliterationRule[] {};
                }
        }

        return new TransliterationRule[] {};
    }
}
