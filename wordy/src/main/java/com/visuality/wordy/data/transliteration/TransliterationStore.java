package com.visuality.wordy.data.transliteration;

import com.visuality.wordy.types.Language;

public class TransliterationStore {

    private static final TransliterationRule[] ENGLISH_TO_RUSSIAN_RULES = new TransliterationRule[] {

            // 5 letters
            new TransliterationRule.Builder()
                    .setReplaceable("aught")
                    .setReplacement("от")
                    .build(),

            // 4 letters
            new TransliterationRule.Builder()
                    .setReplaceable("ould")
                    .setReplacement("уд")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ound")
                    .setReplacement("аунд")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("eigh")
                    .setReplacement("эй")
                    .build(),

            // 3 letters
            new TransliterationRule.Builder()
                    .setReplaceable("igh")
                    .setReplacement("ай")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("eer")
                    .setReplacement("иа")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("our")
                    .setReplacement("ауэ")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("oor")
                    .setReplacement("о")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("wor")
                    .setReplacement("ё")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("air")
                    .setReplacement("эа")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("oar")
                    .setReplacement("о")
                    .build(),

            // 2 letters
            new TransliterationRule.Builder()
                    .setReplaceable("ee")
                    .setReplacement("и")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ea")
                    .setReplacement("и")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("oo")
                    .setReplacement("у")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("th")
                    .setReplacement("т")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("sh")
                    .setReplacement("ш")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ch")
                    .setReplacement("ч")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ph")
                    .setReplacement("ф")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ck")
                    .setReplacement("к")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ng")
                    .setReplacement("нг")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("wh")
                    .setReplacement("в")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("wr")
                    .setReplacement("р")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("qu")
                    .setReplacement("кв")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("all")
                    .setReplacement("ол")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ai")
                    .setReplacement("эй")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ay")
                    .setReplacement("эй")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("oi")
                    .setReplacement("ой")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("oy")
                    .setReplacement("ой")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ow")
                    .setReplacement("оу")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ou")
                    .setReplacement("оу")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ew")
                    .setReplacement("ю")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("aw")
                    .setReplacement("о")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("wa")
                    .setReplacement("во")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("au")
                    .setReplacement("о")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("gh")
                    .setReplacement("ф")
                    .build(),

            // 1 letter
            new TransliterationRule.Builder()
                    .setReplaceable("a")
                    .setReplacement("э")
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
                    .setReplacement("а")
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
                    .setReplacement("и")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("z")
                    .setReplacement("з")
                    .build()
    };

    private static final TransliterationRule[] RUSSIAN_TO_ENGLISH_RULES = new TransliterationRule[] {

            // 1 letter
            new TransliterationRule.Builder()
                    .setReplaceable("а")
                    .setReplacement("a")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("б")
                    .setReplacement("b")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("в")
                    .setReplacement("v")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("г")
                    .setReplacement("g")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("д")
                    .setReplacement("d")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("е")
                    .setReplacement("e")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ё")
                    .setReplacement("yo")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ж")
                    .setReplacement("zh")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("з")
                    .setReplacement("z")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("и")
                    .setReplacement("i")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("й")
                    .setReplacement("y")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("к")
                    .setReplacement("k")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("л")
                    .setReplacement("l")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("м")
                    .setReplacement("m")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("н")
                    .setReplacement("n")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("о")
                    .setReplacement("o")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("п")
                    .setReplacement("p")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("р")
                    .setReplacement("r")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("с")
                    .setReplacement("s")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("т")
                    .setReplacement("t")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("у")
                    .setReplacement("u")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ф")
                    .setReplacement("f")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("х")
                    .setReplacement("kh")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ц")
                    .setReplacement("ts")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ч")
                    .setReplacement("ch")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ш")
                    .setReplacement("sh")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("щ")
                    .setReplacement("sch")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ъ")
                    .setReplacement("")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ы")
                    .setReplacement("y")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ь")
                    .setReplacement("'")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("э")
                    .setReplacement("e")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("ю")
                    .setReplacement("yu")
                    .build(),
            new TransliterationRule.Builder()
                    .setReplaceable("я")
                    .setReplacement("ya")
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
                        return RUSSIAN_TO_ENGLISH_RULES;
                    case RUSSIAN:
                        return new TransliterationRule[] {};
                }
        }

        return new TransliterationRule[] {};
    }
}
