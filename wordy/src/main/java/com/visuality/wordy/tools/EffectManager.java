package com.visuality.wordy.tools;

import com.visuality.wordy.effects.Effect;
import com.visuality.wordy.types.TextChange;
import com.visuality.wordy.types.SubstringLocation;

import java.util.ArrayList;

public class EffectManager {

    private String sourceText;

    private ArrayList<TextChange> changes;

    public EffectManager(
            String sourceText
    ) {
        super();

        this.sourceText = sourceText;
        this.changes = new ArrayList<>();
    }

    public EffectManager apply(Effect effect) {
        SubstringLocation segment = new SubstringLocation(
                0,
                this.sourceText.length() - 1
        );
        TextChange change = new TextChange(
                effect,
                segment
        );
        this.changes.add(
                change
        );
        return this;
    }

    public EffectManager apply(
            Effect effect,
            int startIndex,
            int endIndex
    ) {
        SubstringLocation location = new SubstringLocation(
                startIndex,
                endIndex
        );
        TextChange change = new TextChange(
                effect,
                location
        );
        this.changes.add(
                change
        );
        return this;
    }

    public String getResult() {
        String resultText = new String(this.sourceText);

        for (TextChange change : this.changes) {
            SubstringFinder substringFinder = new SubstringFinder(
                    resultText
            );

            String substringBeforeSelectedLocation = substringFinder.getSubstringBefore(
                    change.getLocation()
            );
            String substringFromSelectedLocation = substringFinder.getSubstringFrom(
                    change.getLocation()
            );
            String substringAfterSelectedLocation = substringFinder.getSubstringAfter(
                    change.getLocation()
            );

            String filteredSubstringFromSelectedLocation = change.getEffect().getFilteredText(
                    substringFromSelectedLocation
            );

            resultText = substringBeforeSelectedLocation
                    + filteredSubstringFromSelectedLocation
                    + substringAfterSelectedLocation;
        }

        return resultText;
    }
}
