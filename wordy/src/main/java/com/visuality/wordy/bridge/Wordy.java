package com.visuality.wordy.bridge;

import com.visuality.wordy.tools.EffectManager;

public class Wordy {

    public static EffectManager effects(
            String sourceText
    ) {
        return new EffectManager(
                sourceText
        );
    }
}
