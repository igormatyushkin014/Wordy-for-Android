package com.visuality.wordy.data;

import java.util.ArrayList;
import java.util.Arrays;

public class RotationStore {

    private TextRotationRule[] rules;

    public RotationStore() {
        super();

        ArrayList<TextRotationRule> mergedRules = new ArrayList<>();
        mergedRules.addAll(
                Arrays.asList(
                        this.generateRulesForEnglish()
                )
        );
        mergedRules.addAll(
                Arrays.asList(
                        this.generateRulesForRussian()
                )
        );
        mergedRules.addAll(
                Arrays.asList(
                        this.generateRulesForSigns()
                )
        );

        this.rules = mergedRules.toArray(
                new TextRotationRule[] {}
        );
    }

    private TextRotationRule[] generateRulesForEnglish() {
        return new TextRotationRule[] {
                new TextRotationRule.Builder()
                        .setNormal("a")
                        .setRotated("ɐ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("b")
                        .setRotated("q")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("c")
                        .setRotated("ɔ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("d")
                        .setRotated("р")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("e")
                        .setRotated("ǝ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("f")
                        .setRotated("ɟ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("g")
                        .setRotated("ƃ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("h")
                        .setRotated("ɥ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("i")
                        .setRotated("ı")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("j")
                        .setRotated("ɾ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("k")
                        .setRotated("ʞ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("l")
                        .setRotated("l")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("m")
                        .setRotated("ш")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("n")
                        .setRotated("u")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("o")
                        .setRotated("о")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("p")
                        .setRotated("d")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("q")
                        .setRotated("ь")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("r")
                        .setRotated("ɹ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("s")
                        .setRotated("s")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("t")
                        .setRotated("ʇ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("u")
                        .setRotated("п")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("v")
                        .setRotated("л")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("w")
                        .setRotated("м")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("x")
                        .setRotated("x")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("y")
                        .setRotated("ʎ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("z")
                        .setRotated("z")
                        .build()
        };
    }

    private TextRotationRule[] generateRulesForRussian() {
        return new TextRotationRule[] {
                new TextRotationRule.Builder()
                        .setNormal("а")
                        .setRotated("ɐ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("б")
                        .setRotated("ƍ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("в")
                        .setRotated("ʚ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("г")
                        .setRotated("ɹ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("д")
                        .setRotated("ɓ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("е")
                        .setRotated("ǝ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ё")
                        .setRotated("ǝ̤")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ж")
                        .setRotated("ж")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("з")
                        .setRotated("ε")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("и")
                        .setRotated("и")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("й")
                        .setRotated("n̯")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("к")
                        .setRotated("ʞ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("л")
                        .setRotated("v")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("м")
                        .setRotated("w")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("н")
                        .setRotated("н")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("о")
                        .setRotated("o")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("п")
                        .setRotated("u")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("р")
                        .setRotated("d")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("с")
                        .setRotated("ɔ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("т")
                        .setRotated("ɯ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("у")
                        .setRotated("ʎ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ф")
                        .setRotated("ȸ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("х")
                        .setRotated("х")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ц")
                        .setRotated("ǹ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ч")
                        .setRotated("Һ")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ш")
                        .setRotated("m")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("щ")
                        .setRotated("m")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ъ")
                        .setRotated("q")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ы")
                        .setRotated("ıq")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ь")
                        .setRotated("q")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("э")
                        .setRotated("є")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("ю")
                        .setRotated("oı")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("я")
                        .setRotated("ʁ")
                        .build()
        };
    }

    private TextRotationRule[] generateRulesForSigns() {
        return new TextRotationRule[] {
                new TextRotationRule.Builder()
                        .setNormal(".")
                        .setRotated("˙")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal(",")
                        .setRotated("‘")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("'")
                        .setRotated(",")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("!")
                        .setRotated("¡")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("?")
                        .setRotated("¿")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("/")
                        .setRotated("/")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("\\")
                        .setRotated("\\")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("<")
                        .setRotated(">")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal(">")
                        .setRotated("<")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("(")
                        .setRotated(")")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal(")")
                        .setRotated("(")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("[")
                        .setRotated("]")
                        .build(),
                new TextRotationRule.Builder()
                        .setNormal("]")
                        .setRotated("[")
                        .build()
        };
    }

    public int getRuleCount() {
        return this.rules.length;
    }

    public TextRotationRule getRuleByIndex(int index) {
        return this.rules[index];
    }
}
