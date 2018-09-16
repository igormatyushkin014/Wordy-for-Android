package com.visuality.wordy.bridge;

import com.visuality.wordy.tools.EffectManager;
import com.visuality.wordy.tools.TransliterationManager;
import com.visuality.wordy.types.Language;

public class Wordy {

    public static EffectManager effects(
            String sourceText
    ) {
        return new EffectManager(
                sourceText
        );
    }

    public static TransliterationManager transliterate(
            Language from,
            Language to
    ) {
        return new TransliterationManager(
                from,
                to
        );
    }
}
