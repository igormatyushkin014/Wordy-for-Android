package com.visuality.wordy.bridge;

import com.visuality.wordy.tools.TextFilter;

public class Wordy {

    public static TextFilter effects(
            String sourceText
    ) {
        return new TextFilter(
                sourceText
        );
    }
}
